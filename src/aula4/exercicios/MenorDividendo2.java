package aula4.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cassio Seffrin
 */
public class MenorDividendo2 {
	public static void main(String a[]) {
		Integer dividendo;
		ArrayList<Integer> divisores = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o divisor 1: ");
		divisores.add(scan.nextInt());
		System.out.println("Digite o divisor 2: ");
		divisores.add(scan.nextInt());
		System.out.println("Digite o divisor 3: ");
		divisores.add(scan.nextInt());
		System.out.println("Digite o dividendo : ");
		dividendo = scan.nextInt();

		int res = encontreDividendo(dividendo, divisores);
		System.out.printf("O menor dividendo dos divisores %s, %s, %s é igual a %s", divisores.get(0), divisores.get(1),
				divisores.get(2), res);
	}

	public static Integer encontreDividendo(Integer dividendo, ArrayList<Integer> divisores) {
		while (true) {
			boolean retorno = true;
			for (int i = 0; i < divisores.size(); i++) {
				if (dividendo % divisores.get(i) == 0) {
					retorno = false;
					break;
				}
			}
			if (retorno == true)
				dividendo++;
			else
				return dividendo;
		}
	}

}
