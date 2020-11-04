package backend.farmacia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Cassio Seffrin
 */
public class PrincipalColecoes {
	public static void main(String a[]) throws ClassNotFoundException {

//		Cliente c = new Cliente("Cassio", "234234", "asd2342", 23, "49 34420500");
//		c.serializarEntidade(c, Cliente.ARQUIVO_SERIALIZACAO);
//		Object obj = Cliente.lerArquivoSerial(Cliente.ARQUIVO_SERIALIZACAO);
//		System.out.println(obj);

//		Farmaceutico f1 = new Farmaceutico("Cassio", "234234", "asd2342", 23, "pis234234", "pasep234234", "Cart23234234", "anvisa23q4" );
//		Farmaceutico f2 = new Farmaceutico("Janaina", "234234", "asd2342", 23, "pis234234", "pasep234234", "Cart23234234", "anvisa23q4" );
//		Farmaceutico f3 = new Farmaceutico("Maria", "234234", "asd2342", 23, "pis234234", "pasep234234", "Cart23234234", "anvisa23q4" );
//		List<Farmaceutico> l = new ArrayList<>();
//		l.add(f1);
//		l.add(f2);
//		l.add(f3);
//		Farmaceutico.serializarEntidade(l, Farmaceutico.ARQUIVO_SERIALIZACAO);

		List<Farmaceutico> lst = Farmaceutico.lerArquivoSerial(Farmaceutico.ARQUIVO_SERIALIZACAO);
		System.out.println(lst.size());

		for (Farmaceutico f : lst) {
			System.out.println(f);
		}

	}
}

class CompararNome implements Comparator<Pessoa> {
	public int compare(Pessoa m1, Pessoa m2) {
		return m1.getNome().compareTo(m2.getNome());
	}
}
