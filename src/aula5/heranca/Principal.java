package aula5.heranca;

public class Principal {
	
	public static void main (String a[]) {
		

		EmpregadoAssalariado cassio = new EmpregadoAssalariado();
		cassio.setNome("Cassio");
		cassio.setCpf("234234234");
		cassio.setCarteiraTrabalho("CTA3234234");
		cassio.setPis("234234234");
		cassio.setSalario(10000.00);
		cassio.setRg("42234234 SSP");
		
		System.out.println(cassio);
		
		
		
		EmpregadoComissionado maria = new EmpregadoComissionado();
		maria.setNome("Maria");
		maria.setCpf("234234234");
		maria.setCarteiraTrabalho("CTA3234234");
		maria.setPis("234234234");
		maria.setComissao(10.00);
		maria.setRg("42234234 SSP");
		
		EmpregadoBaseComissionado jose = new EmpregadoBaseComissionado();
		jose.setNome("Jose");
		jose.setCpf("234234234");
		jose.setCarteiraTrabalho("CTA3234234");
		jose.setPis("234234234");
		jose.setComissao(10.00);
		jose.setRg("42234234 SSP");
		jose.setComissao(20);
		jose.setSalarioBase(1000.00);
		
	}

}
