package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 23/04/2015
 */
public class Go_18 {

	public static void main(String[] args) {
		
		int numero = Go_18.le_numero();
		Go_18.mostra_numeros_positivos(numero);
		

	}

	private static void mostra_numeros_positivos(int numero) {
		int aux = 0;
		
		while (aux <= numero) {
			System.out.println(aux);
			aux++;
		}
		
	}

	private static int le_numero() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		return numero;
	}

}
