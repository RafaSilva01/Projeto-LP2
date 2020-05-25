package br.edu.udf;

public class Produto {
    private String codigo;
    private String nome;
    private double desconto;
    private int quantidadeDisponivel;
    private Double precoOriginal;
    private Double precoFinal;
    private DBLoja banco;

    public Produto() {
    }

    public Produto(String codigo, String nome, Double precoOriginal) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoOriginal = precoOriginal;
    }

    public Produto(String codigo, String nome, double desconto, int quantidadeDisponivel, double precoOriginal, double precoFinal) {
        this.nome = nome;
        this.codigo = codigo;
        this.desconto = desconto;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.precoOriginal = precoOriginal;
        this.precoFinal = precoFinal;
    }

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
        this.codigo = codigo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;

        if (desconto > this.precoOriginal) {
            this.precoFinal = 0.0;
        } else {
            this.precoFinal = this.precoOriginal - precoFinal;
        }
    }

    public double getPrecoFinal() {
        if (this.precoFinal == null) {
            this.precoFinal = this.precoOriginal;
        }
        return this.precoFinal;
    }

    public Double getPrecoOriginal() {
        return precoOriginal;
    }

    public void setPrecoOriginal(double precoOriginal) {
        this.precoOriginal = precoOriginal;
    }

    @Override
    public String toString() {
        return "Produto { " +
                "Nome: '" + nome + '\'' +
                ", Codigo: " + codigo +
                ", Quantidade Disponivel: " + quantidadeDisponivel +
                ", Desconto: R$ " + desconto +
                ", Preco Original: R$ " + precoOriginal +
                ", Preco Final: R$ " + this.getPrecoFinal() +
                " }";
    }
}
