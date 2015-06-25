package aula_9;

/**
 * @author jonascosta
 * 30/04/2015
 */
public class R017 {

	public static void main(String[] args) {
		
		for (int numero = 13; numero <= 133; numero++) {
			if ((numero & 2) == 0) {
				System.out.println(numero);
			}
		}
		
	}

}
