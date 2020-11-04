package testes;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String senha = sc.next();
		while (!senha.equals("Johnny")) {
			System.out.println("Senha Invalida");
			senha = sc.next();
		}

		System.out.println("Acesso Permitido");
		sc.close();
	}
}