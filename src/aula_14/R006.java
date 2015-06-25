package aula_14;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 11/06/2015
 */
public class R006 {

	public static void main(String[] args) {
		int valor_N = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
		int valor_Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
		
		int media = calcula_media(valor_N, valor_Y);
		System.out.println(media);

	}

	private static int calcula_media(int valor_N, int valor_Y) {
		int impar = 0;
		int aux = 0;
		int soma_impar = 0;
		int media = 0;
		
		for (int i = valor_N; i <= valor_Y; i++) {
			impar = i % 2;
			if (impar != 0) {
				soma_impar += i;
				aux += 1;
			}
		
		}
		
		media = soma_impar / aux;
		
		return media;
	}

}
