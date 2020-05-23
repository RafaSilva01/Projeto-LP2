package br.edu.udf;
import java.util.Scanner;

public class Programa {
   public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		Carrinho carrinho = new Carrinho();
		
		/////---------Menu ----------------/////
		System.out.println("Estoque");
		System.out.println("Venda");
		System.out.println("Relatório de vendas");
		
		System.out.println("Selecione um item para compra");
		System.out.println("1 -  Call of Douth");
		System.out.println("2 -  GTA");
		System.out.println("3 -  NEED FOR SPEED");
		
//		carrinho.codigo = sc.nextInt();
//		carrinho.quantidadeItens = sc.nextInt();
		
		System.out.println(carrinho);
		
		sc.close();
   }
}
