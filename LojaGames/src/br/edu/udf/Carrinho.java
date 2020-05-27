package br.edu.udf;

import java.util.ArrayList;

public class Carrinho {

	private final ArrayList<Produto> produtos = new ArrayList<>();
	private final DBProdutos bancoProdutos = new DBProdutos();


	public boolean adicionarProduto(String codigoProduto, Integer quantidade) {
		boolean retorno = false;
		if (quantidade == null || quantidade == 0) {
			System.out.println("Quantidade tem de ser maior do que zero.");
		}

		Produto produto = bancoProdutos.buscaProdutoPorCodigo(codigoProduto);
		if (produto.getQuantidadeDisponivel() < quantidade) {
			System.out.println("Infelimente só temos " +
					produto.getQuantidadeDisponivel() + " itens deste produto. ");
		} else {
			for (int contador = 0; contador < quantidade; contador++) {
				if (!this.produtos.add(produto)) {
					System.out.println("Falha ao adicionar o produto ao carrinho.");
				}
			}

			retorno = true;
		}

		return retorno;
	}

	public boolean removerProduto(String codigoProduto) {
		boolean retorno = false;

		Produto produto = bancoProdutos.buscaProdutoPorCodigo(codigoProduto);
		if (this.produtos.contains(produto)) {
			produtos.remove(produto);
			System.out.println("Produto removido do carrinho com sucesso!");
			retorno = true;
		}
		return retorno;
	}

	public int quantidadeItens() {
		return this.produtos.size();
	}

	public void listaCarrinho() {
		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}
	}

	public double somaCarrinho (){
		double precoTotal=0;
		for ( Produto produto: produtos) {
			precoTotal+=produto.getPrecoFinal();
		}
		return precoTotal;
	}



	@Override
	public String toString() {
		return "Carrinho { " + produtos +
				'}' +
				" Quantidade de itens no carrinho = " +
				this.quantidadeItens();
	}






}
