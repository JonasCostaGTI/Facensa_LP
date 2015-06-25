package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 18/04/2015
 */
public class EX0501 {


	public static void main(String[] args) {
		
		int contador = 0;
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros pares: "));
		
		int aux = 0;
		while (contador < quantidade) {
			boolean par = EX0501.pega_numeros_par(aux);
			if (par) {
				contador ++;
				System.out.println("este é o " + contador + " numero par: " + aux);
			}
			aux ++;
		}
		
		
		
			
		}

	

	private static boolean pega_numeros_par(int i) {
		return (i % 2 == 0 && i != 0);
		
	
	}
}


