package aula_6;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 03/04/2015
 */
public class EX0404 {
	
	
	//pega numeros
	public static ArrayList<Integer>  pega_lista_numero(int tamanho_lista, ArrayList<Integer> lista_numeros) {
		
		int numero = 0;
		
		for (int i = 0; i < tamanho_lista; i++) {
			numero = new Integer(JOptionPane.showInputDialog("digite o numero: " + (i+1) + " da lista de tamanho: " + tamanho_lista + ":"));
			lista_numeros.add(numero);
		}

		return lista_numeros;
		}
	
	
	//ordena numeros
	public static ArrayList<Integer> ordena_numeros(ArrayList<Integer> lista_numeros) {
		
		Collections.sort(lista_numeros);
		return lista_numeros;
		
	}
	
	
	//pega maior
	public static int pega_numero_maior(ArrayList<Integer> lista_numeros) {
		int maior;
		
		maior = Collections.max(lista_numeros);
		return maior;
		
	}
	
	//pega menor
	public static int pega_numero_menor(ArrayList<Integer> lista_numeros) {
		int menor;
			
		menor = Collections.min(lista_numeros);
		return menor;
			
		}
	
	public static ArrayList<Integer> pega_media_lista(ArrayList<Integer> lista_numeros) {
		int soma = 0;
		int media = 0;
		for (int i = 0; i < lista_numeros.size(); i++) {
			soma += lista_numeros.get(i);
		}
		
		media = soma / lista_numeros.size();
		JOptionPane.showMessageDialog(null, "A media da soma dos elementos é: " + media);
		
		
		
		return null;
		
	}
	
	
	
	

	public static void main(String[] args) {
		ArrayList<Integer> lista_numeros =  new ArrayList<Integer>();
		
		int tamanho_lista = new Integer(JOptionPane.showInputDialog("Qual o tamanho da lista de numeros: "));
		int numero_maior;
		int numero_menor;
		
		//pega numeros
		pega_lista_numero(tamanho_lista, lista_numeros);
		JOptionPane.showMessageDialog(null, "A lista de numeros é: " + lista_numeros);
		
		//ordena numeros
		ordena_numeros(lista_numeros);
		JOptionPane.showMessageDialog(null, "Lista dos numeros ordenada: " + lista_numeros);
		
		//pega_numero_maior
		numero_maior = pega_numero_maior(lista_numeros);
		JOptionPane.showMessageDialog(null, "O numero maior da lista é: " + numero_maior);
		
		//pega_numero_menor
		numero_menor = pega_numero_menor(lista_numeros);
		JOptionPane.showMessageDialog(null, "O numero menor da lista é: " + numero_menor);

		
		// pega media
		pega_media_lista(lista_numeros);
		
		

		
	

		
		
	

	}



}


