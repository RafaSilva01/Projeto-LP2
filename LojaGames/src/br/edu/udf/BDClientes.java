package br.edu.udf;
import java.util.ArrayList;

public class BDClientes {
    private static final ArrayList<Cliente> clientes = new ArrayList<>();

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public Cliente buscaClientePorCPF(String CPF) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == CPF) {
                return cliente;
            }
        }
        System.out.println("Cliente inexistente.");
        return null;
    }
    

    public boolean cadastrarCliente(Cliente cliente) {
        boolean retorno = false;
        boolean isPrecoOriginalValid = true;
        boolean isNomeValid = false;
        boolean isCodigoValid = false;

        isNomeValid = isNomeValid(cliente.setNome(nome);
        isPrecoOriginalValid = isPrecoOriginalValid(cliente.getPrecoOriginal());
        isCodigoValid = isCodigoValid(cliente.getCodigo());

        if (isNomeValid && isPrecoOriginalValid && isCodigoValid) {
            if (this.(cliente)) {
                retorno = true;
            }
        }

        return retorno;
       
    }
    
}