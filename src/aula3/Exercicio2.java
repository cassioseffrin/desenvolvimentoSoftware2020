package aula3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String a[]) {
		String nome;
		System.out.println("Digite seu nome: ");
		Scanner x = new Scanner(System.in);
		nome = x.nextLine();
		System.out.println("O nome digitado foi: " + nome);
	}
}
