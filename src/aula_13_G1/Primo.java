package aula_13_G1;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 28/05/2015
 */
public class Primo {
	
	public static void main(String[] args) {
		
		int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao do numero primo : " )); 
		
		for (int i = 1, conta = 0; conta < posicao; i++) {
			if (eh_primo(i)) {
				conta += 1;
			}
			if (conta == posicao) {
				JOptionPane.showMessageDialog(null, "Na pocisao " + posicao + ", o numero primo é: " + i);
				
			}
			
		}
		
}

	private static boolean eh_primo(int numero) {
		int resto = 0;
		int resultado = 0;
		for (int i = 1; i <=numero; i++) {
			resto = numero % i;
			
			if (resto == 0) {
				resultado += 1;
			}
		}
		
		if (resultado == 2) {
			return true;
		}

		return false;
	}
}

