package socket.basicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Cassio Seffrin
 */
public class ClienteSocket {
	private Socket clienteSocket;
	private PrintWriter saida;
	private BufferedReader entrada;

	public void startConnection(String ip, int port) throws UnknownHostException, IOException {
		clienteSocket = new Socket(ip, port);
		saida = new PrintWriter(clienteSocket.getOutputStream(), true);
		entrada = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
	}

	public String sendMessage(String msg) throws IOException {
		saida.println(msg);
		String resp = entrada.readLine();
		return resp;
	}

	public void interromper() throws IOException {
		entrada.close();
		saida.close();
		clienteSocket.close();
	}
}