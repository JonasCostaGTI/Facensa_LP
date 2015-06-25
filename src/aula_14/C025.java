package aula_14;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 11/06/2015
 */
public class C025 {

	public static void main(String[] args) {
		double valor_compra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra: "));
		double valor_venda = 0;
		
		if (valor_compra < 25) {
			valor_venda = valor_compra + (valor_compra * 0.50);
		}else {
			valor_venda = valor_compra + (valor_compra * 0.35);
		}
		
		
		System.out.println(valor_venda);
	}

}
