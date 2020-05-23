package br.edu.udf;

public class FormasPagamento {
    private String cartaoCredito;
    private String cartaoDebito;
    private Double dinheiro;

    public boolean validaCartao(String cartaoCredito){
        // TODO implementar validacao de cartao
        return true;
    }

    public boolean setCartaoCredito(String cartaoCredito) {
        if (this.validaCartao(cartaoCredito)){
            this.cartaoCredito = cartaoCredito;
            return true;
        }
        return false;
    }

    public String getCartaoCredito() {
        return cartaoCredito;
    }

    public boolean setCartaoDebito(String cartaoDebito) {
        if (this.validaCartao(cartaoCredito)){
            this.cartaoDebito = cartaoDebito;
            return true;
        }
        return false;
    }

    public String getCartaoDebito() {
        return cartaoDebito;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Double getDinheiro() {
        return dinheiro;
    }
}
