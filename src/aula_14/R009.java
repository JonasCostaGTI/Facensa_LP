package aula_14;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 11/06/2015
 */
public class R009 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero")); 
		
		int quandrado_do_numero = calcula_quandrado_numero(numero);
		
		
		int numero_impar = pega_soma_primo(quandrado_do_numero);
		System.out.println("quadrado " +  numero_impar);
		

	}

	private static int pega_soma_primo(int quandrado_do_numero) {
		int soma = 0;
		for (int i = 0; soma < quandrado_do_numero; i++) {
			 int impar = i % 2;
			 
			if (impar != 0) {
				soma += i;
				
			}
			 
		}
		return soma;
	}

	private static int calcula_quandrado_numero(int numero) {
		return numero * numero;
	}

	
	

}
