package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 18/06/2015
 */
public class R001 {

	public static void main(String[] args) {
		int valor_referencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de referencia"));
		int valor_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial"));
		int valor_final = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final"));
		
		
		boolean contem = false;
		for (valor_inicial = 0; valor_inicial < valor_final; valor_inicial++) {
			
			contem = verifica_numero_contem(valor_inicial,valor_final,valor_referencia);
		}
		
		if (contem) {
			JOptionPane.showMessageDialog(null, "O numero " + valor_referencia + " esta contido no range");
		}else {
			JOptionPane.showMessageDialog(null, "O numero " + valor_referencia + " NAO esta contido no range");
		}

		
		
	}

	private static boolean verifica_numero_contem(int valor_inicial, int valor_final, int valor_referencia) {
		if (valor_referencia >= valor_inicial && valor_referencia <= valor_final) {
			return true;
		}
		return false;
	}

}
