package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelCliente extends JPanel implements ActionListener {
	private JTextField textFieldNome;
	private JLabel labelNome;
	private JTextField TextFieldCPF;
	private JLabel labelCPF;

	private JButton btnSalvar;
	private JButton btnCancelar;

	public PainelCliente() {

		GridLayout gd = new GridLayout(0, 2);
		setLayout(gd);
		btnSalvar = new JButton("Salvar");
		btnCancelar = new JButton("Cancelar");
		textFieldNome = new JTextField(40);
		labelNome = new JLabel("Nome do Cliente:");
		TextFieldCPF = new JTextField(40);
		labelCPF = new JLabel("CPF:");
		add(labelNome);
		add(textFieldNome);
		add(labelCPF);
		add(TextFieldCPF);
		add(btnCancelar);
		add(btnSalvar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnSalvar) {
			System.out.println("salvar");
		}
	}
}
