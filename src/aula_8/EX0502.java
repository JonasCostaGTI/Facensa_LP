package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 18/04/2015
 */


public class EX0502 {

	public static void main(String[] args) {
		
		
		int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de inicio do intervalo: "));
		int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de fim do intervalo: "));

		for (int i = inicio; i <fim+1; i++) {
			
			boolean impar = EX0502.eh_impar(i);
			if (impar) {
				System.out.println(i + ": É numero impar");
			}else {
				System.out.println(i + ": É numero par");
			}
			
		}
		
		
	}

	private static boolean eh_impar(int i) {
		return (i % 2 != 0);
		
	}

}
