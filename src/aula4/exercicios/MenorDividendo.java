package aula4.exercicios;

import java.util.Scanner;

/**
 *
 * @author Cassio Seffrin
 */
public class MenorDividendo {
	public static void main(String a[]) {

		int divisores[] = { 2, 3, 4 };

		int dividendo = 13;

		int res = encontreDividendo(dividendo, divisores);

		System.out.println("resultado: " + res);
	}

	public static int encontreDividendo(int dividendo, int divisores[]) {
		while (true) {
			boolean retorno = true;
			for (int i = 0; i < divisores.length; i++) {
				if (dividendo % divisores[i] == 0) {
					retorno = false;
					break;
				}
			}
			if (retorno == true) {
				dividendo++;
			} else {
				return dividendo;
			}
		}
	}

}
