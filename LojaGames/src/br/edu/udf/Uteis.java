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

    public boolean isCPFValid(String CPF) {
        boolean isCPFValid = true;
        if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
                CPF.equals("22222222222") || CPF.equals("33333333333") ||
                CPF.equals("44444444444") || CPF.equals("55555555555") ||
                CPF.equals("66666666666") || CPF.equals("77777777777") ||
                CPF.equals("88888888888") || CPF.equals("99999999999") ||
                (CPF.length() != 11)) {
            isCPFValid = false;
        }
        return isCPFValid;
    }

    public boolean isEmailValid(String email) {
        boolean isEmailValid = false;

        String caractereValidacao ="@";
        String caractereValidacao2 = ".com";

        if ( email.contains(caractereValidacao)&&email.contains(caractereValidacao2)){
            isEmailValid = true;
        }
        return isEmailValid ;
    }
}
