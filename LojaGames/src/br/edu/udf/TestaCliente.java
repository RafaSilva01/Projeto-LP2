package br.edu.udf;

public class TestaCliente {
    public static void main(String[] args) {
        DBClientes dbClientes = new DBClientes();

        Cliente cliente = new Cliente("Joss", "70150465122", "acula", "decaelgomes@gmail.com", 5000.00);


        //Cadastra produto Produto
        dbClientes.cadastrarCliente(cliente);
        dbClientes.listaClientes();

        //altera Produto
        Produto produto1 = new Produto("1234", "Call of Duty: Modern Warfare", 100.02);
        dbClientes.editarCliente();

        //Excluir
        System.out.println(dbClientes.excluirCliente("70150465122"));
        dbClientes.listaClientes();


    }
}
