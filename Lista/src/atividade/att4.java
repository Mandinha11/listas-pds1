package atividade;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class att4 extends JFrame {

	private JPanel contentPane;
	private JTextField text2;
	private JTextField text1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					att4 frame = new att4();
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
	public att4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSoma = new JButton("Soma");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double inp1 = Double.valueOf(text1.getText());
				Double inp2 = Double.valueOf(text2.getText());
				
				Double soma = inp1 + inp2;
				
				JOptionPane.showMessageDialog(btnSoma, "A soma de tudo foi: " + soma);
			}
			
		});
		btnSoma.setBounds(10, 122, 85, 23);
		contentPane.add(btnSoma);
		
		text1 = new JTextField();
		text1.setBounds(58, 45, 86, 20);
		text1.setColumns(10);
		contentPane.add(text1);
		
		text2 = new JTextField();
		text2.setBounds(211, 45, 86, 20);
		contentPane.add(text2);
		text2.setColumns(10);
		
		JButton btnMenos = new JButton("Subtração");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(text1.getText());
				Long inp2 = Long.valueOf(text2.getText());
				
				Long sub = inp1 - inp2;
				
				JOptionPane.showMessageDialog(btnMenos, "O resultado da conta de subtração é: " + sub);
			
			}
		});
		btnMenos.setBounds(105, 122, 96, 23);
		contentPane.add(btnMenos);
		
		JButton btnDivisao = new JButton("Divisão");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Long inp1 = Long.valueOf(text1.getText());
				Long inp2 = Long.valueOf(text2.getText());
				
				Long div = inp1 / inp2;
				
				JOptionPane.showMessageDialog(btnDivisao, "A multiplicação é: " + div);
			}
	});
		btnDivisao.setBounds(211, 122, 86, 23);
		contentPane.add(btnDivisao);
		
		JButton btnMultiplicação = new JButton("Multiplicação");
		btnMultiplicação.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(text1.getText());
				Long inp2 = Long.valueOf(text2.getText());
				
				Long mult = inp1 * inp2;
				
				JOptionPane.showMessageDialog(btnMultiplicação, "A multiplicação é: " + mult);
			
			}
		});
		btnMultiplicação.setBounds(311, 122, 102, 23);
		contentPane.add(btnMultiplicação);
	}
}
