package net;

import java.io.FileInputStream;

/**
 *
 * @author cassioseffrin
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import backend.farmacia.Cliente;

/**
 *
 * @author Cassio Seffrin
 */
public class EnviaObjetosRede {

	private Socket socket = null;
	private ObjectInputStream inputStream = null;
	private ObjectOutputStream outputStream = null;
	private boolean isConnected = false;

	public void enviar() {
		while (!isConnected) {
			try {
				socket = new Socket("localhost", 5000);
				System.out.println("Conectado!");
				isConnected = true;
				outputStream = new ObjectOutputStream(socket.getOutputStream());
				Cliente cliente = new Cliente();
				cliente.setNome("Cassio");
				cliente.setTelefone("3442-1515");
				cliente.setAltura(1.8);
				cliente.setCpf("23423049235");
				cliente.setIdade(34);
				cliente.setRg("23425235");
				outputStream.writeObject(cliente);
				System.out.println("objeto enviado!");
				InputStream fis = socket.getInputStream();
				int content;
				while ((content = fis.read()) != -1) {
					System.out.print((char) content);
				}
			} catch (SocketException se) {
				se.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		EnviaObjetosRede envia = new EnviaObjetosRede();
		envia.enviar();
	}
}
