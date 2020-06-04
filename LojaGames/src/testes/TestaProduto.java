package testes;

import br.edu.udf.DBProdutos;
import br.edu.udf.Produto;

public class TestaProduto {

    public static void main(String[] args) {
        DBProdutos dbProdutos = new DBProdutos();

        //Novo produto criado
        Produto produto = new Produto();
        produto.setNome("GTA 5");
        produto.setCodigo("001");
        produto.setPrecoOriginal(50.01);
        produto.aumentarQuantidade(10);

        //Novo produto criado 2
        Produto produto1 = new Produto();
        produto1.setNome("The Last of Us");
        produto1.setCodigo("002");
        produto1.setPrecoOriginal(10.20);
        produto1.aumentarQuantidade(5);

        //Novo produto criado 3
        Produto produto2 = new Produto();
        produto2.setNome("Destiny");
        produto2.setCodigo("003");
        produto2.setPrecoOriginal(80.03);
        produto2.aumentarQuantidade(7);

        //Cadastra produto Produto
        dbProdutos.cadastrarProduto(produto);
        dbProdutos.cadastrarProduto(produto1);
        dbProdutos.cadastrarProduto(produto2);
        dbProdutos.listaProdutos();

        //Edita Produto
        //Novo produto criado 3, com o codigo de outro produto no caso, produto 1
        Produto produto3 = new Produto();
        produto3.setNome("Medal of Honor Frontline");
        produto3.setCodigo("001");
        produto3.setPrecoOriginal(60.00);
        produto3.aumentarQuantidade(1);

        //Alterando as informações do produto 1, usando código desse produto.
        dbProdutos.editarProduto(produto3);
        dbProdutos.buscaProdutoPorCodigo("001");
        dbProdutos.listaProdutos();

        //Excluir
        dbProdutos.excluirProduto("001");
        dbProdutos.listaProdutos();


    }
}

