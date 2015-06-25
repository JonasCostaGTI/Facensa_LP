package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 14/05/2015
 */
public class EX0510 {

	public static void main(String[] args) {
		
		double valor_produto = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto: "));
		double dinheiro_pago = Double.parseDouble(JOptionPane.showInputDialog("Valor recebido: "));
		
		double valor_troco = pega_valor_troco(valor_produto,dinheiro_pago);
		
		System.out.printf("valor do troco %12.2f \n",valor_troco);
		
		System.out.printf("%d notas de 100 \n", (int)valor_troco % 100);
		
		
		System.out.printf("%d notas de 50 \n",(int) valor_troco % 50);
		
		
		System.out.printf("%d notas de 20 \n", (int)valor_troco % 20);
		
		
		System.out.printf("%d notas de 10 \n", (int)valor_troco % 10);
		
		
		System.out.printf("%d notas de 5 \n", (int)valor_troco % 5);
		
		
		System.out.printf("%d notas de 1 \n",(int) valor_troco % 1);
		
		
		

	}

	private static double pega_valor_troco(double valor_produto, double dinheiro_pago) {
		double troco = dinheiro_pago - valor_produto;
		return troco;
	}

}
