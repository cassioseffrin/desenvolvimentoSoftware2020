package aula4;

/*
 * 5. Com base na recursividade, estimar a probabilidade de acertar as 6 dezenas da mega sena.
 */

/**
 *
 * @author Cassio Seffrin
 */
public class ProbabilidadeMegaSena {
	public static void main(String array[]) {
		FatorialRecursivo f = new FatorialRecursivo();
		Double numero = new Double(60);
		double numerador = f.fatorial(numero);
		double denominador = f.fatorial(new Double(6)) * f.fatorial(new Double(54));
		double res = numerador / denominador;
		String resultado = String.format("Probabilidade Sena: %s ", res);
		System.out.println(resultado);
	}
}
