package genericsAulas6e7;

import java.util.Date;

/**
*
* @author Cassio Seffrin
*/
public class ArrayGenerico {

	public static void imprimirArray(Integer[] elementos){
		for (int i=0; i< elementos.length; i++){
			System.out.printf("\n int %s : %s",i, elementos[i]);
		}
		
	}
	public static void imprimirArray(String[] elementos){
		for (int i=0; i< elementos.length; i++){
			System.out.printf("\n String %s : %s",i, elementos[i]);
		}
	}
	
	public static void imprimirArray(Date[] elementos){
		for (int i=0; i< elementos.length; i++){
			System.out.printf("\n Date %s : %s",i, elementos[i]);
		}
	}
	
	public static <E> void imprimirArrayGeneric(E[] elementos){
		for (int i=0; i < elementos.length; i++){
			System.out.printf("\n Elemento <E>: %s : %s",i, elementos[i]);
		}
	}
}
