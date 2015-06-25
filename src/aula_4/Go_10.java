package aula_4;

import javax.swing.JOptionPane;

public class Go_10 {

	public static void main(String[] args) {
		int numero = new Integer(JOptionPane.showInputDialog("digite um numero: "));
		
		if ((numero % 2) != 0){
			JOptionPane.showMessageDialog(null, numero + " numero impar");
		}else{
			JOptionPane.showMessageDialog(null, numero + " numero par");
		}
	}
}
