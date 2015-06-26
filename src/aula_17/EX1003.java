package aula_17;

/**
 * @author jonascosta
 * 25/06/2015
 */
public class EX1003 {

	public static void main(String[] args) {
		boolean condicao = false;
		long somador = 1;
		
		while (condicao == false) {
			
			boolean numero_divisivel = eh_divisivel(somador);
			if (numero_divisivel == true) {
				condicao = true;
				
				System.out.println("O numero " + somador + " tem o resto da divisao de 1 a 20 sem resto");
			}
			
			somador += 1;
			
		}

	}

	private static boolean eh_divisivel(long somador) {
		for (int i = 1; i <=20; i++) {
			if (somador % i != 0) {
				return false;
			}
		}
		
		
		
		return true;
	}

}
