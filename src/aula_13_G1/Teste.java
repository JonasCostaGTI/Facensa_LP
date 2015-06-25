package aula_13_G1;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 28/05/2015
 */
public class Teste {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int numero_2 = numero;
		int numero_digitos = 0;
		
		
		for (int i = 0; i <numero_2; i++ ) {
			int digito = numero % 10;
			numero /= 10;
			
			if (digito != 0 ) {
				numero_digitos += 1 ;
				
			}
			
		}
		
		System.out.println("O numero digitado tem: " + numero_digitos + " digitos");
		
		
		
		
	}

}
