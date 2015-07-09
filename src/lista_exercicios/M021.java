package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta 09/07/2015
 * 
 * 
 *         Faça um algoritmo para ler um vetor de 20 números. Após isto, ler
 *         mais um número qualquer, calcular e escrever quantas vezes esse
 *         número aparece no vetor.
 *         
 */
public class M021 {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor na posicao " + (i + 1)));
		}
		
		int procura = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja encontrar "));
		
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == procura) {
				soma++;	
			}
			
		}
		
		System.out.println("Foram encontardos " + soma + " numeros iguais a " + procura + " na lista");

	}

}
