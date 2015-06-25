package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 09/06/2015
 */
public class S002 {

	public static void main(String[] args) {
		int valor_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1 : "));
		int valor_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2 : "));
		
		
		double resto = calcula_resto_divisao(valor_1, valor_2);
		JOptionPane.showMessageDialog(null, "O resto da divisao de " + valor_1 + " e " + valor_2 + " é: " +  resto);
		
	}

	private static double calcula_resto_divisao(int valor_1, int valor_2) {
		return valor_1 % valor_2;
	}

}
