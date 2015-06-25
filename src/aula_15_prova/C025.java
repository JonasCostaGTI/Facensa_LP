package aula_15_prova;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 18/06/2015
 */
public class C025 {

	public static void main(String[] args) {
		double valor_compra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de compra do produto"));
		double valor_venda = 0;
		if (valor_compra < 25) {
			valor_venda = valor_compra + (valor_compra * 0.50);
			JOptionPane.showMessageDialog(null, "O valor de venda do produto deve ser de: " + valor_venda);
		}else {
			valor_venda = valor_compra + ( valor_compra * 0.35);
			JOptionPane.showMessageDialog(null, "O valor de venda do produto deve ser de: " + valor_venda);
		}

	}

}
