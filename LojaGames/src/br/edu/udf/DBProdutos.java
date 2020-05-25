package br.edu.udf;

import java.util.ArrayList;

public class DBProdutos {
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

    private boolean isNomeValid(String nome) {
        boolean isNomeValid = false;
        if (nome != null && nome != "") {
            isNomeValid = true;
        } else {
            System.out.println("O nome do produto esta invalido.");
        }
        return isNomeValid;
    }

    private boolean isPrecoOriginalValid(Double precoOriginal) {
        boolean isPrecoOriginalValid = false;
        if (precoOriginal != null && precoOriginal != 0.0) {
            isPrecoOriginalValid = true;
        } else {
            System.out.println("O preço original do produto esta invalido.");
        }
        return true;
    }

    private boolean isCodigoValid(String codigo) {
        boolean isCodigoValid = false;
        if (codigo != null && codigo != "") {
            isCodigoValid = true;
        } else {
            System.out.println("O codigo do produto esta invalido.");
        }
        return isCodigoValid;
    }

    public boolean cadastrarProduto(Produto produto) {
        boolean retorno = false;
        boolean isPrecoOriginalValid = true;
        boolean isNomeValid = false;
        boolean isCodigoValid = false;

        isNomeValid = isNomeValid(produto.getNome());
        isPrecoOriginalValid = isPrecoOriginalValid(produto.getPrecoOriginal());
        isCodigoValid = isCodigoValid(produto.getCodigo());

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

    public boolean editarProduto(Produto produtoRecebido) {
        boolean retorno = false;
        boolean isPrecoOriginalValid = true;
        boolean isNomeValid = false;
        boolean isCodigoValid = false;

        isNomeValid = isNomeValid(produtoRecebido.getNome());
        isPrecoOriginalValid = isPrecoOriginalValid(produtoRecebido.getPrecoOriginal());
        isCodigoValid = isCodigoValid(produtoRecebido.getCodigo());

        if (isNomeValid && isPrecoOriginalValid && isCodigoValid) {
            for (Produto produto : produtos) {
                if (produto.getCodigo() == produtoRecebido.getCodigo()) {
                    retorno = true;
                }
            }
        }

        if (retorno == true) {
            this.excluirProduto(produtoRecebido.getCodigo());
            this.cadastrarProduto(produtoRecebido);
        } else {
            System.out.println("Nao foi possivel editar as informacoes do produto." +
                    "Verifique se o produto ja foi cadastrado.");
        }
        return retorno;
    }

}

