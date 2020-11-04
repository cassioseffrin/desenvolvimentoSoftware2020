package aula4.exercicios;

import java.util.Scanner;

/**
 *
 * @author Cassio Seffrin
 */
public class SomaFracoes {

	public static void main(String[] args) {

		int numerador1;
		int denominador1;

		int numerador2;
		int denominador2;

		int numeradorFinal;
		int denominadorFinal;
		int temporario;

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o numerador para a primeira fração : ");
		numerador1 = scan.nextInt();
		System.out.print("Digite o denominador para a primeira fração : ");
		denominador1 = scan.nextInt();
		System.out.print("Digite o numerador para a segunda fração : ");
		numerador2 = scan.nextInt();
		System.out.print("Digite o denominador para a segunda fração : ");
		denominador2 = scan.nextInt();

		System.out.print("(" + numerador1 + " / " + denominador1 + ") + (" + numerador2 + " / " + denominador2 + ") ");
		// cacula a soma das fracoes
		if (denominador1 == denominador2) {
			numeradorFinal = numerador1 + numerador2;
			denominadorFinal = denominador1;
		} else {
			numeradorFinal = (numerador1 * denominador2) + (numerador2 * denominador1);
			denominadorFinal = denominador1 * denominador2;
		}
		if (numeradorFinal > denominadorFinal) {
			temporario = numeradorFinal;
		} else {
			temporario = denominadorFinal;
		}
		for (int i = 1; i <= temporario; i++) {
			if (numeradorFinal % i == 0 && denominadorFinal % i == 0) {
				numeradorFinal = numeradorFinal / i;
				denominadorFinal = denominadorFinal / i;
			}
		}

		System.out.printf(" Resultado: (%s/%s)", numeradorFinal, denominadorFinal);
		scan.close();
	}
}

//
//Reduzida
//		int n = 1;
//		int p = numeradorFinal;
//		int q = denominadorFinal;
//		if( numeradorFinal != denominadorFinal)
//		{
//			while(n != 0)
//			{
//				n = numeradorFinal % denominadorFinal;			
//				if(n != 0)
//				{
//					numeradorFinal = denominadorFinal;
//					denominadorFinal = n;
//				}
//			}			
//		}
//		System.out.println("("+p/denominadorFinal+" / "+q/denominadorFinal+")");