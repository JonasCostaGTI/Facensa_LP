package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 20/04/2015
 */
public class EX0507 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		float divisao = EX0507.calcula_divisao(numero1, numero2);
		JOptionPane.showMessageDialog(null, "O resultado da divisao é: " + divisao);
	}

	private static float calcula_divisao(int numero1, int numero2) {
		return numero1 / numero2;
	}

}
