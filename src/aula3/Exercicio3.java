package aula3;

import java.util.Scanner;

/*
 * 3. Faça um algoritmo que peça dois números aos usuários e em seguida multiplique-os. 
 * Mostre na tela o resultado.
 */
public class Exercicio3 {
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		float n1;
		float n2;
		float resultado;
		System.out.println("Digite o numero 1: ");
		n1 = scan.nextFloat();
		System.out.println("Digite o numero 2: ");
		n2 = scan.nextFloat();
		resultado = n1 * n2;
		System.out.printf("Resultado da multiplicacao %s X %s = %s 4", n1, n2, resultado);
		System.out.println("Resultado da multiplicacao " + n1 + "*" + n2 + " eh: " + resultado);
	}
}
