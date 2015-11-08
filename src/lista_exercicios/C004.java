package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta 4 de nov de 2015
 * 
 *         Faça um algoritmo que leia um número e informe se ele é divisível
 *         por 3 e por 5.
 */
public class C004 {

	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

		if (i % 3 == 0 && i % 5 == 0) {
			JOptionPane.showMessageDialog(null, "O numero: " + i + " é divisivel por 3 e 5");
		} else if (i % 3 == 0) {
			JOptionPane.showMessageDialog(null, "O numero: " + i + " é divisivel por 3");
		} else if (i % 5 == 0) {
			JOptionPane.showMessageDialog(null, "O numero: " + i + " é divisivel por 5");
		} else if (i % 3 != 0 && i % 5 != 0) {
			JOptionPane.showMessageDialog(null, "O numero: " + i + " nao é divisivel por 3 e 5");
		}

	}

}
