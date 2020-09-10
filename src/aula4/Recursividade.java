package aula4;

/*
 * O que uma classe? R: class Recursividade
 * O que é um método? R: public void imprimirNumero e public long fatorial
 */

public class Recursividade {
	
	public void imprimirNumero(int fatorial, long numero) {
		System.out.printf("O fatorial de %d é: %s", fatorial,  numero);
	}
	
	public long fatorial(int numero) {
		if (numero <= 1) {
			  return 1;
		}
		return numero  *  fatorial(numero-1);
	}
	
}
