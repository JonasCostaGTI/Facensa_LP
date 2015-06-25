package aula_7;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 16/04/2015
 */
public class EX0804 {

	public static void main(String[] args) {
		
		int numero = EX0804.pega_numero();
		
		int total = EX0804.soma_numero(numero);
		JOptionPane.showMessageDialog(null, total);
		
		

	}

	private static int soma_numero(int numero) {
		int soma = 0;
		for (int i = 0; i < 11; i++) {
			soma += numero * i;
		}	
		return soma;
	}

	private static int pega_numero() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para saber a soma da tabulada da multiplicacao: "));
	}

}
