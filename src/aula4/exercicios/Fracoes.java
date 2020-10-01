package aula4.exercicios;

public class Fracoes {

	public static void main(String[] args) {
		int tamanho = 4;
		// numerador
		int numeradores[] = { 1, 2, 5, 1, 6 };
		// denominador
		int denominadores[] = { 2, 1, 6, 1, 4 };
		somaReduzidaDasFracoes(tamanho, numeradores, denominadores);
	}
	
	// O calculo em sí  (forma reduzida)
	public static void somaReduzidaDasFracoes(int tamanho, int numerador[], int denominador[]) {
			// Soma dos numeradores
			int numeradorFinal = 0;

			// MMC (Mínimo Múltiplo Comum)
			int denominadorComum = encontrarMMC(denominador, tamanho);

			// Numeradores e Denominadores
			for (int i = 0; i < tamanho; i++) {
				numeradorFinal = numeradorFinal + (numerador[i]) * (denominadorComum / denominador[i]);
			}

			// Encontrar MDC (Máximo divisor comum) do numeradorFinal e denominador
			int MDC = MaximoDivisorComum(numeradorFinal, denominadorComum);

			// faz a reduzida dividindo pelo MDC
			numeradorFinal = numeradorFinal / MDC;
			denominadorComum = denominadorComum / MDC;
			System.out.println(numeradorFinal + "/" + denominadorComum);
	}

	
	//	https://www.youtube.com/watch?v=RF227HWzY_U
	static int encontrarMMC(int denominador[], int tamanho) {
		int resultado = denominador[0];
		// encontra o MMC
		for (int i = 1; i < tamanho; i++) {
			resultado = (((denominador[i] * resultado)) / (MaximoDivisorComum(denominador[i], resultado)));
		}
		return resultado;
	}
	
	// Lema de Euclides
	// Na teoria dos números, o lema de Euclides é um lema que captura uma propriedade fundamental dos números primos.
	// funcao pra encontrar o MaximoDivisorComum de a e b
	static int MaximoDivisorComum(int a, int b) {
		if (b == 0) {
			return a;
		}
		return MaximoDivisorComum(b, a % b);
	}
}
