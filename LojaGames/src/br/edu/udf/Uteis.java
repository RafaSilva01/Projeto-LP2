package br.edu.udf;

public class Uteis {

    public boolean isNomeValid(String nome) {
        boolean isNomeValid = false;
        if (nome != null && nome != "") {
            isNomeValid = true;
        } else {
            System.out.println("O nome do produto esta invalido.");
        }
        return isNomeValid;
    }
}
