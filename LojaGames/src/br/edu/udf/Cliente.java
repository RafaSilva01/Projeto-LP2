package br.edu.udf;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String cpf;
    private String usuario;
    private String senha;
    private String endereco;
    private String email;
    private Double saldo;
    private final Carrinho carrinho = new Carrinho();
    private ArrayList<ComprasRealizadas> comprasRealizadas;
    private FormasPagamento formaPagamento;

    public Cliente() {
        // Construtor vazio para a criação de Clientes sem a necessidade de passar os parametros
    }

    public Cliente(String nome, String cpf, String usuario, String senha, String endereco, String email, Double saldo) {
        this.nome = nome;
        this.cpf = cpf;
		this.usuario = usuario;
		this.senha = senha;
		this.endereco = endereco;
		this.email = email;
		this.saldo= saldo;
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

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) { this.saldo = saldo;}

	public ArrayList<ComprasRealizadas> getComprasRealizadas() {
		return comprasRealizadas;
	}

	public void setComprasRealizadas(ArrayList<ComprasRealizadas> comprasRealizadas) {
		this.comprasRealizadas = comprasRealizadas;
	}

	public FormasPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void depositaSaldo(Double valor){
    	this.saldo+=valor;
	}

	public void setFormaPagamento(FormasPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	@Override
	public String toString() {
		return "Cliente{" +
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
