package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta 26/06/2015
 * 
 * 
 *         Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e
 *         armaze os nomes lidos em um vetor. Após isto, o algoritmo deve
 *         permitir a leitura de mais 1 nome qualquer de pessoa e depois
 *         escrever a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos
 *         anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário.
 * 
 */
public class M010 {

	public static void main(String[] args) {
		String[] lista_de_nomes = new String[3];
		
		for (int i = 0; i < lista_de_nomes.length; i++) {
			lista_de_nomes[i] = JOptionPane.showInputDialog("Digite o nome da " + (i+1) + " pessoa");
		}
		
		String procura_nome = JOptionPane.showInputDialog("Qual o nome deseja procurar: ");
		
		boolean encontrei = false;
		for (int i = 0; i < lista_de_nomes.length; i++) {
			
			
			if (lista_de_nomes[i].equals(procura_nome)) {
				JOptionPane.showMessageDialog(null, "Encontrei. Voce esta procurando por: " + procura_nome);
				encontrei = true;
				
			}
			
		}
		
		if (encontrei == false) {
			JOptionPane.showMessageDialog(null, "Desculpa.Nao encontrei ninguem com o nome de: " + procura_nome);
		}
		
		
	}

}
