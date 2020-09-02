package aulas1e2;

class PrincipalMatematica {

	public static void main(String array[]) {
		float n1 = Float.parseFloat(array[0]);
		float n2 = Float.parseFloat(array[1]);
		System.out.println("parametro 1:" + n1);
		System.out.println("parametro 2:" + n2);
		Matematica mat = new Matematica();
		System.out.println("resultado de n1*n2: " + mat.multiplica(n1, n2));
		System.out.println("raiz de n1:  " + mat.raiz(n1));
		System.out.println("resultado de n1/n2: " + mat.divisao(n1, n2));
		System.out.println("resultado de n1+n2: " + mat.adicao(n1, n2));
		System.out.println("resultado de n1-n2: " + mat.subtracao(n1, n2));
	}
}
