package aula_3;

import javax.swing.JOptionPane;

public class S016 {

	public static void main(String[] args) {
		
		double largura = new Double(JOptionPane.showInputDialog(null,"qual a largura do comodo: "));
		double comprimento = new Double(JOptionPane.showInputDialog(null,"qual a comprimento do comodo: "));
		
		double area = largura * comprimento;
		double potencia = area * 18;
		
		JOptionPane.showMessageDialog(null, "Este comodo tem "+area+"m2, e vai nescessitar de "+potencia+ "W de potencia");
		
		
		
	}

}
