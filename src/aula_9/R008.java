package aula_9;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 30/04/2015
 */
public class R008 {
	
	public static void main(String[] args){
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para saber seu fatorial: "));
		int resulatado = R008.calcula_fatorial(numero);
		
		System.out.printf("O fatorial do numero %d é: %d", numero, resulatado);
		
	}

	private static int calcula_fatorial(int numero) {
		int total = 1;
		for (int i = 1; i <=numero; i++) {
			total *= i;
		}
		return total;
		
		
	}

}
