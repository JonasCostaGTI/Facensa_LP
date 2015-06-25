package aula_7;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 16/04/2015
 */
public class EX0802 {
	
	private static int pega_maior(int numero1, int numero2) {
		
		if (numero1 > numero2) {
			return numero1;
		}else {
			return numero2;
		}
	
	}
	
	
	

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o numero1"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o numero2"));
		
		int numero_maior = pega_maior(numero1, numero2);
		
		JOptionPane.showMessageDialog(null, "numero maior é: " + numero_maior);
		
		
		
	}

	

}
