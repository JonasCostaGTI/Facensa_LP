package aula_14;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 11/06/2015
 */
public class S019 {

	public static void main(String[] args) {
		int quantidade_paes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de paes "));
		int quantidade_broas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de broas"));
		
		double lucro_paes = calcula_lucro_paes(quantidade_paes);
		double lucro_broas = calcula_lucro_broas(quantidade_broas);
		
		double lucro_total = calcula_lucro_total(lucro_broas, lucro_paes);
		System.out.println("O lucro total na venda dos paes e broas é de: " + lucro_total + " R$");
		
		double valor_da_poupanca = calcula_valor_poupar(lucro_total);
		
		System.out.println("Os 10% do valor é de: "+ valor_da_poupanca + " R$");
		
		
	}

	private static double calcula_valor_poupar(double lucro_total) {
		double sobra = lucro_total * 0.10;
		return sobra;
	}

	private static double calcula_lucro_total(double lucro_broas,double lucro_paes) {
		
		return lucro_broas + lucro_paes;
	}

	private static double calcula_lucro_broas(int quantidade_broas) {
		
		return 1.50 * quantidade_broas;
	}

	private static double calcula_lucro_paes(int quantidade_paes) {
		
		return 0.12 * quantidade_paes;
	}

}
