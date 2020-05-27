package br.edu.udf;

import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	public Carrinho carrinho = new Carrinho();
	private double saldo;
	private ArrayList<Comprovante> comprasRealizadas = new ArrayList<>();

	public Cliente() {
		// Construtor vazio para a criação de Clientes sem a necessidade de passar os parametros
	}

	public Cliente(String nome, String cpf, String endereco, String email, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Comprovante> getComprasRealizadas() {
		return comprasRealizadas;
	}

	public void setComprasRealizadas(ArrayList<Comprovante> comprasRealizadas) {
		this.comprasRealizadas = comprasRealizadas;
	}


	public void depositaSaldo(Double valor) {
		this.saldo += valor;
	}


	@Override
	public String toString() {
		return "Cliente{" +
				"nome='" + nome + '\'' +
				", cpf='" + cpf + '\'' +
				", endereco='" + endereco + '\'' +
				", email='" + email + '\'' +
				", carrinho=" + carrinho +
				", saldo=" + saldo +
				", comprasRealizadas=" + comprasRealizadas +
				'}';
	}

	public Carrinho getCarrinho() {
		return this.carrinho;
	}

	public void adicionarComprovante(Comprovante comprovante) {
		this.comprasRealizadas.add(comprovante);
	}

	public void listaComprovantes() {
		for (Comprovante comprovante : comprasRealizadas) {
			comprovante.exibirComprovante();
		}
	}
}
