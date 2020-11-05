package testes;

import java.util.List;

import backend.farmacia.Farmaceutico;
import database.dao.FarmaceuticoDao;

public class TesteMysql {

	public static void main(String a[]) throws ClassNotFoundException {		
		apagar();
	}

	private static void listagemFarma() {
		FarmaceuticoDao dao = new FarmaceuticoDao();
		List<Farmaceutico> lst = dao.listar();
		
		for (Farmaceutico f: lst) {
			System.out.println(f);
		}
		dao.closeConnection();
	}

	
	private static void apagar() {
		FarmaceuticoDao dao = new FarmaceuticoDao();
		dao.remover(4);
		dao.closeConnection();
	}
	private static void inserirFarmaceutico() {
		Farmaceutico f2 = new Farmaceutico("Juliana", "234234", "asd2342", 23, "pis234234", "pasep234234",
				"Cart23234234", "anvisa23q4");
		FarmaceuticoDao dao = new FarmaceuticoDao();
		dao.inserir(f2);
		dao.closeConnection();
	}

}
