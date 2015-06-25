package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 20/04/2015
 */
public class EX0504 {

	public static void main(String[] args) {
		
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2: "));
		
		
		int soma = EX0504.calcular_soma(numero1,numero2);
		JOptionPane.showMessageDialog(null, "A soma dos numeros é: " + soma);
		
	}
	
	public static int calcular_soma(int numero1, int numero2) {
			return numero1 + numero2;
		
	}
	

}
