package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 18/06/2015
 */
public class C001 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
		
		int resultado_multiplicacao = calcula_multiplicacao(a,b);
		
		if (resultado_multiplicacao > a) {
			JOptionPane.showMessageDialog(null, "O resultado foi maior que o valor de A. entao : " + (resultado_multiplicacao * resultado_multiplicacao));
		}else {
			JOptionPane.showMessageDialog(null, resultado_multiplicacao);
		}
		
	
		
		
	}

	private static int calcula_multiplicacao(int a, int b) {
		
		return a * b;
	}

}
