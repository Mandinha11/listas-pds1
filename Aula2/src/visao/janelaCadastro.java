package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.Funcionario;
import controle.FuncionarioDAO;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaCadastro frame = new janelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public janelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 418);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(189, 39, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setForeground(Color.CYAN);
		txtCpf.setBackground(Color.WHITE);
		txtCpf.setBounds(189, 70, 86, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblNOME = new JLabel("Nome:");
		lblNOME.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNOME.setBounds(133, 39, 46, 20);
		contentPane.add(lblNOME);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(133, 73, 46, 14);
		contentPane.add(lblCPF);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Dar uma olhada
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				
				if(nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido!");
				}
				if(nome.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Nenhum nome preenchido!");
			}
				Funcionario func = new Funcionario ();
				func.setNome(nome);
				func.setCpf(Long.valueOf(cpf));
				
				//FuncionarioDAO banquinhoDeDados = FuncionarioDAO.get
				FuncionarioDAO bdPessoa = FuncionarioDAO.getInstance();
				bdPessoa.inserir(func);
			}
		
		
		});
		btnSalvar.setBackground(Color.CYAN);
		btnSalvar.setBounds(154, 279, 165, 39);
		contentPane.add(btnSalvar);
		
		
		JTextPane txtpnCadastro = new JTextPane();
		txtpnCadastro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnCadastro.setForeground(new Color(255, 175, 175));
		txtpnCadastro.setBackground(Color.BLACK);
		txtpnCadastro.setText("                                       Cadastro");
		txtpnCadastro.setBounds(0, 0, 479, 26);
		contentPane.add(txtpnCadastro);
	}
}
