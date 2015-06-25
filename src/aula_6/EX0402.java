package aula_6;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 03/04/2015
 */
public class EX0402 {
	
	public int pega_numero_maior(int numero_1, int numero_2, int numero_3) {
		
		int resultado = 0;
		
		if ((numero_1 < numero_2) && (numero_2 < numero_3) && (numero_3 > numero_1)){
			JOptionPane.showMessageDialog(null, numero_3 + " Maior numero ");
			 resultado = numero_3;
			
		}else if ((numero_1 < numero_2) && (numero_2 > numero_3) && (numero_3 > numero_1)) {
			JOptionPane.showMessageDialog(null, numero_2 + " Maior numero ");
			 resultado = numero_2;
			
		}else if ((numero_1 > numero_2) && (numero_2 < numero_3) && (numero_3 > numero_1)) {
			JOptionPane.showMessageDialog(null, numero_3 + " Maior numero ");
			 resultado = numero_3;
			
		}else if ((numero_1 < numero_2) && (numero_2 > numero_3) && (numero_3 < numero_1)) {
			JOptionPane.showMessageDialog(null, numero_2 + " Maior numero ");
			 resultado = numero_2;
			
		}else if ((numero_1 > numero_2) && (numero_2 < numero_3) && (numero_3 < numero_1)) {
			JOptionPane.showMessageDialog(null, numero_1 + " Maior numero ");
			 resultado = numero_1;
			
		}else if ((numero_1 > numero_2) && (numero_2 > numero_3) && (numero_3 < numero_1)) {
			JOptionPane.showMessageDialog(null, numero_1 + " Maior numero ");
			 resultado = numero_1;
		}
		
		return resultado;
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		EX0402 numero_maior = new EX0402();
		
		numero_maior.pega_numero_maior(999, 135, 19);

	}

}
