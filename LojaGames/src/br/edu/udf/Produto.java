package br.edu.udf;

public class Produto {
	private String nome;
	private String codigo;
	private double desconto;	
	private int quantidadeDisponivel;
	private double precoOriginal;
	private double precoFinal;
	
	public boolean aumentarQuantidade(int quantidadeParaAdicionar) {
		this.quantidadeDisponivel += quantidadeParaAdicionar;
		System.out.println("Quantidade adicionada com sucesso!");
		return true;
	}
	
	public boolean diminuirQuantidade(int quantidadeParaDiminuir) {
		if (quantidadeParaDiminuir > this.quantidadeDisponivel) {
			System.out.println("Quantidade não pode ser removida");
			return false;
		} else {
			this.quantidadeDisponivel -= quantidadeParaDiminuir;
			System.out.println("Quantidade removida com sucesso!");
			return true;
		}
	}
	
	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
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
