package aula_11;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 07/05/2015
 */
public class EX0701 {

	public static void main(String[] args) {
		
		int tamano_matriz = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamnho da matriz quadrada: "));
		
		int [][] matriz_preenxida = pega_matriz(tamano_matriz);
		
		JOptionPane.showMessageDialog(null, "A soma dos elementos ACIMA da diagonal principal é: " + soma_matriz_acima(tamano_matriz,matriz_preenxida));
		JOptionPane.showMessageDialog(null, "A soma dos elementos ABAIXO da diagonal principal é: " + soma_matriz_abaixo(tamano_matriz,matriz_preenxida));
		

	}

	private static int soma_matriz_abaixo(int tamano_matriz,int[][] matriz_preenxida) {
		
		int soma_principal_abaixo = 0;
		for (int i = 0; i < matriz_preenxida.length; i++) {
			for (int j = 0; j < matriz_preenxida.length; j++) {
				if (i > j) {
					soma_principal_abaixo = matriz_preenxida[i][j];
				}
			}
		}
		
		return soma_principal_abaixo;
	}

	private static int[][] pega_matriz(int tamano_matriz) {
		int [][] matriz = new int[tamano_matriz][tamano_matriz];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores da linha "+ (i+1) +": coluna: "+ (j+1) + ": "));
				
			}
		}
		return matriz;
	}

	private static int soma_matriz_acima(int tamano_matriz, int[][] matriz_preenxida) {
		int soma_principal_acima = 0;
		for (int i = 0; i < matriz_preenxida.length; i++) {
			for (int j = 0; j < matriz_preenxida.length; j++) {
				if (i < j ) {
					soma_principal_acima += matriz_preenxida[i][j];
				}
			}
		}
	return soma_principal_acima;
		
		}
		
		

		
}
		
	


