package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 20/04/2015
 */
public class EX0506 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		int multiplicacao = EX0506.calcula_multiplicacao(numero1, numero2);
		JOptionPane.showMessageDialog(null, "A multiplicacao dos numeros é: " + multiplicacao);

	}

	private static int calcula_multiplicacao(int numero1, int numero2) {
		return numero1 * numero2;
	}

}
