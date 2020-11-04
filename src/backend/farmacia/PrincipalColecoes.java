package backend.farmacia;
import java.util.Comparator;
import java.util.List;
public class PrincipalColecoes {
	public static void main(String a[]) throws ClassNotFoundException {
			 
//		Farmaceutico f1 = new Farmaceutico("Cassio", "234234", "asd2342", 23, "pis234234", "pasep234234", "Cart23234234", "anvisa23q4" );
//		Farmaceutico f2 = new Farmaceutico("Janaina", "234234", "asd2342", 23, "pis234234", "pasep234234", "Cart23234234", "anvisa23q4" );
//		Farmaceutico f3 = new Farmaceutico("Maria", "234234", "asd2342", 23, "pis234234", "pasep234234", "Cart23234234", "anvisa23q4" );
//	
//		List<Farmaceutico> listaFarmaceuticos = new ArrayList<>();
//		listaFarmaceuticos.add(f1);
//		listaFarmaceuticos.add(f2);
//		listaFarmaceuticos.add(f3);
//		
//		Farmaceutico.serializarEntidade(listaFarmaceuticos, Farmaceutico.ARQUIVO_SERIALIZACAO);
//		
		List<Farmaceutico> lstFarmaceuticos = Farmaceutico.lerArquivoSerial(Farmaceutico.ARQUIVO_SERIALIZACAO);
		
//		Farmaceutico f4 = new Farmaceutico("Max", "234234", "asd2342", 23, "pis234234", "pasep234234", "Cart23234234", "anvisa23q4" );
//		lstFarmaceuticos.add(f4);
//		
//		
//		Farmaceutico.serializarEntidade(lstFarmaceuticos, Farmaceutico.ARQUIVO_SERIALIZACAO);
		
		System.out.println("Tamanho da lista: "+ lstFarmaceuticos.size());
		for(Farmaceutico f : lstFarmaceuticos) {
			System.out.printf("\nNome farmaceutico: %s, cpf: %s" ,f.getNome() , f.getCpf());
		}
//		
 
//		Farmaceutico fp = new Farmaceutico("Cassio", "234234", "asd2342", 23, "pis234234", "pasep234234", "Cart23234234", "anvisa23q4" );
//		fp.setIdade(23);
//		
//		int resultado = Collections.binarySearch(lstFarmaceuticos, fp);
//		if (resultado >= 0)
//			System.out.printf("Encontrado %d\n", resultado);
//		else
//			System.out.printf("Nao Encontrado (%d)\n", resultado);
//		
 
	}
}

class CompararNome implements Comparator<Pessoa> {
	public int compare(Pessoa m1, Pessoa m2) {
		return m1.getNome().compareTo(m2.getNome());
	}
}
