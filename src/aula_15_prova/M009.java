package aula_15_prova;

/**
 * @author jonascosta
 * 19/06/2015
 */
public class M009 {

	public static void main(String[] args) {
		int [][] matriz = new int[4][4];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = i * j;
				
				if (i == j) {
					matriz[i][j] += matriz[i][j];
				}
				
			}
		}

		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("");
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
		}
		
		
	}
	
	

}
