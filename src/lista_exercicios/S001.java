package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 08/06/2015
 */
public class S001 {

	public static void main(String[] args) {
		double valor_produto = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do produto: "));
		
		double valor_com_desconto = aplica_acrescimo(valor_produto);
		JOptionPane.showMessageDialog(null, "Valor do produto com acrescimo de 30% é de: " + valor_com_desconto);
	}

	private static double aplica_acrescimo(double valor_produto) {
		valor_produto += valor_produto *  0.30; 
		return valor_produto;
	}

}
