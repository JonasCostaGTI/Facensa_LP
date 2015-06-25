package aula_6;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 03/04/2015
 */



public class EX0401 {
	
	public int tabuada(int numero_tabuada) {
		
		int resultado = 0;
		int soma = 0;
		
		for (int i = 1; i < 10; i++) {
			resultado =  numero_tabuada * i;
			soma += resultado;
		}
	
		return soma;
	}
	

	
	
	public static void main(String[] args) {
		EX0401 Tabuada = new EX0401();
		
		int numero_tabuada = new Integer(JOptionPane.showInputDialog("Qual o numero para saber a soma dos resultados da tabuada: "));
		int resultado_soma;
		
		resultado_soma = Tabuada.tabuada(numero_tabuada);
		JOptionPane.showMessageDialog(null, "Resultado da soma dos valores da tabuada do: " + numero_tabuada + " é: " + resultado_soma);
		
		
		
	
	}

}
