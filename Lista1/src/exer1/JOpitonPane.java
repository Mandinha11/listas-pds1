package exer1;
import javax.swing.JOptionPane;

public class JOpitonPane {
	public static void main(String[] args) {
	  
     String precoLitro = JOptionPane.showInputDialog("Insira o preço do litro");
     String quantidadeLitros = JOptionPane.showInputDialog("Insira a quantidade de litros");
     
     Double preco = Double.valueOf(precoLitro);
     Integer quantidade = Integer.valueOf(quantidadeLitros);
     
     JOptionPane.showMessageDialog(null, "o valor total a pagar é" + totalPagamento(preco,quantidade));
     
	}
     public static double totalPagamento (double precoLitro, Integer quantidadeLitros){
     return (precoLitro * quantidadeLitros);

     }

}

