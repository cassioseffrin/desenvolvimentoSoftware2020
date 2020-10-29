package backend.farmacia;
import java.util.Comparator;
public class PrincipalColecoes {
	public static void main(String a[]) throws ClassNotFoundException {
		
//		Cliente c = new Cliente("Cassio", "234234", "asd2342", 23, "49 34420500");
//		c.serializarEntidade(c, Cliente.ARQUIVO_SERIALIZACAO);
//		Object obj = Cliente.lerArquivoSerial(Cliente.ARQUIVO_SERIALIZACAO);
//		System.out.println(obj);
		
		 
		
		
		Farmaceutico f = new Farmaceutico("Cassio", "234234", "asd2342", 23, "pis234234", "pasep234234", "Cart23234234", "anvisa23q4" );
		Farmaceutico.serializarEntidade(f, Farmaceutico.ARQUIVO_SERIALIZACAO);
		Object obj2 = Farmaceutico.lerArquivoSerial(Farmaceutico.ARQUIVO_SERIALIZACAO);
		System.out.println(obj2);
 
	}
}

class CompararNome implements Comparator<Pessoa> {
	public int compare(Pessoa m1, Pessoa m2) {
		return m1.getNome().compareTo(m2.getNome());
	}
}
