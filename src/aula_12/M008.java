package aula_12;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 21/05/2015
 */
public class M008 {

	public static void main(String[] args) {
		int tamanho_linha = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de linhas: "));
		int tamanho_coluna = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de coluna: "));
		
		int [][] matriz_1 = pega_matriz_1(tamanho_linha, tamanho_coluna);
		int [][] matriz_2 = pega_matriz_2(tamanho_linha, tamanho_coluna);
		
		int[][] soma = soma_matriz_1_2(matriz_1,matriz_2, tamanho_linha,tamanho_coluna);
		for (int i = 0; i < soma.length; i++) {
			System.out.println("");
			for (int j = 0; j < soma.length; j++) {
				System.out.printf("%d ", soma[i][j]);
			}
		}
	}

	private static int[][] soma_matriz_1_2(int[][] matriz_1, int[][] matriz_2, int tamanho_linha, int tamanho_coluna) {
		int [][] matriz_soma = new int[tamanho_linha][tamanho_coluna];
		
		for (int linha = 0; linha < tamanho_linha; linha++) {
			for (int coluna = 0; coluna < tamanho_coluna; coluna++) {
				matriz_soma[linha][coluna] = matriz_1[linha][coluna] + matriz_2[linha][coluna];
			}
		}
		return matriz_soma;
		
	}

	private static int[][] pega_matriz_2(int tamanho_linha,int tamanho_coluna) {
		int[][] matriz_2 = new int[tamanho_linha][tamanho_coluna];
		
		for (int linha = 0; linha < tamanho_linha; linha++) {
			for (int coluna = 0; coluna < tamanho_coluna; coluna++) {
				matriz_2[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores da matriz_2 posicao, linha: " + (linha + 1) + " coluna: " + (coluna + 1)));
			}
		}
		
		return matriz_2;
	}

	private static int[][] pega_matriz_1(int tamanho_linha , int tamanho_coluna) {
		int [][] matriz_1 = new int[tamanho_linha][tamanho_coluna];
		for (int linha = 0; linha < matriz_1.length; linha++) {
			for (int coluna = 0; coluna < matriz_1.length; coluna++) {
				matriz_1[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores da matriz_1 posicao, linha: " + (linha + 1) + " coluna: " + (coluna + 1)));
			}
		}
		
		
		
		return matriz_1;
	}

}
