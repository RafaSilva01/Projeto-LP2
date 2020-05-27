package testes;

import br.edu.udf.*;

public class testePagamento {
    public static void main(String[] args) {
        DBProdutos dbProdutos = new DBProdutos();
        DBClientes dbClientes = new DBClientes();
        DBLoja dbloja = new DBLoja();

        Produto produto = new Produto();
        produto.setNome("GTA 5");
        produto.setCodigo("123");
        produto.setPrecoOriginal(50.01);
        produto.aumentarQuantidade(10);
        dbProdutos.cadastrarProduto(produto);


        Produto produto2 = new Produto("1234", "Call of Duty: Modern Warfare", 100.02);
        produto2.aumentarQuantidade(1);
        dbProdutos.cadastrarProduto(produto2);

        Cliente cliente = new Cliente("Joss", "70150465122", "acula", "decaelgomes@gmail.com", 5000.00);
        cliente.carrinho.adicionarProduto(produto.getCodigo(), 3);
        cliente.carrinho.removerProduto(produto.getCodigo());
        cliente.carrinho.adicionarProduto(produto2.getCodigo(), 1);
        dbClientes.cadastrarCliente(cliente);
        dbloja.finalizarCompra(cliente.getCpf());

        cliente.carrinho.adicionarProduto(produto.getCodigo(), 1);
        dbloja.finalizarCompra(cliente.getCpf());

        Cliente clienteAtualizado = dbClientes.buscaClientePorCPF(cliente.getCpf());
        clienteAtualizado.listaComprovantes();
    }
}
