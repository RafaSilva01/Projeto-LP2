package br.edu.udf;

public class TestaCliente {
    public static void main(String[] args) {
        DBClientes dbClientes = new DBClientes();
        Cliente cliente = new Cliente("Joss", "70150465122", "acula", "decaelgomes@gmail.com", 5000.00);


        //Cadastra produto Produto
        dbClientes.cadastrarCliente(cliente);
        dbClientes.listaClientes();

        //altera Produto

        Cliente cliente1 = new Cliente("Joss", "70150465122", "asdfisdf", "d@gmail.com", 5000.00);
        dbClientes.editarCliente(cliente1);

        //Excluir
        System.out.println(dbClientes.excluirCliente("70150465122"));
        dbClientes.listaClientes();


    }
}
