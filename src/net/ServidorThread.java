package net;

/**
 * @author cassioseffrin
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Cassio Seffrin
 */
public class ServidorThread {

	private final ServerSocket serverSocket = null;
	private final Socket socket = null;

	public void iniciarServidor() {
		final ExecutorService clientProcessingPool = Executors.newFixedThreadPool(10);
		Runnable serverTask = new Runnable() {
			@Override
			public void run() {
				try {
					ServerSocket serverSocket = new ServerSocket(5000);
					System.out.println("ouvindo no socket 5000...");
					while (true) {
						Socket clienteSocket = serverSocket.accept();
						clientProcessingPool.submit(new ExecutarSocket(clienteSocket));
					}
				} catch (IOException e) {
					System.err.println("nao foi possivel processar request");
				}
			}
		};
		Thread serverThread = new Thread(serverTask);
		serverThread.start();

	}

	public static void main(String[] args) {
		new ServidorThread().iniciarServidor();
	}

}
