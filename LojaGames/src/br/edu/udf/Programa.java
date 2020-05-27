package br.edu.udf;

public class Programa {
    public static void main(String[] args) {
        DBProdutos dbProdutos = new DBProdutos();
        DBClientes dbClientes = new DBClientes();

        Produto produto = new Produto();

        produto.setNome("GTA 5");
        produto.setCodigo("123");
        produto.setPrecoOriginal(119.89);
        produto.aumentarQuantidade(10);
        dbProdutos.cadastrarProduto(produto);


        Produto produto2 = new Produto("1234", "Call of Duty: Modern Warfare", 95.93);
        dbProdutos.cadastrarProduto(produto2);

        Cliente client = new Cliente("Joss", "70150465122", "decaelgomes", "123456", "acula", "decaelgomes@gmail.com");
        dbClientes.cadastrarCliente(client);

        Cliente client2 = new Cliente("Carlos", "70150465112", "decaelgomes", "123456", "acula", "carlos@gmail.com");
        dbClientes.cadastrarCliente(client2);
        dbClientes.listaClientes();

        System.out.println("Teste de busca de cliente por CPF");
        Cliente retornoBuscaPorCPF = dbClientes.buscaClientePorCPF("1234");
        System.out.println(retornoBuscaPorCPF);

//        Produto retorno = dbProdutos.buscaProdutoPorCodigo("12345");
//        System.out.println("retorno >>>> " + retorno);

//        System.out.println("============================");
//        System.out.println("========Listagem 01=========");
//        System.out.println("============================");
//        ArrayList<Produto> produtosCadastrados = DBProdutos.getProdutos();
//        for (Produto produtoCadastrado : produtosCadastrados) {
//            System.out.println(produtoCadastrado.toString());
//        }
//
//        System.out.println("============================");
//        System.out.println("========Listagem 02=========");
//        System.out.println("============================");
//        dbProdutos.listaProdutos();
//
//      dbProdutos.editarProduto(new Produto("123", "GTA 5 - PS4", 99.99));
//      dbProdutos.excluirProduto("123");
//      dbProdutos.listaProdutos();


    }
}
