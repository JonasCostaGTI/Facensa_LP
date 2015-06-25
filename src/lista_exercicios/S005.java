package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 11/06/2015
 */
public class S005 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

		int dobro = calcula_dobro(numero);
		double terca_parte = calcula_terca_parte(numero);
		int antecessor = calcula_antecessor(numero);
		int sucessor = calcula_sucessor(numero);
		
		JOptionPane.showMessageDialog(null, "O numero: " + numero + ", tem como seu do igual a: " + dobro + ", sua terca parte como: " + terca_parte 
				+ " , seu antecessor: " + antecessor + ", e seu sucessor: " + sucessor);
		
	}

	private static int calcula_sucessor(int numero) {
		return numero + 1;
	}

	private static int calcula_antecessor(int numero) {
		return numero - 1;
	}

	private static double calcula_terca_parte(int numero) {
		return numero / 3;
	}

	private static int calcula_dobro(int numero) {
		return numero * 2;
	}

}
