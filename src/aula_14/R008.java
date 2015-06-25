package aula_14;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 11/06/2015
 */
public class R008 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para saber o fatorial"));
		
		int fatorial = calcula_fatorial(numero);
		System.out.printf("O fatorial de %d é de: %d " , numero,fatorial);
		
		
		
		

	}

	private static int calcula_fatorial(int numero) {
		int fator = 1;
		for (int i = 2; i <=numero; i++) {
			fator = fator * i;
		}
		return fator;
	}

}
