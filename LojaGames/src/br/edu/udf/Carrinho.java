package br.edu.udf;

import java.util.ArrayList;

public class Carrinho {

	private ArrayList<Produto> produtos;
	private DBLoja banco;

	public boolean adicionarProduto(String codigoProduto) {
		boolean retorno = false;
		Produto produto = banco.buscaProdutoPorCodigo(codigoProduto);
		this.produtos.add(produto);
		if (this.produtos.contains(produto)) {
			System.out.println("Produto adicionado com sucesso!");
			retorno = true;
		}
		return retorno;
	}

	public boolean removerProduto(String codigoProduto) {
		boolean retorno = false;

		Produto produto = banco.buscaProdutoPorCodigo(codigoProduto);
		if (this.produtos.contains(produto)) {
			produtos.remove(produto);
			System.out.println("Produto removido com sucesso!");
			retorno = true;
		}
		return retorno;
	}

	public int quantidadeItens() {
		return this.produtos.size();
	}

	@Override
	public String toString() {
		return "Carrinho{" +
				"produtos=" + produtos +
				'}';
	}
}
