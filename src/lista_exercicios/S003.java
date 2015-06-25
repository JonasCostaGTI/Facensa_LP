package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 09/06/2015
 */
public class S003 {

	public static void main(String[] args) {
		double valo_produto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
		double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem a acresentar ao produto: "));
		
		double imposto = calcula_acrescimo(valo_produto, porcentagem);
		JOptionPane.showMessageDialog(null, "O valor do produto com o imposto de " + porcentagem + "% é de: " + imposto);
		System.out.printf("%.3f",imposto);
		

	}

	private static double calcula_acrescimo(double valo_produto, double porcentagem) {
		return valo_produto +=  valo_produto * (porcentagem / 100);
	}

}
