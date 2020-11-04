package aula4.exercicios;

import java.util.Scanner;
//2. Comparar 2 Inteiros que serão recebidos como String.

/**
 *
 * @author Cassio Seffrin
 */
public class Exercicio2a4 {

	public static void main(String array[]) {
		Scanner scan = new Scanner(System.in);
		String a;
		String b;
		int n1;
		int n2;
		System.out.println("Digite o numero a ");
		a = scan.next();
		System.out.println("Digite o numero b ");
		b = scan.next();
		try {
			n1 = Integer.parseInt(a);
			n2 = Integer.parseInt(b);
		} catch (Exception e) {
			System.out.println("Houve um erro ao converter as entradas");
			return;
		}
		Exercicio2a4 ex4 = new Exercicio2a4();
		System.out.printf("O valor: %s é %s que: %s.", n1, ex4.compararInteiros(n1, n2), n2);
		scan.close();
	}

	public String compararInteiros(int a, int b) {
		if (a > b) {
			return "maior";
		} else if (a == b) {
			return "igual";
		} else {
			return "menor";
		}
	}
}
