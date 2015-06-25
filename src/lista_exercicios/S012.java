package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 18/06/2015
 */
public class S012 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C:"));
		
		int diagonal = calcula_diagonal(a,b,c);
		JOptionPane.showMessageDialog(null, "A diagonal das medidas: " +a+" , "+b+" , "+c+ " é: " + diagonal);
	}

	private static int calcula_diagonal(int a, int b, int c) {
		
		int resultado_potencia = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
		int resultado_sqr = (int) Math.sqrt(resultado_potencia);		
		return resultado_sqr;
	}

}
