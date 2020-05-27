package br.edu.udf;

import java.util.ArrayList;

public class DBClientes {
    private static final ArrayList<Cliente> clientes = new ArrayList<>();
    private final Uteis uteis = new Uteis();

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscaClientePorCPF(String CPF) {

        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == CPF) {
                return cliente;
            }
        }
        return null;
    }

    public void listaClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    public boolean cadastrarCliente(Cliente clienteRecebido) {
        boolean retorno = false;

        if (validarCliente(clienteRecebido)) {
            if (clientes.add(clienteRecebido)) {
                retorno = true;
            }
        }
        return retorno;
    }

    public boolean excluirCliente(String CPF) {
        boolean retorno = false;
        Cliente clienteParaExcluir = buscaClientePorCPF(CPF);
        if (clienteParaExcluir != null) {
            if (clientes.remove(clienteParaExcluir)) {
                retorno = true;
            }
        } else {
            System.out.println("Nao foi possivel excluir o cliente.");
        }
        return retorno;
    }

    public boolean editarCliente(Cliente clienteRecebido) {
        boolean retorno = false;

        if (validarCliente(clienteRecebido) == true) {
            for (Cliente cliente : clientes) {
                if (cliente.getCpf() == clienteRecebido.getCpf()) {
                    retorno = true;
                }
            }
        }

        if (retorno == true) {
            this.excluirCliente(clienteRecebido.getCpf());
            this.cadastrarCliente(clienteRecebido);
        } else {
            System.out.println("Nao foi possivel editar as informacoes do cliente." +
                    "Verifique se o cliente ja foi cadastrado.");
        }
        return retorno;
    }

    private boolean isCPFUnico(String cpf) {
        boolean retorno = true;

        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                retorno = false;
            }
        }
        return retorno;
    }

    public boolean validarCliente(Cliente clienteRecebido) {
        boolean retorno = false;

        boolean isNomeValid = false;
        boolean isCPFValid = false;
        boolean isUsuarioValid = false;
        boolean isSenhaValid = false;
        boolean isEnderecoValid = false;
        boolean isEmailValid = false;
        boolean isCPFUnico = false;

        isNomeValid = uteis.isNomeValid(clienteRecebido.getNome());
        isCPFValid = uteis.isCPFValid(clienteRecebido.getCpf());
        isCPFUnico = this.isCPFUnico(clienteRecebido.getCpf());
        isUsuarioValid = uteis.isNomeValid(clienteRecebido.getUsuario());
        isSenhaValid = uteis.isNomeValid(clienteRecebido.getSenha());
        isEnderecoValid = uteis.isNomeValid(clienteRecebido.getEndereco());
        isEmailValid = uteis.isEmailValid(clienteRecebido.getEmail());


        if (isNomeValid && isCPFValid && isUsuarioValid && isSenhaValid && isEnderecoValid && isEmailValid && isCPFUnico) {
            retorno = true;
        } else {
            System.out.println("Usuaro com informacao incorreta");
            System.out.println("Itens incorretos: ");
            if (!isNomeValid) System.out.println("Nome");
            if (!isCPFValid || !isCPFUnico) System.out.println("CPF");
            if (!isUsuarioValid) System.out.println("Usuario");
            if (!isSenhaValid) System.out.println("Senha");
            if (!isEnderecoValid) System.out.println("Endereco");
            if (!isEmailValid) System.out.println("Email");
        }

        return retorno;
    }


}