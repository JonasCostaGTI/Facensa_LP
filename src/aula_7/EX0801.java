package aula_7;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 16/04/2015
 */
public class EX0801 {
	
	public int pega_numero() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para saber se ele é par: "));
		return numero;
		
	}
	
	public boolean calcula_par(int numero) {
		return (numero % 2 == 0);

	}

	public static void main(String[] args) {
		EX0801 ex0801 = new EX0801();
		int numero = 0;
		
		numero = ex0801.pega_numero();
				
		if (ex0801.calcula_par(numero)) {
			JOptionPane.showMessageDialog(null, numero + " E par");
		}else {
			JOptionPane.showMessageDialog(null, numero + " Nao é par ");
		}
		
			
		
		
		
	}

}
