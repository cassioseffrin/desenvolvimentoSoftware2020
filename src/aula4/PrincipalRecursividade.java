package aula4;

/*
 * O que uma instancia de uma classe ? R: class PrincipalRecursividade
 * O que é um atributo? R: int fatorial = 8;
 */

public class PrincipalRecursividade {
	public static void main(String array[]) {
		int fatorial = 8;
		Recursividade recursividade = new Recursividade();
		long resultado = recursividade.fatorial(10);
		recursividade.imprimirNumero(fatorial, resultado);
		String a = "asdfasd";
		System.out.println("\n\ntamanho "+a.length());
	}
}
