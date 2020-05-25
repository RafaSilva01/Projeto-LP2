package br.edu.udf;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        DBLoja banco = new DBLoja();

        Produto produto = new Produto();
        produto.setNome("GTA 5");
        produto.setCodigo("123");
        produto.setPrecoOriginal(119.89);

        Produto produto2 = new Produto("Call of Duty: Modern Warfare", "1234", 95.93);

        banco.cadastrarProduto(produto);
        banco.cadastrarProduto(produto2);

        Produto retorno = banco.buscaProdutoPorCodigo("12345");
        System.out.println("retorno >>>> " + retorno);

        System.out.println("============================");
        System.out.println("========Listagem 01=========");
        System.out.println("============================");
        ArrayList<Produto> produtosCadastrados = DBLoja.getProdutos();
        for (Produto produtoCadastrado : produtosCadastrados) {
            System.out.println(produtoCadastrado.toString());
        }

        System.out.println("============================");
        System.out.println("========Listagem 02=========");
        System.out.println("============================");
        banco.listaProdutos();

    }
}
