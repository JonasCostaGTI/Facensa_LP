package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 20/04/2015
 */
public class EX0512 {

	public static void main(String[] args) {
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor em pés para saber as conversoes: "));
		
		float polegadas = EX0512.converte_para_polegadas(valor);
		float jardas = EX0512.converte_para_jardas(valor);
		float milhas = EX0512.converte_para_milhas(valor);
		
		System.out.println(valor + " ft: equivale a: " + polegadas + " inch");
		System.out.println(valor + " ft: equivale a: " + jardas + " yd");
		System.out.println(valor + " ft: equivale a: " + milhas + " mile");
		

	}

	private static float converte_para_milhas(int valor) {
		return (float) (valor * 0.00016447);
	}

	private static float converte_para_jardas(int valor) {
		return (float) (valor * 0.333333);
	}

	private static float converte_para_polegadas(int valor) {
		return (float) (valor * 12.000);
	}

}
