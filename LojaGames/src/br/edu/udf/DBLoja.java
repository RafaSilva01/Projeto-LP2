package br.edu.udf;

public class DBLoja {
    private final DBClientes dbClientes = new DBClientes();
    private final DBProdutos dbProdutos = new DBProdutos();

    public boolean finalizarCompra(String CPF) {
        boolean retorno = false;

        Cliente cliente = dbClientes.buscaClientePorCPF(CPF);
        double totalCompra = cliente.carrinho.somaCarrinho();

        if (totalCompra < cliente.getSaldo()) {
            boolean isDiminuirEstoqueSucesso = false;
            boolean isAdicionarCompraSucesso = false;

            Comprovante comprovante = new Comprovante(cliente.getNome(), cliente.getCpf(), cliente.getEmail(), cliente.carrinho);
            isDiminuirEstoqueSucesso = dbProdutos.diminuirEstoque(cliente.carrinho);
            isAdicionarCompraSucesso = dbClientes.adicionarComprovante(comprovante, totalCompra);

            if (isAdicionarCompraSucesso && isDiminuirEstoqueSucesso) {
                System.out.println("Compra realizada com sucesso. Volte sempre!");
            }

        } else {
            System.out.println("Saldo insuficiente !");
        }
        return retorno;
    }

}
