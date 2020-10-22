package colecoes;

import java.util.Stack;
import java.util.EmptyStackException;

public class Pilhas {
	public Pilhas() {
		Stack<Number> pilha = new Stack<Number>();
		// cria numeros para armazenar na pilha
		Long longNumber = 12L;
		Integer intNumber = 8;
		Float floatNumber = 1.0F;
		Double doubleNumber = 7.5678;
		// utiliza metodo push para adicionar os elementos
		pilha.push(longNumber); 
		imprimePilha(pilha);
		pilha.push(intNumber); 
		imprimePilha(pilha);
		pilha.push(floatNumber); 
		imprimePilha(pilha);
		pilha.push(doubleNumber); 
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
