package colecoes.pilha;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cassio Seffrin
 */
public class TestePilha {

	private double[] elementosDouble = { 1.2, 5.3, 4.3, 5.6, 7 };
	private int[] elementosInteger = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
	private Pilha<Double> pilhaDouble;
	private Pilha<Integer> pilhaInteger;

	public void inicializar() {
		pilhaDouble = new Pilha<Double>(5);
		pilhaInteger = new Pilha<Integer>();
		inserirDoubles();
		retirarDoubles();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		System.out.println("\n*************** Numeros Inteiros*****************");
		inserirIntegers();
		retirarIntegers();
	}

	public void inserirDoubles() {
		try {
			System.out.println("Colocando elementos na pilha");
			for (double element : elementosDouble) {
				System.out.printf("%.2f ", element);
				pilhaDouble.inserir(element);
			}
		} catch (PilhaCheiaException e) {
			e.printStackTrace();
		}
	}

	public void retirarDoubles() {
		try {
			System.out.println("\n\nRemovendo elementos da pilha");
			double elementoRemovido; // armazena elem removido

			while (true) {
				elementoRemovido = pilhaDouble.extrair();
				System.out.printf("%.2f ", elementoRemovido);
			}
		} catch (PilhaVaziaExeption e) {
			e.printStackTrace();
		}
	}

	public void inserirIntegers() {
		try {
			System.out.println("Colocando inteiros elementos na pilha");
			for (int element : elementosInteger) {
				System.out.printf("%d ", element);
				pilhaInteger.inserir(element);
			}
		} catch (PilhaCheiaException e) {
			e.printStackTrace();
		}
	}

	public void retirarIntegers() {
		try {
			System.out.println("\n\nRemovendo elementos integers da pilha");
			int elementoRemovido; // armazena elem removido

			while (true) {
				elementoRemovido = pilhaInteger.extrair();
				System.out.printf("%d ", elementoRemovido);
			}
		} catch (PilhaVaziaExeption e) {
			e.printStackTrace();
		}
	}

	public static void main(String arg[]) {
		TestePilha aplicacao = new TestePilha();
		aplicacao.inicializar();
	}
}
