package aula_12;

/**
 * @author jonascosta
 * 21/05/2015
 */
public class M003 {

	public static void main(String[] args) {
		
		int [][] matriz = new int[13][15];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				
				matriz[linha][coluna] = 0;
	
			}
		}
		
		for (int linha = 0; linha < matriz.length; linha++) {
			System.out.println("");
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
		}
		
	}

}
