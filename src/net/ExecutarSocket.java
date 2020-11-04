package net;

 
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import backend.farmacia.Cliente;

/**
 *
 * @author cassioseffrin
 */
public class ExecutarSocket implements Runnable {

    private final Socket clienteSocket;
    private ObjectInputStream inStream = null;

    ExecutarSocket(Socket clienteSocket) {
        this.clienteSocket = clienteSocket;
    }

    @Override
    public void run() {
        try {
            System.out.println("temos um cliente !");
            // processamento do request
            System.out.println("IP do cliente: " + clienteSocket.getInetAddress());
            OutputStream opt = clienteSocket.getOutputStream();
            opt.write(String.format("alou cliente %s ", clienteSocket.getInetAddress()).getBytes());
            opt.flush();
            inStream = new ObjectInputStream(clienteSocket.getInputStream());
            Cliente cliente = (Cliente) inStream.readObject();
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Telefone: " + cliente.getTelefone());

            try {
                clienteSocket.close();
            } catch (IOException e) {
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ServidorThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
