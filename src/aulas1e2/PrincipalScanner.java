package aulas1e2;

import java.util.Scanner;

public class PrincipalScanner {

	public static void main(String a[]) {
		Matematica mat = new Matematica();
		Scanner scan = new Scanner(System.in);
		System.out.println("1 Multiplicaçao");
		System.out.println("2 Raiz");
		System.out.println("3 Divisão");
		System.out.println("4 Soma");
		System.out.println("5 Subtraçâo");
		System.out.println("0 Sair");
		System.out.print("Digite a operaçao desejada: ");
		int op = scan.nextInt();

		System.out.print("Digite a numero 1: ");
		float n1 = scan.nextFloat();
		System.out.print("Digite a numero 2: ");
		float n2 = scan.nextFloat();

		if (op == 1) {
			System.out.println("resultado: " + mat.multiplica(n1, n2));
		} else if (op == 2) {
			System.out.println("resultado: " + mat.raiz(n1));
		}
		
		scan.close();

	}
}
