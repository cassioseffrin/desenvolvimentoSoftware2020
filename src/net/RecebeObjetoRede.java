
package net;

/**
 *
 * @author cassioseffrin
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;

import java.util.logging.Level;
import java.util.logging.Logger;

import backend.farmacia.Cliente;

/**
 *
 * @author Cassio Seffrin
 */
public class RecebeObjetoRede extends Thread {

	private ServerSocket serverSocket = null;
	private Socket socket = null;
	private ObjectInputStream inStream = null;

	public void receber() throws IOException, ClassNotFoundException {

		System.out.println("Ouvindo rede porta 5000...");
		serverSocket = new ServerSocket(5000);

		socket = serverSocket.accept();
		inStream = new ObjectInputStream(socket.getInputStream());
		Cliente cliente = (Cliente) inStream.readObject();
		System.out.println("Cliente: " + cliente);

		socket.close();

	}

	public static void main(String[] args) {
		RecebeObjetoRede server = new RecebeObjetoRede();
		try {
			server.receber();
		} catch (IOException ex) {
			Logger.getLogger(RecebeObjetoRede.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(RecebeObjetoRede.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}

//Object col = inStream.readObject();
//
//HashSet<Cliente> colecaoDeserializable = (HashSet<Cliente>) col;
//for (Cliente p : colecaoDeserializable) {
//   System.out.println(p.getNome());
//}
//
//System.out.println("Tamanho colecao: " + colecaoDeserializable.size());
