package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta 09/07/2015
 * 
 *         Faça um algoritmo para ler dois vetores V1 e V2 de 15 números cada.
 *         Calcular e escrever a quantidade de vezes que V1 e V2 possuem os
 *         mesmos números e nas mesmas posições.
 *         
 *         
 */
public class M020 {

	public static void main(String[] args) {
		int[] v1 = new int[5];
		int[] v2 = new int[5];
		
		for (int i = 0; i < v1.length; i++) {
			v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor 1 na posicao " + (i+1)));
		}
		
		for (int i = 0; i < v2.length; i++) {
			v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor 2 na posicao " + (i+1)));
		}
		
		int soma_repeticao = 0;
		
		for (int i = 0; i < v2.length; i++) {
			for (int j = 0; j < v2.length; j++) {
				
				if (v1[i] == v2[j] && i == j) {
					soma_repeticao++;
				}
				
			}
		}
		
		System.out.println("foram encontrados " + soma_repeticao + " numeros iguais entres os dois vetores na mesma posicao" );
		
	}

}
