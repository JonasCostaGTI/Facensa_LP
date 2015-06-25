package aula_7;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 16/04/2015
 */
public class EX0803 {

	public static void main(String[] args) {
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("digite o ano no formato YYYY"));
		
		if (EX0803.calcula_bissesto(ano)) {
			JOptionPane.showMessageDialog(null, "Ano: " + ano + " é bissesto");
		}else {
			JOptionPane.showMessageDialog(null, "Ano: " + ano + " nao é bissesto");
		}
		
		

	}


	private static boolean calcula_bissesto(int ano) {
		
		if (ano % 4 == 0) {
			return true;
		}else {
			return false;
			
	}
}
}