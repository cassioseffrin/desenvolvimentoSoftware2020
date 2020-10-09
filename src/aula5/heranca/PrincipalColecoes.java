package aula5.heranca;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import genericsAulas6e7.Filme;
public class PrincipalColecoes {
	public static void main(String a[]) {
		Pessoa pessoa1 = new Pessoa("Cassio", "0234234234", "41333443", 34);
		Pessoa pessoa2 = new Pessoa("Cassio", "0234234234", "41333443", 18);
		Pessoa pessoa3 = new Pessoa("Jose", "0234234234", "41333443",  12);
		Pessoa pessoa4 = new Pessoa("Saulo", "0234234234", "41333443", 12);
		Pessoa pessoa5 = new Pessoa("Fernada", "0234234234", "41333443", 15);
		ArrayList<Pessoa> colecaoPessoas = new ArrayList<Pessoa>();
		colecaoPessoas.add(pessoa1);
		colecaoPessoas.add(pessoa4);
		colecaoPessoas.add(pessoa2);
		colecaoPessoas.add(pessoa3);
		colecaoPessoas.add(pessoa5);
		Collections.sort(colecaoPessoas);
		Collections.reverse(colecaoPessoas);
		Collections.shuffle(colecaoPessoas);
		CompararNome comparaNome = new CompararNome();
		Collections.sort(colecaoPessoas, comparaNome);
		Collections.reverse(colecaoPessoas);
		pessoa3.imprimirColecaoPessoas(colecaoPessoas);
	}
}

class CompararNome implements Comparator<Pessoa> {
	public int compare(Pessoa m1, Pessoa m2) {
		return m1.getNome().compareTo(m2.getNome());
	}
}
