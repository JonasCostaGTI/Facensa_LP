package aula_7;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 16/04/2015
 */

/*
 * Algumas correspondências:
0 °C = 32 °F
5 °C = 41 °F
10 °C = 50 °F
15 °C = 59 °F
20 °C = 68 °F
25 °C = 77 °F
30 °C = 86 °F
35 °C = 95 °F
40 °C = 104 °F
 */



public class EX0805 {

	public static void main(String[] args) {
		
		float graus_celcio = Integer.parseInt(JOptionPane.showInputDialog("digite a temperatura: "));
		
		EX0805.converte_fahrenheit(graus_celcio);
		
		JOptionPane.showMessageDialog(null, "A temperatura em fahrenheit de: " + graus_celcio + ": é: "+ EX0805.converte_fahrenheit(graus_celcio));
		
		

	}

	private static float converte_fahrenheit(Float graus_celcio) {
		return (float) ((graus_celcio * 1.8) + 32);
	}

}
