package aula_11;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 14/05/2015
 */
public class M018 {

	public static void main(String[] args) {
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
		int[] numeros = new int[tamanho];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero no index posicao: " + (i+1)));
		}

		
		
		int numero_qualquer = Integer.parseInt(JOptionPane.showInputDialog("digite um numero qualquer ")); 
		for (int i = 0; i < numeros.length; i++) {
			
			if ( numeros[i] == numero_qualquer) {
				int[] numeros_novos = new int[1];
				
				for (int j = 0; j < numeros_novos.length; j++) {
					numeros_novos[j] = numero_qualquer;
					JOptionPane.showMessageDialog(null, "O numero: "+ numero_qualquer + " esta contido na lista");
					
				}
				
				
			}
			
		}
		
		}
		
	}


