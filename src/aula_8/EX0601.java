package aula_8;

/**
 * @author jonascosta
 * 30/04/2015
 */
public class EX0601 {

	public static void main(String[] args) {
		
		int total = 0;
		for (int i = 0; i <10000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				total += i;
			}
		}
		System.out.println("A soma dos multiplos de 5 ou 3 de 0 a 1000 é: " + total);
		

	}

}
