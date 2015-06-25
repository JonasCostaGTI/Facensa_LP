package aula_14;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 11/06/2015
 */
public class EX0801 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para saber se é palindromo "));
		
		int numero_de_digitos = conta_numero_de_digitos(numero);
		int[] lista_de_numeros = pega_lista(numero, numero_de_digitos);
		int[] lista_numero_invertida = inverte_lista(lista_de_numeros);
		
		boolean iguais = eh_igual(lista_de_numeros,lista_numero_invertida);
		if (iguais) {
			JOptionPane.showMessageDialog(null, "O numero: " + numero + " é palindromo");
		}else {
			JOptionPane.showMessageDialog(null, "O numero: " + numero + " NAO é palindromo");
		}

	}

	private static boolean eh_igual(int[] lista_de_numeros,int[] lista_numero_invertida) {
		int contador = 0;
		for (int i = 0, j = 0; i < lista_numero_invertida.length; i++, j++) {
			
			if (lista_de_numeros[i] == lista_numero_invertida[j]) {
				contador += 1;
			}
		}
		
		if (contador == lista_de_numeros.length) {
			return true;
		}
		
		return false;
	}

	private static int[] inverte_lista(int[] lista_de_numeros) {
		int[] inverte = new int[lista_de_numeros.length];
			for (int i = 0, j = inverte.length - 1 ; i < lista_de_numeros.length; i++, j--) {
				inverte[j] = lista_de_numeros[i];
			}
		
		return inverte;
	}

	private static int[] pega_lista(int numero, int numero_de_digitos) {
		int[] numeros = new int[numero_de_digitos];
		
		for (int i = 0; i <numeros.length; i++) {
			int resto = numero % 10;
			numero /= 10;
			if (resto != 0) {
				numeros[i]= resto;
			}
		}
		
		return numeros;
	}

	private static int conta_numero_de_digitos(int numero) {
		int quantidade_digito_numero = 1;
		for (int i = 0; i <= numero; i++) {
			int resto = numero % 10;
			numero /= 10;
			if (numero != 0) {
				quantidade_digito_numero += 1;
			}
		}
		return quantidade_digito_numero;
	}

}
