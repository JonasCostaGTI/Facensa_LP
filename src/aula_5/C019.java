package aula_5;

import javax.swing.JOptionPane;

public class C019 {

	public static void main(String[] args) {
		int numero_1 = new Integer(JOptionPane.showInputDialog("digite o valor do primeiro numero"));
		int numero_2 = new Integer(JOptionPane.showInputDialog("digite o valor do segundo numero"));
		int numero_3 = new Integer(JOptionPane.showInputDialog("digite o valor do terceiro numero"));
		
		if ((numero_1 < numero_2) && (numero_2 < numero_3) && (numero_3 > numero_1)){
			JOptionPane.showMessageDialog(null, numero_3 + " " +  numero_2 + " " + numero_1);
			
		}else if ((numero_1 < numero_2) && (numero_2 > numero_3) && (numero_3 > numero_1)) {
			JOptionPane.showMessageDialog(null, numero_2 + " " +  numero_3 + " " + numero_1);
			
		}else if ((numero_1 > numero_2) && (numero_2 < numero_3) && (numero_3 > numero_1)) {
			JOptionPane.showMessageDialog(null, numero_3 + " " +  numero_1 + " " + numero_2);
			
		}else if ((numero_1 < numero_2) && (numero_2 > numero_3) && (numero_3 < numero_1)) {
			JOptionPane.showMessageDialog(null, numero_2 + " " +  numero_1 + " " + numero_3);
			
		}else if ((numero_1 > numero_2) && (numero_2 < numero_3) && (numero_3 < numero_1)) {
			JOptionPane.showMessageDialog(null, numero_1 + " " +  numero_3 + " " + numero_2);
			
		}else if ((numero_1 > numero_2) && (numero_2 > numero_3) && (numero_3 < numero_1)) {
			JOptionPane.showMessageDialog(null, numero_1 + " " +  numero_2 + " " + numero_3);
		}


	}

}
