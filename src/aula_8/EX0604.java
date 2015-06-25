package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 30/04/2015
 */
public class EX0604 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para saber a soma triangular")); 
		
		int soma = EX0604.Soma_numeros_triangulares(numero);
		JOptionPane.showMessageDialog(null,"A soma do numero triangula é: " + soma);
		
		int total_divisores = EX0604.verifica_divisores(soma);
		JOptionPane.showMessageDialog(null, "Este numero possui " + total_divisores + " divisores");

	}

	private static int verifica_divisores(int soma) {
		int total = 0;
		for (int i = 1; i <=soma; i++) {
			if (soma % i == 0) {
				total ++ ;
				System.out.println(i);
			}

		}
		
		return total;
	}

	private static int Soma_numeros_triangulares(int numero) {
		int soma = 0;
		for (int i = 0; i <=numero; i++) {
			soma += i;
		}
		
		return soma;
	}

}
