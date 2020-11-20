package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Cassio Seffrin
 */

public class TestePerformance extends Thread {
//	public static void main(String[] args) {
//		TestePerformance t = new TestePerformance();
//		t.ArrayListTest();
//		// t.HashSetTest();
//	}

//	public TestePerformance() {
//		ArrayListTest();
//
//	}

	public void ArrayListTest() {
		Collection<String> colecao = new ArrayList<String>();
		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			colecao.add("teste");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
//			double progresso =  ();
			System.out.println(i + " - tread: " + getName());
		}

		long tempoFinal = System.currentTimeMillis();
		System.out.printf("\nArrayList time ... %.3f segundos%n", (tempoFinal - tempoInicial) / 1000d);
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
//
	@Override
	public void run() {
		ArrayListTest();	
	}
}