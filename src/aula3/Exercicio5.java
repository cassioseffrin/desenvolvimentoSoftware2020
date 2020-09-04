package aula3;

import java.util.Scanner;

/*
 * 5. Faça um algoritmo para calcular o valor total de venda, dado que o 
 * usuário deverá entrar com o valor unitário de um produto e a quantidade vendida.
 */
public class Exercicio5 {
	
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		float valorUnitario;
		float quantidade;
		System.out.println("Digite o valor unitario:");
		valorUnitario = scan.nextFloat();
		System.out.println("Digite quantidade:");
		quantidade = scan.nextFloat();
		System.out.printf("Total R$: %10.2f", valorUnitario*quantidade);
	}
}
