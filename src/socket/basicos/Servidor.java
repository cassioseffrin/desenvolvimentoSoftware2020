package socket.basicos;

import java.io.*;
import java.net.*;

/**
 *
 * @author Cassio Seffrin
 */
class Servidor {
	String textoDoCliente;
	String sentencaMaiuscula;
	ServerSocket modificadorDeStrings;

	Servidor() throws IOException {
		modificadorDeStrings = new ServerSocket(8000);
		System.out.println("Servidor iniciado na porta: 8000");
		while (true) {
			Socket connectionSocket = modificadorDeStrings.accept();
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream retornaAoCliente = new DataOutputStream(connectionSocket.getOutputStream());
			textoDoCliente = inFromClient.readLine();
			System.out.println("texto original cripto: " + textoDoCliente);
			String textoDecriptado = Criptografia.decriptar(textoDoCliente);
			System.out.println("Mensagem Recebida: " + textoDecriptado);
			sentencaMaiuscula = textoDecriptado.toUpperCase();
			retornaAoCliente.writeBytes(Criptografia.encriptar(sentencaMaiuscula) + "\n");
		}
	}

	public static void main(String argv[]) throws Exception {
		new Servidor();
	}

}
