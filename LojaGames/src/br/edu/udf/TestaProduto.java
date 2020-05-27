package br.edu.udf;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaProduto {

    public static void main(String[] args) {
        DBProdutos dbProdutos = new DBProdutos();

        Produto produto = new Produto();
        produto.setNome("GTA 5");
        produto.setCodigo("123");
        produto.setPrecoOriginal(50.01);
        produto.aumentarQuantidade(10);

        //Cadastra produto Produto
        dbProdutos.cadastrarProduto(produto);
        dbProdutos.listaProdutos();

        //altera Produto
        Produto produto1 = new Produto("1234", "Call of Duty: Modern Warfare", 100.02);
        dbProdutos.editarProduto();

        //Excluir
        System.out.println(dbProdutos.excluirProduto("123"));
        dbProdutos.listaProdutos();


    }
}

