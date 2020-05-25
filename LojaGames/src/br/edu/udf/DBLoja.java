package br.edu.udf;

import java.util.ArrayList;

// Essa classe deve ser utilizada para simular uma base de dados
public class DBLoja {
    private static final ArrayList<Produto> produtos = new ArrayList<>();

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public Produto buscaProdutoPorCodigo(String codigoProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigoProduto) {
                return produto;
            }
        }
        System.out.println("Produto inexistente.");
        return null;
    }

    public void listaProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }

    private boolean salvarProduto(Produto produtoRecebido) {
        boolean retorno = false;
        boolean codigoExistente = false;

        for (Produto produto : produtos) {
            if (produto.getCodigo() == produtoRecebido.getCodigo()) {
                codigoExistente = true;
                System.out.println("O codigo do produto precisa ser unico.");
            }
        }

        if (codigoExistente == false) {
            if (produtos.add(produtoRecebido)) {
                retorno = true;
            }
        }

        return retorno;
    }

    public boolean cadastrarProduto(Produto produto) {
        boolean retorno = false;
        boolean isPrecoOriginalValid = true;
        boolean isNomeValid = true;
        boolean isCodigoValid = true;


        if (produto.getNome() != null || produto.getNome() != "") {
            isNomeValid = true;
        } else {
            System.out.println("O nome do produto esta invalido.");
        }

        if (produto.getPrecoOriginal() != null || produto.getPrecoOriginal() != 0.0) {
            isPrecoOriginalValid = true;
        } else {
            System.out.println("O preço original do produto esta invalido.");
        }

        if (produto.getCodigo() != null || produto.getCodigo() != "") {
            isNomeValid = true;
        } else {
            System.out.println("O codigo do produto esta invalido.");
        }

        if (isNomeValid && isPrecoOriginalValid && isCodigoValid) {
            if (this.salvarProduto(produto)) {
                retorno = true;
            }
        }

        return retorno;
    }

    public boolean excluirProduto(String codigoProduto) {
        boolean retorno = false;
        Produto produtoParaExcluir = buscaProdutoPorCodigo(codigoProduto);
        if (produtoParaExcluir != null) {
            if (produtos.remove(produtoParaExcluir)) {
                retorno = true;
            }
        } else {
            System.out.println("Nao foi possivel excluir o produto.");
        }
        return retorno;

    }
}
