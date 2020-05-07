package br.edu.udf;

import java.util.ArrayList;

public class Carrinho {

	private ArrayList<Produto> produtos;

	public void adicionarProduto(int codigoProduto) {
		Produto produto = DBLoja.buscaProdutoPorCodigo(codigoProduto);
		this.produtos.add(produto);
	}

	public void removerProduto(int codigoProduto) {
		Produto produto = DBLoja.buscaProdutoPorCodigo(codigoProduto);
		if (this.produtos.contains(produto)) {
			produtos.remove(produto);

		}
	}

	public int quantidadeItens() {
		return this.produtos.size();
	};
	
	public String toString() {
		// TODO implementar
		return "";
	}
}
