package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FramePrincipal extends JFrame {
	public FramePrincipal() {
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(new Painel(), BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new FramePrincipal().setVisible(true);
	}
}