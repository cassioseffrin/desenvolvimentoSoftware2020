package aula5.heranca;

public abstract class Empregado extends Pessoa {
	
	private String pis;
	private String pasep;
	private String carteiraTrabalho;
	
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
