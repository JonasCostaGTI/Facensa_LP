package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta 30 de out de 2015
 * 
 *         Faça um algoritmo que leia uma temperatura dada na escala Celsius
 *         (C), depois calcule e mostre temperatura equivalente em Fahrenheit
 *         (F):
 */
public class S010 {

	public static void main(String[] args) {
		double temp_c = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em ºC "));

		double temp_c1 = (temp_c / 5) * 9;
		double temp_f = temp_c1 + 32;

		JOptionPane.showMessageDialog(null,
				"A temperatura de: " + temp_c + " em ºC convertida para ºF é de: " + temp_f);
	}

}
