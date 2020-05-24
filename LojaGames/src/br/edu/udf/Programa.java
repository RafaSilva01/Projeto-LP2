package br.edu.udf;

public class Programa {
    public static void main(String[] args) {
        // teste de cadastro de produtos
        DBLoja banco = new DBLoja();
        Produto produto = new Produto();
        produto.setNome("GTA 5");
        produto.setCodigo("0");
        produto.setPrecoOriginal(12.00);

        banco.cadastrarProduto(produto);
    }

}
