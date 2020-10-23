package socket.basicos;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	Cliente() throws UnknownHostException, IOException {
		String sentenca;
		String sentencaMaiuscula;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma entrada:");
		sentenca = scan.next();
		Socket clientSocket = new Socket("localhost", 9000);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		outToServer.writeBytes(Criptografia.encriptar(sentenca) +"\n");
		sentencaMaiuscula = inFromServer.readLine();
		System.out.println("Mensagem do servidor: " +  Criptografia.decriptar(sentencaMaiuscula));
		clientSocket.close();
	}
	
	
	void metodoComStringBuffer() throws UnknownHostException, IOException {
		String sentenca;
		String sentencaMaiuscula;
		BufferedReader scannerEntradaStream = new BufferedReader(new InputStreamReader(System.in));
		Socket clientSocket = new Socket("127.0.0.1", 9000);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		sentenca = scannerEntradaStream.readLine();
		outToServer.writeBytes(sentenca + "\n");
		sentencaMaiuscula = inFromServer.readLine();
		System.out.println("Mensagem do servidor: " + sentencaMaiuscula);
		clientSocket.close();
	}
	
	public static void main (String a[]) throws UnknownHostException, IOException {
		new Cliente();
	}

	
}
