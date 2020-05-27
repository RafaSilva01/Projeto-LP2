package br.edu.udf;

import java.util.ArrayList;

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String cpf;
	private String usuario;
	private String senha;
	private String endereco;
	private String email;
	private ArrayList<ComprasRealizadas> comprasRealizadas;
	private FormasPagamento formaPagamento;
	
	public Cliente() {
		// Construtor vazio para a criação de Clientes sem a necessidade de passar os parametros
	}

	public Cliente(String nome, String cpf, String usuario, String senha, String endereco, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.usuario = usuario;
		this.senha = senha;
		this.endereco = endereco;
		this.email = email;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	public ArrayList<ComprasRealizadas> getComprasRealizadas() {
		return comprasRealizadas;
	}

	public void setComprasRealizadas(ArrayList<ComprasRealizadas> comprasRealizadas) {
		this.comprasRealizadas = comprasRealizadas;
	}

	public FormasPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormasPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"idCliente=" + idCliente +
				", nome='" + nome + '\'' +
				", cpf='" + cpf + '\'' +
				", usuario='" + usuario + '\'' +
				", senha='" + senha + '\'' +
				", endereco='" + endereco + '\'' +
				", email='" + email + '\'' +
				", comprasRealizadas=" + comprasRealizadas +
				", formaPagamento=" + formaPagamento +
				'}';
	}
}
