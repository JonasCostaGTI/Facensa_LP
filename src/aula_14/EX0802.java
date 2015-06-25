package aula_14;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 12/06/2015
 */
public class EX0802 {

	public static void main(String[] args) {
		int numero = 0;
		boolean menor_numero_divisivel = false;
		
		while (menor_numero_divisivel == false) {
			
			numero += 1; 
			menor_numero_divisivel = numero_eh_divisivel(numero);
			
		}
		
		if (menor_numero_divisivel == true) {
			JOptionPane.showMessageDialog(null, "O numero " + numero + " é o menor numero divisivel pelos numero no intervalo de 1 a 20 ");
		}
		
		
	}

	private static boolean numero_eh_divisivel(int numero) {
		int controle = 0;
		for (int i = 1; i <= 20; i++) {
			
			if (numero % i == 0 ) {
				controle += 1;
			}
		}
		
		if (controle == 20) {
			return true;
		}
	
		return false;
	}

}
