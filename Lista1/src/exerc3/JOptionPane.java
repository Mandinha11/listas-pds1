package exerc3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JOpitonPane {
public static void main(String[] args) {

	 Scanner leitura = new Scanner(System.in);

	 Double n1, n2, n3, media = 0.0;

	 fm = JOptionPane.showInputDialog(null,"Informe F/m para seu sexo:");
	    String fm = leitura.nextLine();

	 nota1 = JOptionPane.showInputDialog(null,"Informe a sua nota:");
	    String nota1 = leitura.nextLine();

	 nota2 = JOptionPane.showInputDialog(null,"Informe a sua nota:");
	    String nota2 = leitura.nextLine();

	 nota3 = JOptionPane.showInputDialog(null,"Informe a sua nota:");
	    String nota3 = leitura.nextLine();

	        n1 = Double.valueOf(nota1);
	        n2 = Double.valueOf(nota2);
	        n3 = Double.valueOf(nota3);

	 media = (n1 + n2 + n3)/3;

	if( media >= 6){

	JOptionPane.showMessageDialog(null, Aprovado);

	}

	if( media >= 4 || media < 6){

	JOptionPane.showMessageDialog(null, Em recuperação);

	}

	if( media < 4){

	JOptionPane.showMessageDialog(null,Reprovado);

	}

}
	}


