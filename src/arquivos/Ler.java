package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 *
 * @author Cassio Seffrin
 */
public class Ler {

	public static void main(String a[]) throws FileNotFoundException, IOException, ClassNotFoundException {

		File f = new File("/Users/cassioseffrin/pessoa.txt");

		if (!f.exists()) {
			f.createNewFile();
		}
		FileInputStream fis = new FileInputStream(f);

		ObjectInputStream objLeitura = new ObjectInputStream(fis);
		System.out.println(objLeitura.readObject());

		objLeitura.close();

		fis.close();

		// linha por linha
		Scanner scanner = new Scanner(fis);

		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}

		scanner.close();

		Scanner in = new Scanner(System.in);

		int i = in.nextInt();
		String s = in.next();

		System.out.println("entrada: " + s);
		System.out.println("entrada: " + i);

	}
}
