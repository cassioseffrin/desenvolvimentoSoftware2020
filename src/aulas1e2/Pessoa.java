package aulas1e2;

public class Pessoa {
	/*
	 * Os tipos private fazem parte do pilar da OOP encapsulamento.
	 */
	private String cpf;
	private String nome;
	private String sexo;
	private String dataNascimento;

	public void setCpf(String cpf) {
		boolean valido = validaCpf(cpf);
		if (valido == true) {
			this.cpf = cpf;
		} else {
			this.cpf = "invalido";
		}
	}

	private boolean validaCpf(String cpf) {
		if (cpf.substring(0, 1).equals("1")) {
			return true;
		} else {
			return false;
		}
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	// exemplo de polimorfismo.
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nCPF: " + this.cpf;
	}

}
