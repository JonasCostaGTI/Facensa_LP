package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 18/04/2015
 */
public class EX0503 {

	public static void main(String[] args) {
			
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("quantidade de numero para saber se é primo: "));
		
			for (int i = 0, primo = 0; primo < quantidade; i++) {
				Boolean numero = EX0503.verifica_numero_primo(i);
				if (numero) {
					primo ++;
					System.out.println(primo + " numero primo é: " + i);
				}
				
			}
	
	}

	private static boolean verifica_numero_primo(int numero) {
		if (numero == 2) {
			return true;
			
		}else if (numero % 2 == 0 || numero == 1) {
			return false;
		}
		
		for (long i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }

		}
		
		return true;
		
		
	}
}


