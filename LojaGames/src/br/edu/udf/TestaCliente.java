package br.edu.udf;

public class TestaCliente {
    public static void main(String[] args) {
        DBClientes dbClientes = new DBClientes();

        //Novo cliente criado
        Cliente cliente = new Cliente("Joss", "70150465122", "acula", "decaelgomes@gmail.com", 5000.00);

        //Cadastra Cliente
        dbClientes.cadastrarCliente(cliente);
        dbClientes.listaClientes();

        //altera Cliente
        Cliente cliente1 = new Cliente("Algoz", "70150165122", "asdfisdf", "d@mail.com", 10000.00);
        dbClientes.editarCliente(cliente);

        //Excluir Cliente
        dbClientes.excluirCliente("70150465122");
        dbClientes.listaClientes();
    }
}
