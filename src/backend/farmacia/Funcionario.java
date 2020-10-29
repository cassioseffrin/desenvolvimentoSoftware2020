package backend.farmacia;

public class Funcionario extends Pessoa {
 
	private static final long serialVersionUID = -167730181170170139L;
	
	private String pis;
	private String pasep;
	private String carteiraTrabalho;
	
	

	public Funcionario(String nome, String cpf, String rg, Integer idade, String pis, String pasep,
			String carteiraTrabalho) {
		super(nome, cpf, rg, idade);
		this.pis = pis;
		this.pasep = pasep;
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public String getPasep() {
		return pasep;
	}

	public void setPasep(String pasep) {
		this.pasep = pasep;
	}
 
	

}
