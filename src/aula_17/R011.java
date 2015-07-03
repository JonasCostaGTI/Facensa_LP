package aula_17;

import javax.swing.JOptionPane;

/**
 * @author jonascosta 02/07/2015
 * 
 * 
 *         Escreva um programa que leia um valor inteiro n, calcule e mostre a
 *         soma dos n primeiros números pares. Exemplo: n = 3, apresentará 2 + 4
 *         + 6 = 12.
 */
public class R011 {

	public static void main(String[] args) {
		int quantidade_numero_pares = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de numeros pares"));
		
		
		int soma_numeros_pares = calcula_soma_pares(quantidade_numero_pares);
		System.out.println("A soma dos " + quantidade_numero_pares + "primeiros numeros pares é " + soma_numeros_pares);

	}

	private static int calcula_soma_pares(int quantidade_numero_pares) {
		int aux = 0;
		int soma = 0;
		
		for (int i = 0; aux <= quantidade_numero_pares; i++) {
			if (i % 2 == 0) {
				soma += i;
				aux ++;
			}
		}
		return soma;
	}

}
