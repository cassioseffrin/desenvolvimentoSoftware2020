package socket.basicos;

import java.io.*;
import java.net.*;

class Servidor {
	String textoDoCliente;
	String sentencaMaiuscula;
	ServerSocket modificadorDeStrings;

	Servidor() throws IOException {
		modificadorDeStrings = new ServerSocket(9000);
		System.out.println("Servidor iniciado na porta: 9000");
		while (true) {
			Socket connectionSocket = modificadorDeStrings.accept();
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream retornaAoCliente = new DataOutputStream(connectionSocket.getOutputStream());
			textoDoCliente = inFromClient.readLine();
			String textoDecriptado = Criptografia.decriptar( textoDoCliente);
			System.out.println("Mensagem Recebida: " + textoDecriptado);
			sentencaMaiuscula = textoDecriptado.toUpperCase() ;
			retornaAoCliente.writeBytes(Criptografia.encriptar(sentencaMaiuscula));
		}
	}

	public static void main(String argv[]) throws Exception {
		new Servidor();
	}

}
