package colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/**
*
* @author Cassio Seffrin
*/
public class FilaStr {

	public static void main(String a[]) throws InterruptedException {

		int numero = 10;
		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 0; i <= numero; i++)
			q.add(i);

		while (!q.isEmpty()) {
			System.out.printf("\nelemento: " + q.remove());
			Thread.sleep(500);
		}

	}
}
