package aula_3;

import javax.swing.JOptionPane;

public class S018 {

	public static void main(String[] args) {
		
		double valor_do_abastecimento = new Double(JOptionPane.showInputDialog(null,"qual o valor do abastecimento: "));
		double preco_litro_gasolina = new Double(JOptionPane.showInputDialog(null,"qual o valor do litro da gasolina: "));
		
		double litros = valor_do_abastecimento / preco_litro_gasolina;
		
		JOptionPane.showMessageDialog(null, "total de litros: "+litros);
	
		
		
	}

}
