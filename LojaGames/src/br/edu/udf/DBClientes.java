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

        if (validarCliente(clienteRecebido,false)) {
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
/*
        if (validarCliente(clienteRecebido,true)) {
            for (Cliente cliente : clientes) {
                if (cliente.getCpf() == clienteRecebido.getCpf()) {
                    retorno = true;
                }
            }
        }

        if (retorno) {
            this.excluirCliente(clienteRecebido.getCpf());
            this.cadastrarCliente(clienteRecebido);
        } else {
            System.out.println("Nao foi possivel editar as informacoes do cliente." +
                    "Verifique se o cliente ja foi cadastrado.");
        }
        return retorno;
*/

        if (validarCliente(clienteRecebido,true)==true){
            if(buscaClientePorCPF(clienteRecebido.getCpf())!=null){
                this.excluirCliente(clienteRecebido.getCpf());
                this.cadastrarCliente(clienteRecebido);
                retorno = true;
            }else {
                System.out.println("Nao foi possivel editar as informacoes do cliente." +
                        "Cliente nao cadastrado na base de dados");
            }
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

    public boolean validarCliente(Cliente clienteRecebido,boolean isEditarCliente) {
        boolean retorno = false;
        boolean isNomeValid = false;
        boolean isCPFValid = false;
        boolean isEnderecoValid = false;
        boolean isEmailValid = false;
        boolean isCPFUnico = false;

        System.out.println("Nota de teste - Editar Cliente? "+isEditarCliente);

        if (isEditarCliente){
            isNomeValid = uteis.isNomeValid(clienteRecebido.getNome());
            isCPFValid = uteis.isCPFValid(clienteRecebido.getCpf());
            isEnderecoValid = uteis.isNomeValid(clienteRecebido.getEndereco());
            isEmailValid = uteis.isEmailValid(clienteRecebido.getEmail());
            if (isNomeValid && isCPFValid && isEnderecoValid && isEmailValid) {
                retorno = true;
                System.out.println(clienteRecebido.getNome() + " foi cadastrado com sucesso !");
            } else {
                System.out.println("Itens incorretos: ");
                if (!isNomeValid) System.out.println("Nome");
                if (!isCPFValid) System.out.println("CPF");
                if (!isEnderecoValid) System.out.println("Endereco");
                if (!isEmailValid) System.out.println("Email");
            }
        }else{
            isNomeValid = uteis.isNomeValid(clienteRecebido.getNome());
            isCPFValid = uteis.isCPFValid(clienteRecebido.getCpf());
            isEnderecoValid = uteis.isNomeValid(clienteRecebido.getEndereco());
            isEmailValid = uteis.isEmailValid(clienteRecebido.getEmail());
            isCPFUnico = this.isCPFUnico(clienteRecebido.getCpf());

            if (isNomeValid && isCPFValid && isEnderecoValid && isEmailValid && isCPFUnico) {
                retorno = true;
                System.out.println(clienteRecebido.getNome() + " foi cadastrado com sucesso !");
            } else {
                System.out.println("Itens incorretos: ");
                if (!isNomeValid) System.out.println("Nome");
                if (!isCPFValid || !isCPFUnico) System.out.println("CPF");
                if (!isEnderecoValid) System.out.println("Endereco");
                if (!isEmailValid) System.out.println("Email");
            }
        }

        return retorno;
    }


    public boolean adicionarComprovante(Comprovante comprovante, double totalCompra) {
        boolean retorno = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == comprovante.getCpf()) {
                cliente.setSaldo(cliente.getSaldo() - totalCompra);
                cliente.adicionarComprovante(comprovante);
                cliente.carrinho = new Carrinho();
                retorno = true;
            }
        }
        return retorno;
    }
}