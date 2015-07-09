package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta 09/07/2015
 * 
 *         Faça um algoritmo para ler 30 números e armazenar em um vetor,
 *         verificar e escrever se existem números repetidos no vetor e em que
 *         posições se encontram.
 * 
 */
public class M022 {

	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor na posicao " + (i+1)));
		}
		
		
		
		int[] vetor_repitido = new int[vetor.length];
		int numeros_repitidos = 0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				
				if (vetor[i] == vetor[j] && i != j) {
					vetor_repitido[i] = vetor[i];
					numeros_repitidos += 1;
					
				}
				
			}
		}
		
		
		
		System.out.println("valores digitado no vetor");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(" "+ vetor[i]);
		}
		
		System.out.println("");
		
		System.out.println("valores repitidos do vetor");
		for (int i = 0; i < vetor_repitido.length - (numeros_repitidos - 1); i++) {
			System.out.print(" "+ vetor_repitido[i]);
		}

	}

}
