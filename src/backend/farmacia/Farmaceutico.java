package backend.farmacia;

import java.io.Serializable;

/**
 *
 * @author Cassio Seffrin
 */
public class Farmaceutico extends Funcionario implements Serializable {

	private static final long serialVersionUID = 5367241821644492598L;

	public static String ARQUIVO = "/Users/cassioseffrin/farmacia/farmaceutico.csv";
	public static String ARQUIVO_SERIALIZACAO = "/Users/cassioseffrin/farmacia/farmaceutico.serial";

	public String registroAnvisa;

	public String getRegistroAnvisa() {
		return registroAnvisa;
	}

	public void setRegistroAnvisa(String registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}

	public Farmaceutico(String nome, String cpf, String rg, Integer idade, String pis, String pasep,
			String carteiraTrabalho, String registroAnvisa) {
		super(nome, cpf, rg, idade, pis, pasep, carteiraTrabalho);
		this.registroAnvisa = registroAnvisa;
	}

	@Override
	public String toString() {
		String farmaStr = String.format("\nId: %s, Nome: %s, cpf: %s, anvisa: %s ", getId(), getNome(), getCpf(),
				getRegistroAnvisa());
		return farmaStr;
	}

}
