package colecoes;

// Utilizando  addAll, frequency e disjoint.
import java.util.List;
import java.util.Vector;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Cassio Seffrin
 */
public class Frequencia {
	private String[] colors = { "red", "white", "yellow", "blue" };
	private List<String> list;
	private Vector<String> vector = new Vector<String>();

	// cria List e Vector
	// e os manipula com metodos a partir de Collections
	public Frequencia() {
		// inicializa list e vector
		list = Arrays.asList(colors);
		vector.add("black");
		vector.add("red");
		vector.add("green");

		System.out.println("antes de  addAll, vector contem: ");

		// exibe elementos em vector
		for (String s : vector)
			System.out.printf("%s ", s);

		// adiciona elementos de colors a list
		Collections.addAll(vector, colors);

		System.out.println("\n\ndepois de  addAll, vector contem: ");

		// exibe elementos em vector
		for (String s : vector)
			System.out.printf("%s ", s);

		// obtem frequencia de "red"
		int frequency = Collections.frequency(vector, "red");
		System.out.printf("\n\nfrequencia de   red in vector: %d\n", frequency);

		// verifica se list e vector tem elementos em comum
		boolean disjoint = Collections.disjoint(list, vector);

		System.out.printf("\nlist e vector %s elementos em comum \n", (disjoint ? "nao possuem" : "tem"));
	}

	public static void main(String args[]) {
		new Frequencia();
	}
}
