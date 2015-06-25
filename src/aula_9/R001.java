package aula_9;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 30/04/2015
 */
public class R001 {
	
	public static void main(String[] args){
	
	int referencia = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de referencia: "));
	int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o inicio: "));
	int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de fim"));
	
	boolean contem = esta_contido(referencia,inicio,fim);
	
	if (contem) {
		System.out.println("o numero de " + referencia + " esta contido entre os numeros " + inicio + " e " + fim);
	}else {
		System.out.println("o numero de " + referencia + " nao contido entre os numeros " + inicio + " e " + fim);
	}
	

	
}

	private static boolean esta_contido(int referencia, int inicio, int fim) {
		return (referencia > inicio && referencia <fim);
	}
}