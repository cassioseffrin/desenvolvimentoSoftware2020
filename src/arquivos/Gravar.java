package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import backend.farmacia.Pessoa;

/**
 *
 * @author Cassio Seffrin
 */
public class Gravar {

	public static boolean gravarArquivo(File f, Pessoa pessoa) throws FileNotFoundException, IOException {

		// File f = new File("/Users/cassioseffrin/teste.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(f, true);

		ObjectOutputStream objGravar = new ObjectOutputStream(fos);

		objGravar.writeObject(pessoa);

		objGravar.flush();

		objGravar.close();

		// fos.write("Nome".getBytes());
		fos.flush();
		fos.close();

		return true;

	}

}
