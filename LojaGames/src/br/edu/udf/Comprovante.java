package br.edu.udf;

public class Comprovante {
    private String nome;
    private String cpf;
    private String email;
    private Carrinho carrinho;

    public Comprovante() {
    }

    public Comprovante(String nome, String cpf, String email, Carrinho carrinho) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.carrinho = carrinho;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void exibirComprovante() {
        System.out.println("===================================");
        System.out.println("Comprovante:");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("E-mail: " + this.email);
        System.out.println("Carrinho:");
        carrinho.listaCarrinho();
        System.out.println("Total das compras: R$ " + this.carrinho.somaCarrinho());
        System.out.println("===================================");
    }

    @Override
    public String toString() {
        return "Comprovante{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", carrinho=" + carrinho +
                '}';
    }
}
