package aula_13_G1;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 28/05/2015
 */
public class Salto_agulha {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
			
		int tamanho = Pega_quantidade_de_digitos(numero);
		
		int[] lista_digitos = coloca_numero_na_lista(numero, tamanho);
		
		boolean agulha = eh_agulha(lista_digitos);
		
		if (agulha) {
			JOptionPane.showMessageDialog(null, "O numero: " + numero + " é agulha ");
		}else {
			JOptionPane.showMessageDialog(null, "O numero: " + numero + " NAO é agulha ");
		}
		
		
	}

	private static boolean eh_agulha(int[] lista_digitos) {
				for (int i = 0; i < lista_digitos.length; i++) {
					for (int j = 0; j < lista_digitos.length; j++) {
						
						int index_abs_1 = i -j ;
						int index_abs_2 = j - i;
						Math.abs(index_abs_1);
						Math.abs(index_abs_2);
						
						if (index_abs_1 == 1 || index_abs_2 == 1) {
							
							int item_abs_1 = lista_digitos[i] - lista_digitos[j];
							int item_abs_2 = lista_digitos[j] - lista_digitos[i];
							Math.abs(item_abs_1);
							Math.abs(item_abs_2);
							
							if (item_abs_1 > 1 || item_abs_2 > 1 || item_abs_1 == 0 || item_abs_2 == 0) {
								return false;
							}
						}
					}
				}
		return true;
	}

	private static int[] coloca_numero_na_lista(int numero, int tamanho) {
		int[] numeros = new int[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			int digito = numero % 10;
			numero = numero / 10;
			
			numeros[i] = digito;
			
		}
		
		return numeros;
	}

	private static int Pega_quantidade_de_digitos(int numero) {
		int numero_aux = numero;
		int quantidade_digitos = 1;
		
		for (int i = 0; i < numero_aux; i++) {
			int digito = numero % 10;
			numero = numero / 10;
			
			if (numero != 0) {
				quantidade_digitos += 1;
			}
		}
		return quantidade_digitos;
	}

}
