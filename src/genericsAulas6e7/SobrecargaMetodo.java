package genericsAulas6e7;

// Utilizando metodos sobrecarregados para imprimir um array de diferentes tipos.

/**
 *
 * @author Cassio Seffrin
 */
public class SobrecargaMetodo {
	// metodo imprimirArray para imprimir um array de Integer
	public static void imprimirArray(Integer[] arrayEntrada) {

		for (Integer e : arrayEntrada)
			System.out.printf("%s ", e);

		System.out.println();
	}

	// metodo imprimirArray para imprimir um array de Double
	public static void imprimirArray(Double[] arrayEntrada) {

		for (Double e : arrayEntrada)
			System.out.printf("%s ", e);

		System.out.println();
	}

	// metodo imprimirArray para imprimir um array de Character
	public static void imprimirArray(Character[] arrayEntrada) {

		for (Character e : arrayEntrada)
			System.out.printf("%s ", e);

		System.out.println();
	}

	public static void main(String args[]) {

		Integer[] arrayInteiros = { 1, 2, 3, 4, 5, 6 };
		Double[] arrayDoubles = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] arrayCaracteres = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array arrayInteiros contem:");
		imprimirArray(arrayInteiros);
		System.out.println("\nArray arrayDoubles contem:");
		imprimirArray(arrayDoubles);
		System.out.println("\nArray arrayCaracteres contem:");
		imprimirArray(arrayCaracteres);
	}
}
