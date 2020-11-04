package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import backend.farmacia.Pessoa;

/**
 *
 * @author Cassio Seffrin
 */
public class LerGravarSerie {

	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {

//		Pessoa p1 = new Pessoa("Cassio", "024443234", "3188234", 32);
//		Pessoa p3 = new Pessoa("Cassio", "024443234", "3188234", 32);

//		if (p1.equals(p3)) {
//			System.out.println("ok");
//		}else {
//			System.out.println("not ok");
//		}

//		Pessoa p2 = new Pessoa("Janaina", "024443234", "3188234", 28);
//		Set<Pessoa> colecaoPessoa = new HashSet<>();
//		colecaoPessoa.add(p2);
//		colecaoPessoa.add(p1);

		File f = new File("/Users/cassioseffrin/colecaoPessoas.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(colecaoPessoa);
		//
//	        
//	       
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object col = ois.readObject();
		Set<Pessoa> colecaoDeserializable = (Set<Pessoa>) col;

		System.out.println("Tamanho colecao: " + colecaoDeserializable.size());
		oos.flush();
		oos.close();
		for (Pessoa p : colecaoDeserializable) {
			System.out.println(p);
		}

//		File f2 = new File("/Users/cassioseffrin/teste.txt");
//		if (!f2.exists()) {
//			f2.createNewFile();
//		}
//		FileOutputStream fos2 = new FileOutputStream(f2, true);
//		fos2.write("texto a gravar".getBytes());
//		fos2.flush();
//		fos2.close();
//
//		FileInputStream fis2 = new FileInputStream(f2);
//		Scanner scanner = new Scanner(fis2);
//		while (scanner.hasNextLine()) {
//			System.out.println(scanner.nextLine());
//		}
//		scanner.close();

	}
}
