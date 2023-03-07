package lista;

import java.util.Scanner;

public class att1 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
	
		System.out.println(" Digite o preço do litro");
		Double precoLitro = Double.nextLine();
		
		System.out.println("Digite a quantidade de litro");
		Integer quantidadeLitros = Integer.valueOf(leitura.nextLine());
		
		public Integer calculoTotal (double precoLitro, Integer quantidadelitros) {
		
		return  precoLitro * quantidadeLitros;
		
		}
		
	}

}
