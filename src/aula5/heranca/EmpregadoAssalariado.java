package aula5.heranca;

public class EmpregadoAssalariado extends Empregado{
	
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: "+this.getNome() + " CPF: "+this.getCpf() +" Salario: "+this.getSalario();
	}

}
