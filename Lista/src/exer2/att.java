package exer2;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class att {
	
	public static void main(String[] args) {

	    ArrayList<String> nome = new ArrayList();
	    
	    for(int i = 0; i < 10; i++) {
	   nome.add(JOptionPane.showInputDialog("Digite seu nome"));
	   
	    }
	    
	    JOptionPane.showMessageDialog(null, nome);
}
}
	


