package aula_3;

import javax.swing.JOptionPane;

public class S015 {

	public static void main(String[] args) {
		
		double altura_degrau = new Double(JOptionPane.showInputDialog(null,"qual a altura em cm do degrau:"));
		double altura_final = new Double(JOptionPane.showInputDialog(null,"qual a altura em m que deseja subir: "));
		
		
		/* (int) (...) conversao dos valores double em int*/
		int resultado =  (int) (altura_final / altura_degrau);
		
		JOptionPane.showMessageDialog(null,"voce ira subir: " + resultado + " degrau");
		
	}

}
