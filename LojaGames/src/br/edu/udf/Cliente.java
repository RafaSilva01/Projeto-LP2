package br.edu.udf;

import java.util.ArrayList;

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String cpf;
	private String usuario;
	private String senha;
	private String endereço;
	private String email;
	private ArrayList<ComprasRealizadas> comprasRealizadas;
	private FormasPagamento formaPagamento;
	
	public Cliente() {
		// Construtor vazio para a criação de Clientes sem a necessidade de passar os parametros
	}

	public Cliente(String nome, String cpf, String usuario, String senha, String endereço, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.usuario = usuario;
		this.senha = senha;
		this.endereço = endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
	
	
	
}
