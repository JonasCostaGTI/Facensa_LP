package aula_17;

import javax.swing.JOptionPane;

/**
 * @author jonascosta 02/07/2015
 * 
 *         Dado uma matriz de ordem 4x4 faça um algoritmo que: a) Calcule a soma
 *         dos elementos da primeira coluna ; b) Calcule o produto dos elementos
 *         da primeira linha; c) Calcule a soma de todos os elementos da matriz;
 *         d) Calcule a soma do diagonal principal; e) Calcule a soma da
 *         diagonal secundária
 */
public class M005 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];

		int[][] matriz_preenchida = preenche_matris(matriz);

		int soma_primeira_coluna = calcula_soma_primeira_coluna(matriz_preenchida);

		int produto_primeira_linha = calcula_produto_primeira_linha(matriz_preenchida);

		int soma_total_elementos = calcula_soma_total_matriz(matriz_preenchida);

		int soma_diagonal_principal = calcula_soma_diagonal_principal(matriz_preenchida);

		int soma_diagonal_secundaria = calcula_soma_diagonal_secundaria(matriz_preenchida);
		
		System.out.println("Soma da primeira coluna: " + soma_primeira_coluna);
		System.out.println("produto da primeira linha: " + produto_primeira_linha);
		System.out.println("Soma da total dos elementos: " + soma_total_elementos);
		System.out.println("Soma da diagonal principal: " + soma_diagonal_principal);
		System.out.println("Soma da diagonal secundaria: " + soma_diagonal_secundaria);
		

	}

	private static int calcula_soma_diagonal_secundaria(int[][] matriz_preenchida) {
		int soma = 0;

		for (int linha = 0; linha < matriz_preenchida.length; linha++) {
			for (int coluna = 0; coluna < matriz_preenchida.length; coluna++) {

				if (linha >= coluna) {
					soma += matriz_preenchida[linha][coluna];
				}

			}
		}
		return soma;
	}

	private static int calcula_soma_diagonal_principal(int[][] matriz_preenchida) {
		int soma = 0;

		for (int linha = 0; linha < matriz_preenchida.length; linha++) {
			for (int coluna = 0; coluna < matriz_preenchida.length; coluna++) {

				if (linha <= coluna) {
					soma += matriz_preenchida[linha][coluna];
				}

			}
		}

		return soma;
	}

	private static int calcula_soma_total_matriz(int[][] matriz_preenchida) {
		int soma = 0;
		
		for (int linha = 0; linha < matriz_preenchida.length; linha++) {
			for (int coluna = 0; coluna < matriz_preenchida.length; coluna++) {
				soma += matriz_preenchida[linha][coluna];
			}
		}
		
		
		return soma;
	}

	private static int calcula_produto_primeira_linha(int[][] matriz_preenchida) {
		int soma = 1;
		for (int linha = 0; linha < matriz_preenchida.length; linha++) {
			for (int coluna = 0; coluna < matriz_preenchida.length; coluna++) {

				if (linha == 0) {
					soma *= matriz_preenchida[linha][coluna];
				}

			}
		}
		return soma;
	}

	private static int calcula_soma_primeira_coluna(int[][] matriz_preenchida) {
		int soma = 0;
		for (int linha = 0; linha < matriz_preenchida.length; linha++) {
			for (int coluna = 0; coluna < matriz_preenchida.length; coluna++) {

				if (coluna == 0) {
					soma += matriz_preenchida[linha][coluna];
				}

			}
		}
		return soma;
	}

	private static int[][] preenche_matris(int[][] matriz) {
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = Integer
						.parseInt(JOptionPane
								.showInputDialog("Digite os valores da matriz na posicao "
										+ (linha + 1) + " " +(coluna + 1)));
			}
		}

		return matriz;
	}

}
