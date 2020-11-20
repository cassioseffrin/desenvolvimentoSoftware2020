package aula4;

/*
 * O que uma instancia de uma classe ? R: class PrincipalRecursividade
 * O que é um atributo? R: int fatorial = 8;
 */

/**
 *
 * @author Cassio Seffrin
 */
public class PrincipalRecursividade {
	public static void main(String array[]) throws InterruptedException {
		FatorialRecursivo recursividade = new FatorialRecursivo();
		long resultado = recursividade.fatorial(4);
		recursividade.imprimirNumero(4, resultado);

	}
}
