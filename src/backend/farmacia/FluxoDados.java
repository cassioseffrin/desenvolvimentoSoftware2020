package backend.farmacia;

import java.util.ArrayList;

public interface FluxoDados {

	public boolean gravarArquivoCSV( )  ;
	
//	public boolean gravarArquivoSerial();
	
	public ArrayList<Pessoa> lerTodos();
	
	public void imprimirColecaoPessoas(ArrayList<Pessoa> lst);

//	Pessoa lerArquivoSerial() throws ClassNotFoundException;

}
