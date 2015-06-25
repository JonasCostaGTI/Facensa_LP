package aula_8;

/**
 * @author jonascosta
 * 07/05/2015
 */
public class EX0602 {

	public static void main(String[] args) {
float maiorFatorPrimo = pegarMaiorFatorPrimo( 600851475143f );
		
		System.out.println(maiorFatorPrimo);
		
	}

	private static float pegarMaiorFatorPrimo(float dividendo) {
		float maiorDivisor = -1;
		
		for ( long divisor = 1; divisor < dividendo; divisor++){
			if ( ehPrimo(divisor)){
				if ( dividendo % divisor == 0 ){
					maiorDivisor = divisor;
				}
			}
		}

		return maiorDivisor;
	}

	private static boolean ehPrimo(long dividendo) {
		int soma = 0;
		
		for (int divisor = 1; divisor <= dividendo; divisor++){
			if ( dividendo % divisor == 0 ){
				soma++;
			}
			
		}
		
		return ( soma == 2);


	}

}
