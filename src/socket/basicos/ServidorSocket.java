package socket.basicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Cassio Seffrin
 */
public class ServidorSocket {
	private ServerSocket servidor;
	private Socket cliente;
	private PrintWriter saida;
	private BufferedReader entrada;

	public void iniciarServico(int port) throws IOException {

		servidor = new ServerSocket(port);
		while (true) {
			cliente = servidor.accept();
			saida = new PrintWriter(cliente.getOutputStream(), true);
			entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			String valorEntrada = entrada.readLine();
			if ("senha".equals(valorEntrada)) {
				saida.println("senha valida");
			} else {
				saida.println("senha invalida");
			}
		}
	}

	public void stop() throws IOException {
		entrada.close();
		saida.close();
		cliente.close();
		servidor.close();
	}

	public static void main(String[] args) throws IOException {
		ServidorSocket server = new ServidorSocket();
		server.iniciarServico(888);
	}
}