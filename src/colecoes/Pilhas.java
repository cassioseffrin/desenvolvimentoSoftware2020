package colecoes;

import java.util.Stack;
import java.util.EmptyStackException;

/**
 *
 * @author Cassio Seffrin
 */
public class Pilhas {
	public Pilhas() {
		Stack<Number> pilha = new Stack<Number>();
		// cria numeros para armazenar na pilha
		Long numLong = 12L;
		Integer numInt = 8;
		Float numFloat = 1.0F;
		Double numDouble = 7.5678;
		// adicionar os elementos
		pilha.push(numLong);
		imprimePilha(pilha);
		pilha.push(numInt);
		imprimePilha(pilha);
		pilha.push(numFloat);
		imprimePilha(pilha);
		pilha.push(numDouble);
		imprimePilha(pilha);
		// remove itens de pilha
		try {
			Number objetoRemover = null;
			// remove elementos da pilha
			while (true) {
				// utiliza metodo pop para retirar os elemento da pilha
				objetoRemover = pilha.pop();
				System.out.printf("%s retirado\n", objetoRemover);
				imprimePilha(pilha);
			}
		} catch (EmptyStackException emptyStackException) {
			System.out.println("A pilha esta vazia");
		}
	}

	private void imprimePilha(Stack<Number> pilha) {
		if (!pilha.isEmpty()) {
			System.out.print("A pilha contém: ");
			for (Number n : pilha) {
				System.out.printf("%s ", n);
			}
			System.out.print("(topo) \n\n");
		}
	}

	public static void main(String args[]) {
		new Pilhas();
	}
}
