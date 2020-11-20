package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class FramePrincipal extends JFrame implements ActionListener {
	private JMenuBar menuPrincipalMB;
	private JMenu cadastrosM;
	private JMenu relatoriosM;
	private JMenu ajudaM;
	private JMenu sairM;
	private JMenuItem funcionarioMI;
	private JMenuItem clienteMI;
	private PainelCliente painelCliente;
	public FramePrincipal() {
		getContentPane().setLayout(new BorderLayout());
		painelCliente = new PainelCliente();
		menuPrincipalMB = new JMenuBar();
		funcionarioMI = new JMenuItem("Cadastro de Funcionário");
		funcionarioMI.addActionListener(this);
		clienteMI = new JMenuItem("Cadastro de Cliente");
		clienteMI.addActionListener(this);
		cadastrosM = new JMenu("Cadastros");
		relatoriosM = new JMenu("Relatórios");
		ajudaM = new JMenu("Ajuda");
		sairM = new JMenu("Sair");
		sairM.addActionListener(this);
		menuPrincipalMB.add(cadastrosM);
		menuPrincipalMB.add(relatoriosM);
		menuPrincipalMB.add(ajudaM);
		menuPrincipalMB.add(sairM);
		cadastrosM.add(funcionarioMI);
		cadastrosM.add(clienteMI);
		PainelCliente barra = new PainelCliente();
		JPanel painelMenu = new JPanel();
		painelMenu.add(menuPrincipalMB);
		getContentPane().add(painelMenu, BorderLayout.NORTH);
		getContentPane().add(new BarraStatus(), BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		FramePrincipal f = new FramePrincipal();
		f.setSize(new Dimension(800, 600));
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clienteMI) {
			System.out.println("pediu para inserir um cliente");
			getContentPane().add(painelCliente, BorderLayout.CENTER);
			revalidate();
			repaint();
		}
		if (e.getSource() == funcionarioMI) {
			System.out.println("sair");
			getContentPane().remove(painelCliente);
			revalidate();
			repaint();
		}
	}
}