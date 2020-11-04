package genericsAulas6e7;

import java.util.Date;

/**
 *
 * @author Cassio Seffrin
 */
public class ArraysMain {

	public static void main(String a[]) {

		Integer[] inteiros = { 1, 2, 5, 6, 2, 3, 6 };
		String[] strings = { "teste1", "teste2", "teste3" };
		Date[] datas = { new Date(), new Date(118, 5, 23) };

		ArrayGenerico.imprimirArray(inteiros);
		ArrayGenerico.imprimirArray(strings);
		ArrayGenerico.imprimirArray(datas);
		ArrayGenerico.imprimirArrayGeneric(inteiros);
		ArrayGenerico.imprimirArrayGeneric(strings);
		ArrayGenerico.imprimirArrayGeneric(datas);

		// n1 eh um tipo primitivo
		int n1 = 10;

		// n2 eh uma instancia da classe Integer
		Integer n2 = 10;

		System.out.println("\n" + n2.MAX_VALUE);
	}
}
