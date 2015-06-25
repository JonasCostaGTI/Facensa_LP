package aula_8;

/**
 * @author jonascosta
 * 23/04/2015
 */
public class Go_22 {

	public static void main(String[] args) {
		int numero = 1;
		
		do {
			if (numero % 2 == 0) {
				System.out.printf("o numero %d é par \n ", numero);
			}else {
				System.out.printf("o numero %d é impar \n ", numero);
			}
			numero++;
			
		} while (numero < 10);
		
		

	}

}
