package aula_13_G1;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 28/05/2015
 */
public class Numeros_circulares {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

		int quantidade_de_digitos = Pega_quantidade_de_digitos(numero);
		
		int[] lista_digitos = coloca_numeros_na_lista(numero, quantidade_de_digitos);
		
		boolean circular = eh_circular(numero,quantidade_de_digitos,lista_digitos);
		System.out.println(circular);
		
	}

	private static boolean eh_circular(int numero,int quantidade_de_digitos, int[] lista_digitos) {
		int resultado = 0;
		int q_digitos_resultado = 0;
		
		for (int i = 2; q_digitos_resultado < quantidade_de_digitos ; i++) {
			resultado = numero * i;
			q_digitos_resultado = Pega_quantidade_de_digitos(resultado);
			
			if (q_digitos_resultado == quantidade_de_digitos) {
				int[] lista_resultado = coloca_numeros_na_lista(resultado, q_digitos_resultado);
				int[] lista_resulatdo_ordenada = ordena_lista(lista_resultado);
				int[] lista_digitos_ordenada = ordena_lista(lista_digitos);
				
				
				int conta = 0;
				for (int j = 0; j < lista_resulatdo_ordenada.length; j++) {
					for (int k = 0; k < lista_digitos_ordenada.length; k++) {
						
						if (j == k) {
							if (lista_resultado[j] == lista_digitos[k]) {
								conta += 1;
								
								if (conta == quantidade_de_digitos) {
									return true;
								}
								
							}
						}
						
					}
				}
				
			}
			
			
			
		}
		return false;
	}

	
	
	private static int[] ordena_lista(int[] lista_resultado) {
		
		for (int i = 0; i < lista_resultado.length; i++) {
			for (int j = 0; j < lista_resultado.length; j++) {
				
				int aux = 0;
				if (lista_resultado[i] > lista_resultado[j]) {
					aux = lista_resultado[i];
					lista_resultado[i] = lista_resultado[j];
					lista_resultado[j] = aux;
				}
			}
		}
		
		
		return lista_resultado;
	}

	private static int[] coloca_numeros_na_lista(int numero,int quantidade_de_digitos) {
		int[] numeros = new int[quantidade_de_digitos];
		
		for (int i = 0; i < quantidade_de_digitos; i++) {
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
