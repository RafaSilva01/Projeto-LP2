package br.edu.udf;

public class TestaCliente {
    public static void main(String[] args) {
        DBClientes dbClientes = new DBClientes();

        //Novo cliente criado
        Cliente cliente = new Cliente("Joss", "70150465122", "Rua intrincada", "joss.lang@gmail.com", 5000.00);
        Cliente cliente1 = new Cliente("Arthus", "14253639870", "Bairro Bonito", "R.Arthusgomes@gmail.com", 10000.00);
        Cliente cliente2 = new Cliente("Thurion", "82520465213", "Avenida Vailá", "T.gusthus@gmail.com", 10.00);

        //Cadastra Cliente
        //Cadastra produto Produto
        dbClientes.cadastrarCliente(cliente);
        dbClientes.cadastrarCliente(cliente1);
        dbClientes.cadastrarCliente(cliente2);
        dbClientes.listaClientes();

        //Editar Cliente
        Cliente cliente3 = new Cliente("Morgana", "82520465214", "As Brumas de Avalon", "nemomerlintemchance@gmail.com", 100000000.00);
        dbClientes.editarCliente(cliente3);

        //Excluir Cliente
        dbClientes.excluirCliente("70150465122");
        dbClientes.listaClientes();
    }
}
