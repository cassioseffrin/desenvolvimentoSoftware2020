package backend.farmacia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class EntidadePersistente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static <E> boolean serializarEntidade(List<E> lstEntidades, String arquivo) {
		File f = new File(arquivo);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(lstEntidades);
			oos.close();
			System.out.println("List<E> gravada com sucesso! ");
			return true;
		} catch (FileNotFoundException ex) {
			return false;
		} catch (IOException ex) {
			return false;
		}
	}
	
 
	public static <E> List<E> lerArquivoSerial(String arquivo) throws ClassNotFoundException {
		try {
			File f = new File(arquivo);
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<E> lstEntidades = (List<E>) ois.readObject();
			fis.close();
			return lstEntidades;
		} catch (IOException e) {
			System.out.println("Erro ao ler " + arquivo);
		}

		return null;
	}
	
	
	
//	public <E> boolean gravarArquivoCSV(E entidade  ,String arquivo ) {
//		try {
//			File f = new File(arquivo);
//			FileOutputStream fos = new FileOutputStream(f, true);
//			fos.write(entidade.toCSV().getBytes());
//			fos.flush();
//			fos.close();
//			System.out.printf("A Cliente %s foi salva com sucesso!\n");
//			return true;
//		} catch (IOException e) {
//			System.out.println("erro ao gravar " + arquivo);
//			return false;
//		}
//	}


}
