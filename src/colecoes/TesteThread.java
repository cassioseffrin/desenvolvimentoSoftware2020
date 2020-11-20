package colecoes;

public class TesteThread {

	public static void main(String a[]) {
		TestePerformance t0 = new TestePerformance();
		TestePerformance t1 = new TestePerformance();
		TestePerformance t2 = new TestePerformance();
		TestePerformance t3 = new TestePerformance();
		TestePerformance t4 = new TestePerformance();
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();		
	}

}
