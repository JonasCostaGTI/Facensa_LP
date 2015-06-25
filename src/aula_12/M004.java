package aula_12;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 21/05/2015
 */
public class M004 {

	public static void main(String[] args) {
		
		int tamanho_linha = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho de linhas: "));
		int tamanho_coluna = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho de colunas: "));
		
		int [][] matriz_completa = ler_matriz(tamanho_linha,tamanho_coluna);
		
		for (int i = 0; i < tamanho_linha; i++) {
			System.out.println("");
			for (int j = 0; j < tamanho_coluna; j++) {
				System.out.printf(" %d ", matriz_completa[i][j]);
			}
		}

	}

	private static int[][] ler_matriz(int tamanho_linha, int tamanho_coluna) {
		
		int matriz [][] = new int[tamanho_linha][tamanho_coluna];
		
		for (int linha = 0; linha < tamanho_linha; linha++) {
			for (int coluna = 0; coluna < tamanho_coluna; coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor na posicao linha:" + (linha + 1) + " e coluna: " + (coluna + 1)));
			}
		}
		return matriz;
		
	}

}
