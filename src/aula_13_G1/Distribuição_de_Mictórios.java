package aula_13_G1;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 28/05/2015
 */
public class Distribuição_de_Mictórios {

	public static void main(String[] args) {
		
		int q_mictorios = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de mictorios"));
		int[][] mictorios = new int[q_mictorios] [1];
		int vagas = 0;
		
		
		do {
			
		for (int mic = 0; mic < mictorios.length; mic++) {
			for (int ocupados = 0; ocupados < 1; ocupados++) {
				mictorios[mic][ocupados] = Integer.parseInt(JOptionPane.showInputDialog("Difine 1 se esta ocupado ou 0 se esta vago no banheiro: " + (mic + 1)));
			}
		}
		
		
		
		for (int mici = 0; mici < mictorios.length; mici++) {
			for (int ocup = 0; ocup < 1; ocup++) {
				
				if (mictorios[mici][ocup] == 1) {
					vagas += 1;
					System.out.println("O banheiro: " + (mici+1) + " esta ocupado");
				}
			}	
		}
		
		
		
		for (int i = 0; i < mictorios.length; i++) {
			for (int j = 0; j < 1; j++) {
				
				if (mictorios[i][j] == 0) {
					System.out.println("Voce ainda tem as pocisoes: " + (i+1) + " livres");
					
					
				
				}
				
			}
		}
		
		
		} while (vagas <= q_mictorios);
		
		
		
	}

}
