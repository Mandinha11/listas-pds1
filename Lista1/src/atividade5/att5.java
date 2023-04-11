package atividade5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class att5 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text3;
	private JTextField text2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					att5 frame = new att5();
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
	public att5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text1 = new JTextField();
		text1.setBounds(52, 136, 86, 20);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text3 = new JTextField();
		text3.setColumns(10);
		text3.setBounds(250, 136, 86, 20);
		contentPane.add(text3);
		
		text2 = new JTextField();
		text2.setColumns(10);
		text2.setBounds(152, 39, 86, 20);
		contentPane.add(text2);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double l1 = Double.valueOf(text1.getText());
				double l2 = Double.valueOf(text2.getText());
				double l3 = Double.valueOf(text3.getText());

				if ((l1 == l2) && (l1 == l3)) {
					JOptionPane.showMessageDialog(btnVerificar, "Triângulo equilátero");
				}
				if (((l1 == l2) && (l1 != l3)) || ((l2 != l1) && (l2 == l3)) || ((l1 == l3) && (l1 != l2))) {
					JOptionPane.showMessageDialog(btnVerificar, "Triângulo isóceles");
				}
				if ((l1 != l2) && (l1 != l3) && (l2 != l3)) {
					JOptionPane.showMessageDialog(btnVerificar, "Triângulo escaleno");
				}
			}
		});
		btnVerificar.setBounds(149, 203, 89, 23);
		contentPane.add(btnVerificar);
	}
}
