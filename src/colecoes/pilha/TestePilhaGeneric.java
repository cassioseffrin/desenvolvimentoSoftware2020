/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes.pilha;

/**
 *
 * @author Cassio Seffrin
 */
public class TestePilhaGeneric {

	private Double[] elementosDouble = { 1.2, 5.3, 4.3, 5.6, 7.2 };
	private Integer[] elementosInteger = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
	private Pilha<Double> pilhaDouble;
	private Pilha<Integer> pilhaInteger;

	public void inicializar() {
		pilhaDouble = new Pilha<Double>(5);
		pilhaInteger = new Pilha<Integer>(14);

		inserirGenericos("Pilha de Doubles ", pilhaDouble, elementosDouble);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		removerGenericos("Pilha de Doubles ", pilhaDouble);

		/*
		 * System.out.println("\n*************** Numeros Inteiros*****************");
		 * 
		 * inserirGenericos("Pilha de Integers ", pilhaInteger, elementosInteger);
		 * removerGenericos("Pilha de Doubles ", pilhaInteger);
		 */
	}

	public <T> void inserirGenericos(String nome, Pilha<T> pilha, T[] elementos) {
		try {
			System.out.printf("Colocando elementos na pilha %s ", nome);
			for (T element : elementos) {
				System.out.printf("%s ", element);
				pilha.inserir(element);
			}
		} catch (PilhaCheiaException e) {
			e.printStackTrace();
		}
	}

	public <T> void removerGenericos(String nome, Pilha<T> pilha) {
		try {
			System.out.printf("removendo elementos da pilha %s ", nome);
			T elementoRemovido; // armazena elem removido

			while (true) {
				elementoRemovido = pilha.extrair();
				System.out.printf("%s ", elementoRemovido);
			}
		} catch (PilhaVaziaExeption e) {
			e.printStackTrace();
		}
	}

	public static void main(String arg[]) {
		TestePilhaGeneric aplicacao = new TestePilhaGeneric();
		aplicacao.inicializar();
	}
}
