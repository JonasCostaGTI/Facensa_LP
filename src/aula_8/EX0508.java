package aula_8;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 20/04/2015
 */
public class EX0508 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = EX0508.le_numeros();
		
		ArrayList<Integer> ordenada = EX0508.ordena_numeros(numeros);
		JOptionPane.showMessageDialog(null, "numeros ordenados : " + ordenada);;

	}

	public static ArrayList<Integer> ordena_numeros(ArrayList<Integer> numeros) {
		Collections.sort(numeros);
		return numeros;
	}

	public static ArrayList<Integer> le_numeros() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da lista: "));
		
		for (int i = 0; i < tamanho; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: " + (i+1) + " da lista de tamanho: " + tamanho));
			numeros.add(numero);	
		}
		return numeros;
	}

}
