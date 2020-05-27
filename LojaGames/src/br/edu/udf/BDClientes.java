package br.edu.udf;
import java.util.ArrayList;

public class BDClientes {
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
        //System.out.println("Cliente inexistente.");
        return null;
    }

    public void listaClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    public boolean cadastrarCliente(Cliente clienteRecebido) {
        boolean retorno = false;

        if (validarCliente(clienteRecebido)==true) {
            if (clientes.add(clienteRecebido)) {
                retorno = true;
                System.out.println("Cliente cadastrado com sucesso!");
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

        if (validarCliente(clienteRecebido)==true) {
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

    public boolean validarCliente(Cliente clienteRecebido) {
        boolean retorno = false;

        boolean isNomeValid = false;
        boolean isCPFValid = false;
        boolean isUsuarioValid = false;
        boolean isSenhaValid = false;
        boolean isEnderecoValid = false;
        boolean isEmailValid = false;
        boolean isClienteExistente = false;

        isNomeValid = uteis.isNomeValid(clienteRecebido.getNome());
        isCPFValid = uteis.isCPFValid(clienteRecebido.getCpf());
        isUsuarioValid = uteis.isNomeValid(clienteRecebido.getUsuario());
        isSenhaValid = uteis.isNomeValid(clienteRecebido.getSenha());
        isEnderecoValid = uteis.isNomeValid(clienteRecebido.getEndereco());
        isEmailValid = uteis.isEmailValid(clienteRecebido.getEmail());

        if (buscaClientePorCPF(clienteRecebido.getCpf()) == null);{
            isClienteExistente = true;
        }

        if (isNomeValid && isCPFValid && isUsuarioValid && isSenhaValid && isEnderecoValid && isEmailValid && isClienteExistente) {
            retorno = true;
        }else{
            System.out.println("Usuaro com informacao incorreta");
            System.out.println("Itens incorretos: ");
            if(isNomeValid == false)  System.out.println("Nome");
            if(isCPFValid == false)  System.out.println("CPF");
            if(isUsuarioValid == false)  System.out.println("Usuario");
            if(isSenhaValid == false)  System.out.println("Senha");
            if(isEnderecoValid == false)  System.out.println("Endereco");
            if(isEmailValid == false)  System.out.println("Email");
        }

        return retorno;
    }


}