package aula4.exercicios;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
*
* @author Cassio Seffrin
*/
public class Exercicio1a4 {
	enum lista {
		JANEIRO, FEVEIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO
	};

	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		int mesInt=-1;
		System.out.println("Digite o numero de mes de 0 a 11 ");
		try {
			mesInt = scan.nextInt();
		} catch (Exception e) {
			System.out.println("A entranda deve ser numerica" );
			System.out.println("Detalhes: " + e.toString() );
			return;
		}  
		
		if (mesInt <0 ) {
			System.out.println("O mes nao pode ser negativo");
			return ;
		}else if ( mesInt> 11) {
			System.out.println("O mes nao pode ser menor que 11");
			return;
		}
		System.out.println("Mes em extenso: " + lista.values()[mesInt]);
		scan.close();
	}
}
