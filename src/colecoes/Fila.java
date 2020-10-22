package colecoes;

import java.util.PriorityQueue;

public class Fila {
	public static void main(String args[]) throws InterruptedException {
		PriorityQueue<Integer> fila = new PriorityQueue<Integer>();
		// insere elementos na fila
		fila.add(1);
		fila.add(2);
		fila.add(3);
		fila.add(4);
		fila.add(5);
		
//		fila.offer(5.4);
		// exibe elementos na fila
		while (fila.size() > 0) {
			// visualiza elemento superior
			System.out.printf("\nBeepar para senha numero %d ", fila.peek());
			Thread.sleep(2000);
			// remove elemento superior
			fila.poll();
		}
	}
}