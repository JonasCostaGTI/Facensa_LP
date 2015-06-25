package aula_2;

import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero_1 = new Integer(JOptionPane.showInputDialog("digite o primeiro numero: "));
		int numero_2 = new Integer(JOptionPane.showInputDialog("digite o segundo numero: "));
		
		JOptionPane.showMessageDialog(null, "soma: " + (numero_1 + numero_2));
		JOptionPane.showMessageDialog(null, "subtrai: " + (numero_1 - numero_2));
		JOptionPane.showMessageDialog(null, "multiplica: " + (numero_1 * numero_2));
		JOptionPane.showMessageDialog(null, "divisao: " + (numero_1 / numero_2));
		JOptionPane.showMessageDialog(null, "resto da divisao: " + (numero_1 % numero_2));


	}

}
