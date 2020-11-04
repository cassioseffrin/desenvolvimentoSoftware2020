package genericsAulas6e7;

import java.util.ArrayList;

/**
 *
 * @author Cassio Seffrin
 */
public class WildcardTeste {
	public static void main(String args[]) {
		// cria, inicializa e gera saida de ArrayList de Integers, entao
		// exibe o total dos elementos
		Integer[] inteiros = { 1, 2, 3, 4, 5 };
		ArrayList<Integer> integerList = new ArrayList<Integer>();

		// insere elementos na integerList
		for (Integer element : inteiros)
			integerList.add(element);

		System.out.printf("integerList contem: %s\n", integerList);
		System.out.printf("total de elementos em integerList: %.0f\n\n", sum(integerList));

		// cria, inicializa e gera saida do ArrayList de Doubles, entao
		// exibe o total dos elementos
		Double[] doubles = { 1.1, 3.3, 5.5 };
		ArrayList<Double> doubleList = new ArrayList<Double>();

		// insere elementos na doubleList
		for (Double element : doubles)
			doubleList.add(element);

		System.out.printf("doubleList contem: %s\n", doubleList);
		System.out.printf("Total de elementos em doubleList: %.1f\n\n", sum(doubleList));

		// cria, inicializa e gera saida de ArrayList de nimeros contendo
		// Integers e Doubles e entio exibe o total dos elementos
		Number[] numbers = { 1, 2.4, 3, 4.1 }; // Integers and Doubles
		ArrayList<Number> numberList = new ArrayList<Number>();

		// insere elementos na numberList
		for (Number element : numbers)
			numberList.add(element);

		System.out.printf("numberList tem: %s\n", numberList);
		System.out.printf("Total de elementos em numberList: %.1f\n", sum(numberList));
	} // fim de main

	// calcula o total de elementos na pilha
	public static double sum(ArrayList<? extends Number> list) {
		double total = 0; // inicializa o total

		// calcula a soma
		for (Number element : list)
			total += element.doubleValue();

		return total;
	} // fim do mitodo sum
} // fim da classe WildcardTest
