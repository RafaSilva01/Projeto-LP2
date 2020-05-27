package br.edu.udf;

import java.util.ArrayList;
import java.util.Scanner;

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
        //Produto produto1 = new Produto("1234", "Call of Duty: Modern Warfare", 100.02);
        //dbProdutos.editarProduto(produto);

        //Excluir
        System.out.println(dbProdutos.excluirProduto("001"));
        dbProdutos.listaProdutos();


    }
}

