package aula_14;

/**
 * @author jonascosta
 * 11/06/2015
 */
public class EX0803 {

	public static void main(String[] args) {
		long aux_soma_total = 0;
		for (int numero = 3;  numero < 1000; numero++) {
			
		long numero_de_digitos = conta_numero_de_digitos(numero);
		
		long[] lista_de_numeros = pega_lista(numero, numero_de_digitos);
		
		long[] lista_fatorial = pega_fatorial(lista_de_numeros);
		
		long soma_dos_fatorial = soma_fatorial(lista_fatorial);
		
		
		
		long soma = 0;
		if (soma_dos_fatorial == numero) {
			soma += soma_dos_fatorial;
			aux_soma_total += 1;
			
			System.out.println("A soma de fatoriais de cada digito do numero: " + numero + " é: " + soma);
			System.out.println("procurando...");
		}
		
	}
		
		System.out.println("Fim do loop. \nForam encontrados " + aux_soma_total + " Combinacoes ");
	}
	
	
	private static int soma_fatorial(long[] lista_fatorial) {
		int soma = 0;
		for (int i = 0; i < lista_fatorial.length; i++) {
			soma += lista_fatorial[i];
		}
		return soma;
	}

	private static long[] pega_fatorial(long[] lista_de_numeros) {
		
		for (int i = 0; i < lista_de_numeros.length; i++) {
			 int fatorial = 1;
			for (int controle = 2; controle <= lista_de_numeros[i]; controle++) {
				fatorial = fatorial * controle;
			}
			lista_de_numeros[i] = fatorial;
		}
		return lista_de_numeros;
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

	private static long[] pega_lista(int numero, long numero_de_digitos) {
	long[] numeros = new long[(int) numero_de_digitos];
	
	for (int i = 0; i <numeros.length; i++) {
		int resto = numero % 10;
		numero /= 10;
		if (resto != 0) {
			numeros[i]= resto;
		}
	}
	
	return numeros;
}

	}


