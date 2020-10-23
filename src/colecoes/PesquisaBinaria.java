package colecoes;

// Utilizando o algoritmo binarySearch.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class PesquisaBinaria {
	private List<String> arrayList;

	// cria, classifica e gera a saida da lista
	public PesquisaBinaria() {
		arrayList = new ArrayList<String>();
		arrayList.add("azul");
		arrayList.add("amarelo");
		arrayList.add("verde");
		arrayList.add("cinza");
		arrayList.add("bordo");
		arrayList.add("azul marinho");
		arrayList.add("rosa");
		arrayList.add("preto");
		// ordena o a colecao
		Collections.sort(arrayList); 
	}

	// pesquisa varios valores na lista
	private void procurar() {
		procuraEimprimeResultado("asdf");
		procuraEimprimeResultado("cinza");
		procuraEimprimeResultado("azu");
	}

	// realiza pesquisas e exibe o resultado da pesquisa
	private void procuraEimprimeResultado(String textoPesquisa) {
		int resultado = 0;
		System.out.printf("\nProcurando por: %s\n", textoPesquisa);
		resultado = Collections.binarySearch(arrayList, textoPesquisa);
		if (resultado >= 0)
			System.out.printf("Encontrado %d\n", resultado);
		else
			System.out.printf("Nao Encontrado (%d)\n", resultado);
	}

	public static void main(String args[]) {

		PesquisaBinaria binarySearchTest = new PesquisaBinaria();
		binarySearchTest.procurar();
	}
}
