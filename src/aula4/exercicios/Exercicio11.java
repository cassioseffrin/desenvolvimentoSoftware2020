package aula4.exercicios;

/**
*
* @author Cassio Seffrin
*/
import java.util.Scanner;

/*
 * 
 * 11.Construa um programa que leia a quantidade de quilômetros rodados e a quantidade gasta de
 * combustível em litros em uma viagem. Informe a média de combustível gasto em cada quilômetro
 * rodado.
 * escrever "digite o total de KM"
 * ler km
 * escrever "litros gastos"
 * ler litros
 * media = km/litros
 * escrever "media de km por litro" media
 * 
 */

public class Exercicio11 {

	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		float kms;
		float qtdLitros;
		System.out.println("Digite o total de KMs:");
		kms = scan.nextFloat();
		System.out.println("Quantidade de litros gasto:");
		qtdLitros = scan.nextFloat();
		System.out.printf("Média de km por litro: %10.2f", kms / qtdLitros);
	}
}
