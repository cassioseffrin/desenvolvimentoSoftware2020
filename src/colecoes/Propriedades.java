package colecoes;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author Cassio Seffrin
 */
public class Propriedades {
	private Properties tabela;

	public Propriedades() {
		// cria tabela Properties
		tabela = new Properties();
		tabela.setProperty("cor", "azul");
		tabela.setProperty("largura", "200");
		System.out.println("depois de setar  properties");
		listaDePropriedades();
		// substitui o valor da propriedade
		tabela.setProperty("cor", "vermelho");
		System.out.println("depois de  repasar properties");
		listaDePropriedades();
		salvarPropriedades();
		tabela.clear();

		System.out.println("depois de limpar  properties");
		listaDePropriedades();
		carregarPropriedades();

		Object value = tabela.getProperty("cor");

		// verifica se o valor esta na tabela
		if (value != null)
			System.out.printf("proriedade cor valor eh %s\n", value);
		else
			System.out.println("proriedade cor nao esta na tabela");
	}

	// salva as propriedades em um arquivo
	public void salvarPropriedades() {

		try {
			FileOutputStream output = new FileOutputStream("props.dat");
			tabela.store(output, "exemplo Properties");
			output.close();
			System.out.println("depois de  salvar as propriedades");
			listaDePropriedades();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}

	// carrega as propriedades de um arquivo
	public void carregarPropriedades() {
		// carrega o conteudo de tabela
		try {
			FileInputStream input = new FileInputStream("props.dat");
			tabela.load(input);// carrega propriedades
			input.close();
			System.out.println("depois de carregar  properties");
			listaDePropriedades(); // exibe os valores da propriedade
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}

	public void listaDePropriedades() {
		Set<Object> keys = tabela.keySet(); // obtem nomes de propriedade

		for (Object key : keys) {
			System.out.printf("%s\t%s\n", key, tabela.getProperty((String) key));
		}

		System.out.println();
	}

	public static void main(String args[]) {
		new Propriedades();
	}
}
