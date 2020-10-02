package aula6;

import java.util.Date;

public class ArraysMain {
	
	
	public static void main (String a[]){
		Integer[] inteiros = {1,2,5,6,2,3,6};
		String[] strings = {"teste1","teste2","teste3"};
		Date[] datas = {new Date(), new Date(118,5,23)};
		
		ArrayGenerico.imprimirArray(inteiros);
		ArrayGenerico.imprimirArray(strings);
		ArrayGenerico.imprimirArray(datas);
		
		ArrayGenerico.imprimirArrayGeneric(inteiros);
		ArrayGenerico.imprimirArrayGeneric(strings);
		ArrayGenerico.imprimirArrayGeneric(datas);
 
	
	}


}
