package aula4.exercicios;
public class EncontreDividendoRecursivo {
	public static void main(String a[]){
		int divisores[] = {2,3,4};
		int dividendo = 13;
		System.out.println("Menor Dividendo: " +encontreDividendo(divisores, dividendo));
		System.out.println("Menor Dividendo Recursivo: " +encontreDividendoRecursivo(divisores, dividendo));
	}

	private static int encontreDividendo(int[] divisores, int dividendo) {
		while(true){
			for (int d: divisores ){
				if (dividendo % d == 0){
					return dividendo;
				}
			}
			dividendo++;
		}
	}
	
	
	private static int encontreDividendoRecursivo(int[] divisores, int dividendo) {
		boolean encontrado = false;
		for (int i : divisores) {
			if (dividendo % i == 0) {
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			return encontreDividendoRecursivo(divisores, ++dividendo);
		}else{
		return dividendo;
		}
	}

}
