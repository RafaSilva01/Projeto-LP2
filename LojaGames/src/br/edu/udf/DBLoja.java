package br.edu.udf;


// Essa classe deve ser utilizada para simular uma base de dados
public class DBLoja {
    private final DBClientes bancoClientes = new DBClientes();

    public boolean finalizarCompra(String CPF){
        boolean retorno = false;

        Cliente cliente = bancoClientes.buscaClientePorCPF(CPF);
        double totalCompra=cliente.carrinho.somaCarrinho();

        if (totalCompra < cliente.getSaldo()){
            System.out.println("Saldo ok");
        }else{
            System.out.println("Saldo insuficiente");
        }
        return retorno;
    }

}
