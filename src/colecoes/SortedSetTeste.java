package colecoes;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Cassio Seffrin
 */
public class SortedSetTeste {
	private static final String names[] = { "amarelo", "verde", "preto", "rosa", "cinza", "branco", "laranja",
			"vermelho", "verde" };

	// cria um conjunto classificado com TreeSet, e depois o manipula
	public SortedSetTeste() {
		// cria TreeSet
		SortedSet<String> tree = new TreeSet<String>(Arrays.asList(names));

		System.out.println("Sorted set: ");
		imprimirSet(tree);

		// obtem headSet com base em "laranja"
		System.out.print("\ninicio do Set (\"laranja\"):  ");
		imprimirSet(tree.headSet("laranja"));

		// obtem tailSet baseado em "laranja"
		System.out.print("fim laranja (\"laranja\"):  ");
		imprimirSet(tree.tailSet("laranja"));

		System.out.printf("primeiro: %s\n", tree.first());
		System.out.printf("ultimo : %s\n", tree.last());
	}

	private void imprimirSet(SortedSet<String> set) {
		for (String s : set)
			System.out.printf("%s ", s);

		System.out.println();
	}

	public static void main(String args[]) {
		new SortedSetTeste();
	}
}
