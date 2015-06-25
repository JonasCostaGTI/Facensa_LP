package aula_6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 11/04/2015
 */


public class EX0407 {
	
	public ArrayList<Integer> pega_numeros() {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numero;
		
		for (int i = 0; i < 3; ) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("digite o " + (i+1) + " da lista: "));
			numeros.add(numero);
			i++;
			
		}
		
		return numeros;
		
	}

	public int verifica_lista(ArrayList<Integer> numeros) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int soma = 0;
		
		
		for (int i = 0; i < numeros.size(); i++) {
			num1 = numeros.get(0);
			num2 = numeros.get(1);
			num3 = numeros.get(2);
		}
		
		
		if (num1 != num2 && num1 != num3 && num3 != num2) {
			soma = num1 + num2 + num3;
			
		}else if (num1 == num2 && num1 == num3 && num3 == num2) {
			soma = num1;
			
		}else if (num1 == num2 && num1 != num3 && num3 != num2) {
			soma = num1 + num3;
			
		}else if (num1 != num2 && num1 != num3 && num3 == num2) {
			soma = num1 + num2;
			
		}else if (num1 != num2 && num1 == num3 && num3 != num2) {
			soma = num1 + num2;
		}
		
		
		
		return soma;
		
	}
	
	
	

	public static void main(String[] args) {
		EX0407 ex0407 = new EX0407();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int soma = 0;
		
		
		numeros = ex0407.pega_numeros();
		JOptionPane.showMessageDialog(null, numeros);
		
		
		
		soma = ex0407.verifica_lista(numeros);
		JOptionPane.showMessageDialog(null, soma);

	}

}
