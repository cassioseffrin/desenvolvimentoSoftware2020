package aula4.exercicios;
import java.util.ArrayList;
import java.util.Collections;
public class Exercicio2 {

	//private int[] arrPrimos = new int[20];

	public static void main(String a[]) {
		// passo 1;
		// encontra os primos entre os 100 primeiros núnmeros, vocês deverão
		// subtituir o primeiro for por um while para que sejam extraídos apenas
		// os 20 primeiros primos;
		ArrayList<Integer> primos = new ArrayList<>();
		float resto = 0;
		int count = 0;
                int countPrimos=0;
                int i=1;
 
                while(countPrimos < 20){
			resto = 0;
			count = 0;
			for (int j = 1; j <= i; j++) {
				resto = i % j;
				if (resto == 0) {
					count++;
				}
			}
			if (count == 2) {
				primos.add(i);
                                countPrimos++;
			}
            i++;
		}

		// passo 2
		// calcular a raiz quadrada fazendo arredondamento pra cima usando
		// Math.ceil(valor), armazenando em um novo array
   
                ArrayList<Integer> arrRaiz = new ArrayList<>();
                for (Integer primo : primos) {
                        arrRaiz.add((int)  Math.ceil(Math.sqrt(primo) ));
			System.out.println("Raiz arredondada: "+ 
                                (int) Math.ceil(Math.sqrt(primo)));
		}
                
                System.out.println("Maior valor: " + Collections.max(arrRaiz)); 
                System.out.println("Menor  valor: " + Collections.min(arrRaiz)); 

		// passo 3
		// imprimir o maior e o menor valor do array do passo 2.

	}

}
