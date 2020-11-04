package colecoes;

// Utilizando algoritmos reverse, fill, copy, min e max.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Cassio Seffrin
 */
public class MinMax {
	private Character[] letras = { 'P', 'C', 'M' };
	private Character[] letrasCopia;
	private List<Character> lista;
	private List<Character> listaCopia;

	public MinMax() {
		lista = Arrays.asList(letras);
		letrasCopia = new Character[3];
		listaCopia = Arrays.asList(letrasCopia);
		System.out.println("Lista Inicial: ");
		output(lista);

		Collections.reverse(lista);
		System.out.println("\ndepois de revertido: ");
		output(lista);

		Collections.copy(listaCopia, lista);
		output(listaCopia);

		Collections.fill(lista, 'R'); // preenche a lista com Rs
		System.out.println("\ndepois de preenchido: ");
		output(lista);
	}

	private void output(List<Character> listRef) {
		System.out.print("A Lista eh: ");

		for (Character caractere : listRef)
			System.out.printf("%s ", caractere);

		System.out.printf("\nMaximo: %s", Collections.max(listRef));
		System.out.printf("\nMinimo: %s\n", Collections.min(listRef));
	}

	public static void main(String args[]) {
		new MinMax();
	}
}
