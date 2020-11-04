package socket.basicos;

import java.io.IOException;
import java.net.UnknownHostException;

/**
 *
 * @author Cassio Seffrin
 */
public class ClienteSocketMain {

	public static void main(String a[]) throws UnknownHostException, IOException {
		ClienteSocket client = new ClienteSocket();
		client.startConnection("localhost", 888);
		String resposta = client.sendMessage("senha123");
		System.out.println("res: " + resposta);

	}

}
