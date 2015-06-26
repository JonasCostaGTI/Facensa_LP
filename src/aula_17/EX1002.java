package aula_17;

/**
 * @author jonascosta
 * 25/06/2015
 */
public class EX1002 {

	public static void main(String[] args) {
	
		int contador = 1;
		int limite = 100;
		
		
		for (int numero = 1; contador <= limite; numero++) {
		
			long soma_dos_divisores = calcula_soma_divisores(numero);
			long soma_dos_div_dos_div = calcula_soma_div_div(soma_dos_divisores);
			
			
			if (soma_dos_div_dos_div == numero) {
				System.out.println("posicao: " + contador);
				System.out.println("A soma dos divisores do numero: " + numero + " é: " + soma_dos_divisores);
				System.out.println("A soma dos divisores de: " + soma_dos_divisores + " é: " +soma_dos_div_dos_div);
				
				
				if (contador == limite) {
					System.out.println("fim da execucao");
				}
				
				contador +=1;	
			}
			

		}

	}

	private static int calcula_soma_div_div(long soma_dos_divisores) {
		int soma = 0;
		
		for (int i = 1; i < soma_dos_divisores; i++) {
			
			if (soma_dos_divisores % i == 0) {
				soma += i;
			}
		}
		
		return soma;
	}

	private static int calcula_soma_divisores(long numero) {
		int soma = 0;
		for (int i = 1; i < numero; i++) {
			
			if (numero % i == 0) {
				soma += i;
			}
		}
		
		return soma;
	}

}
