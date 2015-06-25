package aula_11;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 09/05/2015
 */
public class EX0702 {

	public static void main(String[] args) {
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da lista: "));
		int[] lista = new int[tamanho];
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da lista na posicao: " + (i+1) + " :"));
			
		}
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length; j++) {
				if (lista[i] > 0 && lista[j] == 0) {
					int aux;
					aux = lista[i];
					lista[i] = lista[j];
					lista[j] = aux;
					
				}
			}
			
		}
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print(" "+ lista[i]);
		}
	}
	
}
