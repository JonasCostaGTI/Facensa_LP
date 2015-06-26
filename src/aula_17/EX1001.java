package aula_17;

import javax.swing.JOptionPane;

/**
 * @author jonascosta 26/06/2015 
 * 		   
 * 			Soma dos Fibonaccis Impares: Cada novo termo na
 *         seqüência de Fibonacci é gerada pela soma dos dois termos anteriores.
 *         Ao iniciar com um e dois, os 10 primeiros termos são os seguintes: 1,
 *         2, 3, 5, 8, 13, 21, 34, 55, 89, ... Considerando os termos da
 *         sequência de Fibonacci cujos valores não ultrapassam 1000, encontrar
 *         a soma dos N primeiros termos impares.
 * 
 * 
 */
public class EX1001 {

	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros impares na sequencia fibonacci que deseja saber a soma: "));
		
		long soma_nun_impar_fibo = soma_numeros_impar(quantidade);
		
		JOptionPane.showMessageDialog(null, "A soma de " + quantidade + " primeiros numeros impares na sequencia Fibonacci é de: " + soma_nun_impar_fibo);
		

	}

	private static long soma_numeros_impar(int quantidade) {
		int aux = 0;
		long soma = 0;
		for (int i = 1, j = 0, conta = 0; conta < quantidade;) {
			
			aux = i;
			i = i + j;
			j = aux;
			
			if (i % 2 != 0) {
				
				soma += i;
				conta++;
			}
			
			
		}
		return soma;
	}

}
