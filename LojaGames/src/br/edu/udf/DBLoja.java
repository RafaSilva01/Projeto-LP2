package br.edu.udf;

import java.util.ArrayList;

// Essa classe deve ser utilizada para simular uma base de dados
public class DBLoja {
    private static final ArrayList<Produto> produtos = new ArrayList<>();

    public Produto buscaProdutoPorCodigo(String codigoProduto) {
        // TODO implementar corretamente
        return new Produto();
    }

    private boolean salvarProduto(Produto produtoRecebido) {
        boolean retorno = false;
        boolean codigoExistente = false;

        for (Produto produto : produtos) {
            if (produto.getCodigo() == produtoRecebido.getCodigo()) {
                codigoExistente = true;
            } else {
                System.out.println("O codigo do produto precisa ser unico.");

            }
        }

        if (codigoExistente == false) {
            if (produtos.add(produtoRecebido)) {
                retorno = true;
                for (Produto produto : produtos) {
                    System.out.println("produto >>> " + produto.toString()
                    );
                }

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
            System.out.println("O nome do produto esta invalidado.");
        }

        if (produto.getPrecoOriginal() != null || produto.getPrecoOriginal() != 0.0) {
            isPrecoOriginalValid = true;
        } else {
            System.out.println("O preço original do produto esta invalido.");
        }

        if (produto.getCodigo() != null || produto.getCodigo() != "") {
            isNomeValid = true;
        } else {
            System.out.println("O codigo do produto esta invalidado.");
        }

        if (isNomeValid && isPrecoOriginalValid && isCodigoValid) {
            if (this.salvarProduto(produto)) {
                retorno = true;
            }
        }

        return retorno;
    }
}
