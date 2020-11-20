package aula4;

/*
 * O que uma classe? R: class Recursividade
 * O que é um método? R: public void imprimirNumero e public long fatorial
 */

/**
 *
 * @author Cassio Seffrin
 */
public class FatorialRecursivo {

	public void imprimirNumero(int fatorial, long numero) {
		System.out.printf("O fatorial de %d é: %s", fatorial, numero);
	}

	/*
	 * Exemplo polimorfismo: 2 metodos com o mesmo nome e parametros de tipos
	 * distintos Sobrecarga de operadores.
	 */
	public double fatorial(double n) {
		if (n <= 1) {
			return 1;
		}
		return n * fatorial(n - 1);
	}

	public long fatorial(long numero) throws InterruptedException {
		Thread.sleep(1000);
		if (numero <= 1) {
			return 1;
		}
		return numero * fatorial(numero - 1);
	}

}
