package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 27/05/2015
 */
public class M001 {

	public static void main(String[] args) {
		String[] prato = new String[4];
		int[] caloria_prato = new int[4];
		
		for (int i = 0; i < prato.length; i++) {
			prato[i] = JOptionPane.showInputDialog("Digite o nome do " + (i+1) + " prato");
		}
		
		for (int i = 0; i < caloria_prato.length; i++) {
			caloria_prato[i] = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de calorias do prato " + prato[i] ));
		}
		
		for (int i = 0; i < caloria_prato.length; i++) {
			System.out.println(prato[i] + " " + caloria_prato[i]);
		}

		
		
		String[] sobre_mesa = new String[4];
		int[] calorias_sobre_mesa = new int[4];
		
		
		for (int i = 0, j = 0; i < calorias_sobre_mesa.length; i++,j++) {
			sobre_mesa[i] = JOptionPane.showInputDialog("Digite o nome da sobre mesa " + (i + 1));
			calorias_sobre_mesa[j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de calorias da sobre mesa " + sobre_mesa[i]));
		}
		
		for (int i = 0; i < calorias_sobre_mesa.length; i++) {
			System.out.println(sobre_mesa[i] + calorias_sobre_mesa[i]);
		}
		
		
		
		
	}

}
