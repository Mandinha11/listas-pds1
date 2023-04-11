package atividade6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class att6 extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textN2;
	private JTextField textN1;
	private JTextField textN3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					att6 frame = new att6();
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
	public att6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(155, 11, 105, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textN2 = new JTextField();
		textN2.setColumns(10);
		textN2.setBounds(155, 130, 105, 20);
		contentPane.add(textN2);
		
		textN1 = new JTextField();
		textN1.setColumns(10);
		textN1.setBounds(155, 101, 105, 20);
		contentPane.add(textN1);
		
		textN3 = new JTextField();
		textN3.setColumns(10);
		textN3.setBounds(155, 161, 105, 20);
		contentPane.add(textN3);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(99, 14, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel = new JLabel("Nota 1");
		lblNewLabel.setBounds(99, 104, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNota_1 = new JLabel("Nota 2");
		lblNota_1.setBounds(99, 133, 46, 14);
		contentPane.add(lblNota_1);
		
		JLabel lblNota = new JLabel("Nota 3");
		lblNota.setBounds(99, 164, 46, 14);
		contentPane.add(lblNota);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = textNome.getText();
				Double N1 = Double.valueOf(textN1.getText());
				Double N2 = Double.valueOf(textN2.getText());
				Double N3 = Double.valueOf(textN3.getText());
				
				Double mediaF = (N1+N2+N3)/3.0;
				
				if(mediaF<0 || mediaF>10) {
					JOptionPane.showMessageDialog(btnCalcular, "Erro!\nDigite denovo");
				}
				if(mediaF>0 && mediaF<6) {
					JOptionPane.showMessageDialog(btnCalcular, "Reprovou! Aluno: "+nome+", Nota: "+mediaF);
				}
				if(mediaF>=6 && mediaF<=10) {
					JOptionPane.showMessageDialog(btnCalcular, "Aprovado! Aluno: "+nome+", Nota: "+mediaF);
				}
			}
		});
		btnCalcular.setBounds(155, 216, 105, 23);
		contentPane.add(btnCalcular);
	}
}
