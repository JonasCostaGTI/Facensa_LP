package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 14/05/2015
 */
public class EX0509 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		if (eh_harshard(numero)) {
			System.out.printf("numero %d é harshard ", numero);
		}else{
			System.out.printf("numero %d nao é harshard ", numero);
		}

	}

	private static boolean eh_harshard(int numero) {
		int soma_dos_digitos = pegar_soma(numero); 
		return numero % soma_dos_digitos == 0;
		
	}

	private static int pegar_soma(int numero) {
		int soma_digitos = 0;
		
		while (numero > 0) {
			soma_digitos += numero % 10;
			numero = numero / 10;
		}
		
		
		return soma_digitos;
	}

}
