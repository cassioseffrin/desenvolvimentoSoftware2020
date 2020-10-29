package backend.farmacia;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Pessoa implements Serializable, FluxoDados {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String ARQUIVO = "/Users/cassioseffrin/farmacia/cliente.csv";
	public static String ARQUIVO_SERIALIZACAO = "/Users/cassioseffrin/farmacia/cliente.serial";

	private String telefone;

	public Cliente(String nome, String cpf, String rg, Integer idade, String telefone) {
		super(nome, cpf, rg, idade);
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return super.toString() + " telefone cliente: " + getTelefone();
	}

	@Override
	public boolean gravarArquivoCSV() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Pessoa> lerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void imprimirColecaoPessoas(ArrayList<Pessoa> lst) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public ArrayList<Cliente> lerTodos() {
//
//		try {
//			File f = new File(ARQUIVO);
//			FileInputStream fis = new FileInputStream(f);
//			Scanner scanner = new Scanner(fis);
//			ArrayList<Cliente> colecaoClientes = new ArrayList<>();
//			while (scanner.hasNextLine()) {
//				String linha = scanner.nextLine();
//				String[] arrCliente = linha.split(";");
//				Cliente p = new Cliente(arrCliente[0], arrCliente[1], arrCliente[2], Integer.parseInt(arrCliente[3]));
//				colecaoClientes.add(p);
//			}
//			scanner.close();
//			return colecaoClientes;
//
//		} catch (IOException e) {
//			System.out.println("Erro ao ler " + ARQUIVO);
//
//		}
//		return null;
//	}


}
