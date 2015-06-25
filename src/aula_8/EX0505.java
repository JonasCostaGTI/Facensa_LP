package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 20/04/2015
 */
public class EX0505 {

	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		
		int subtracao = EX0505.calcula_subtracao(numero1, numero2);
		JOptionPane.showMessageDialog(null, " subtracao dos numeros é: " + subtracao);

	}

	public static int calcula_subtracao(int numero1, int numero2) {
		return numero1 - numero2;
	}

}
