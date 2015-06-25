package aula_11;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 14/05/2015
 */
public class M013 {

	public static void main(String[] args) {
		
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("tamanho do vetor: "));
		int[] numeros = new int[tamanho];
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("numero na posicao " + (i+1)));
			
		}
		
		int multiplicador = Integer.parseInt(JOptionPane.showInputDialog("numero de multiplicador"));
		
		int[] resulatado = new int[numeros.length];
		
		for (int i = 0; i < numeros.length; i++) {
			resulatado[i] = numeros[i] * multiplicador;
		}

		int posicao = 0;
		
		
		while (posicao < numeros.length) {
			System.out.printf("resulatado [%d] = %d \n", posicao, resulatado[posicao]);
			posicao++;
		}
		
	}

}
