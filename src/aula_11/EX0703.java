package aula_11;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 16/05/2015
 */
public class EX0703 {

	public static void main(String[] args) {
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da matriz:"));
		
		int[][] matriz_completa = pega_elementos_matriz(tamanho);
		int[][] soma_colunas = pega_somas(tamanho,matriz_completa);
		for (int i = 0; i < soma_colunas.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < soma_colunas.length; j++) {
				System.out.print(" "+matriz_completa[i][j]);
			}
		}
		
		
	}

	private static int[][] pega_somas(int tamanho, int[][] matriz_completa) {
		
			for (int linha = 0; linha < matriz_completa.length; linha++) {
				for (int coluna = 0; coluna < matriz_completa.length; coluna++) {
					if (matriz_completa[linha][coluna] == 0) {
						int index_coluna = coluna;
						int index_linha = linha;
		
						int soma_linha = 0;
						int soma_coluna = 0;
						
									for (int colunas = 0; colunas < index_coluna; colunas++) {
										soma_linha += matriz_completa[index_linha][colunas];
									}
									
									for (int linnhas = 0; linnhas < index_linha; linnhas++) {
										soma_coluna += matriz_completa[linnhas][index_coluna];
						
									
								}
								
									matriz_completa[linha][coluna] = soma_linha + soma_coluna ;
						
							}

				}
									
			}
			
		
		return matriz_completa;
		
	}

	private static int[][] pega_elementos_matriz(int tamanho) {
		int[][] matriz = new int[tamanho][tamanho];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da matriz na linha: "+ i + " coluna: " + j ));
			}
		}
		
		return matriz;
	}

}
