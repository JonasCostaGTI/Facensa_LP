package aula_17;

/**
 * @author jonascosta
 * 25/06/2015
 */
public class EX1002 {

	public static void main(String[] args) {
		boolean condicao = false;
		int numero_aleatorio = 1;
		
		
		while (condicao == false) {
			
			int soma_dos_divisores = calcula_soma_divisores(numero_aleatorio);
			int soma_dos_div_dos_div = calcula_soma_div_div(soma_dos_divisores);
			
			
			if (soma_dos_div_dos_div == numero_aleatorio) {
				System.out.println("paro aqui");
			}
			
			condicao = true;
			numero_aleatorio += 1;
		}

	}

	private static int calcula_soma_div_div(int soma_dos_divisores) {
		int soma = 0;
		
		for (int i = 1; i < soma_dos_divisores; i++) {
			
			if (soma_dos_divisores % i == 0) {
				soma += i;
			}
		}
		
		return soma;
	}

	private static int calcula_soma_divisores(int numero_aleatorio) {
		int soma = 0;
		for (int i = 1; i < numero_aleatorio; i++) {
			
			if (numero_aleatorio % i == 0) {
				soma += i;
			}
		}
		
		return soma;
	}

}
