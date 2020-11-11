package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Cassio Seffrin
 */

public class TestePerformance {
	public static void main(String[] args) {
		TestePerformance t = new TestePerformance();
		t.ArrayListTest();
		// t.HashSetTest();
	}

	public void ArrayListTest() {
		Collection<String> colecao = new ArrayList<String>();

		Collection col2 = new ArrayList();

		for (int i = 0; i < 10; i++) {
			col2.add("teste_" + i);
		}

		System.out.printf("\n  : %s", col2);

		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < 60000; i++) {
			colecao.add("teste");
		}

		for (int i = 0; i < 30000; i++) {
			colecao.contains("teste");
		}

		long tempoFinal = System.currentTimeMillis();
		System.out.printf("ArrayList time ... %.3f segundos%n", (tempoFinal - tempoInicial) / 1000d);
	}
	/*
	 * O contains da ArrayList faz uma busca linear, já o HashSet utiliza uma tabela
	 * de espalhamento para tentar fazer a busca em tempo constante.
	 */

	public void HashSetTest() {
		Collection<String> colecao = new HashSet<String>();

		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < 60000; i++) {
			colecao.add("teste");
		}

		for (int i = 0; i < 30000; i++) {
			colecao.contains("teste");
		}

		long tempoFinal = System.currentTimeMillis();
		System.out.printf("HashSet time ... %.3f segundos%n", (tempoFinal - tempoInicial) / 1000d);
	}

}