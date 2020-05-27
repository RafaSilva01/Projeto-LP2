package br.edu.udf;
import java.util.ArrayList;

public class DBProdutos {
    private static final ArrayList<Produto> produtos = new ArrayList<>();
    private final Uteis uteis = new Uteis();

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

    private boolean isPrecoOriginalValid(Double precoOriginal) {
        boolean isPrecoOriginalValid = false;
        if (precoOriginal != null && precoOriginal != 0.0) {
            isPrecoOriginalValid = true;
        } else {
            System.out.println("O preço original do produto esta invalido.");
        }
        return true;
    }

    private boolean isCodigoValid(String codigoRecebido) {
        boolean isCodigoValid = false;
        boolean isCodigoUnico = true;

        if (codigoRecebido != null && codigoRecebido != "") {
            isCodigoValid = true;
        } else {
            System.out.println("O codigo do produto esta invalido.");
        }

        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigoRecebido) {
                isCodigoUnico = false;
                System.out.println("O codigo do produto precisa ser unico.");
            }
        }

        return isCodigoValid && isCodigoUnico;
    }

    public boolean cadastrarProduto(Produto produtoRecebido) {
        boolean retorno = false;
        boolean isPrecoOriginalValid = false;
        boolean isNomeValid = false;
        boolean isCodigoValid = false;

        isNomeValid = uteis.isNomeValid(produtoRecebido.getNome());
        isPrecoOriginalValid = isPrecoOriginalValid(produtoRecebido.getPrecoOriginal());
        isCodigoValid = isCodigoValid(produtoRecebido.getCodigo());

        if (isNomeValid && isPrecoOriginalValid && isCodigoValid) {
            if (produtos.add(produtoRecebido)) {
                retorno = true;
                System.out.println("Produto cadastrado com sucesso!");
            }
        }

        return retorno;
    }

    public boolean excluirProduto(String codigoProduto) {
        boolean retorno = false;
        Produto produtoParaExcluir = buscaProdutoPorCodigo(codigoProduto);
        if (produtoParaExcluir != null) {
            if (produtos.remove(produtoParaExcluir)) {
                System.out.printf("Produto codigo ("+codigoProduto+") excluido.");
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

        isNomeValid = uteis.isNomeValid(produtoRecebido.getNome());
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

    public boolean diminuirEstoque(Carrinho carrinho) {
        ArrayList<Produto> produtosDoCarrinho = carrinho.getProdutos();
        int contadorProdutosRemovidos = 0;
        for (Produto produto : produtos) {
            for (Produto produtoCarrinho : produtosDoCarrinho) {
                if (produto.getCodigo() == produtoCarrinho.getCodigo()) {
                    produto.diminuirQuantidade(1);
                    contadorProdutosRemovidos++;
                }
            }
        }System.out.println("Nao foi possivel excluir o produto.");
        return produtosDoCarrinho.size() == contadorProdutosRemovidos;
    }
}

