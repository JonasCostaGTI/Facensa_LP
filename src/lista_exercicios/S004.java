package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 11/06/2015
 */
public class S004 {

	public static void main(String[] args) {
		double valor_1 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor 1: "));
		double valor_2 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor 2: "));
		
		double porcentagem = calcula_diferenca(valor_1, valor_2);
		JOptionPane.showMessageDialog(null, "O ponto percentual de " + valor_1 + " - " + valor_2 + " é de: " + porcentagem);
		
	}

	private static double calcula_diferenca(double valor_1, double valor_2) {
		double diferenca = valor_1 - valor_2;
		double ponto_porcentual = (diferenca / 100) * 100;
		
		return ponto_porcentual;
	}

}
