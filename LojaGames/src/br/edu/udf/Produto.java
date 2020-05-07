package br.edu.udf;

public class Produto {
	private String nome;
	private String codigo;
	private double desconto;	
	private int quantidade;
	private double precoOriginal;
	private double precoFinal;
	
	public void adicionarProduto(int quantidadeParaAdicionar) {
		this.quantidade += quantidadeParaAdicionar;
	}
	
	public void removerProduto(int quantidadeParaRemover) {
		if (quantidadeParaRemover > this.quantidade) {
			// lancar uma Exception seria uma boa ideia
			System.out.println("Quantidade não pode ser removida");
		} else {
			this.quantidade -= quantidadeParaRemover;
		}
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		// TODO fazer verificação se o codigo é unico
		this.codigo = codigo;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
		
		if ( desconto > this.precoOriginal) {
			this.precoFinal = 0;
		} else {
		    this.precoFinal = this.precoOriginal - precoFinal;
		}
	}

	public double getPrecoFinal() {
		return precoFinal;
	}
	
	public double getPrecoOriginal() {
		return precoOriginal;
	}

	public void setPrecoOriginal(double precoOriginal) {
		this.precoOriginal = precoOriginal;
	}

}
