package aula4;

/*
 * 5. Com base na recursividade, estimar a probabilidade de acertar as 6 dezenas da mega sena.
 */

public class ProbabilidadeMegaSena {
	public static void main(String array[]) {		
		FatorialRecursivo f = new FatorialRecursivo();
		double numerador = f.fatorial(new Double(60)) ;
		double denominador = f.fatorial(new Double(6)) * f.fatorial(new Double(54));
		double res = numerador/denominador;
		String resultado = String.format("Probabilidade Sena: %.1f ", res );
		System.out.println(resultado);
	}
}
