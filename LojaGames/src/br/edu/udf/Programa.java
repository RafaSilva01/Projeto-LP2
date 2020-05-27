package br.edu.udf;

public class Programa {
    public static void main(String[] args) {
        DBProdutos dbProdutos = new DBProdutos();
        DBClientes dbClientes = new DBClientes();

        Produto produto = new Produto();
        Cliente cliente = new Cliente();

        produto.setNome("GTA 5");
        produto.setCodigo("123");
        produto.setPrecoOriginal(119.89);

        Produto produto2 = new Produto("1234", "Call of Duty: Modern Warfare", 95.93);

        dbProdutos.cadastrarProduto(produto);
        dbProdutos.cadastrarProduto(produto2);

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

        //TEste de inclusão de cliente tudo validado por CPF
        System.out.println("============================");
        System.out.println("========Teste de Cliente Cadastrado=========");
        System.out.println("============================");
        Cliente client = new Cliente("Joss", "78178569142", "decaelgomes", "123456", "acula", "decaelgomes@gmail.com");
        dbClientes.cadastrarCliente(client);

        System.out.println("Cadastro atualizado abaixo");
        Cliente client2 = new Cliente("Carlos", "78178569142", "decaelgomes", "123456", "acula", "carlos@gmail.com");
        dbClientes.editarCliente(client2);
        dbClientes.listaClientes();

    }
}
