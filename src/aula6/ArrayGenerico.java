package aula6;

import java.util.Date;

public class ArrayGenerico {

	public static void imprimirArray(Integer[] elementos){
		for (int i=0; i< elementos.length; i++){
			System.out.printf("\n int %s : %s",i, elementos[i]);
		}
		
	}
	public static void imprimirArray(String[] elementos){
		for (int i=0; i< elementos.length; i++){
			System.out.printf("\n int %s : %s",i, elementos[i]);
		}
	}
	
	public static <E> void  imprimirArrayGeneric(E[] elementos){
		for (int i=0; i< elementos.length; i++){
			System.out.printf("\n int %s : %s",i, elementos[i]);
		}
		
	}
	
	public static void main (String a[]){
		Integer[] inteiros = {1,2,5,6,2,3,6};
		String[] strings = {"teste1","teste2","teste3"};
		Date[] datas = {new Date(), new Date(118,5,23)};
		imprimirArrayGeneric(inteiros);	
		imprimirArrayGeneric(strings);
		imprimirArrayGeneric(datas);
	}

}
