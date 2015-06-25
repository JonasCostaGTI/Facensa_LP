package aula_15_prova;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 18/06/2015
 */
public class S016 {

	public static void main(String[] args) {
		int largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura"));
		int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento"));
		
		int potencia = calcula_potencia(largura, comprimento);
		JOptionPane.showMessageDialog(null, "A potencia para este local é de " + potencia);

	}

	private static int calcula_potencia(int largura, int comprimento) {
		int potencia = (largura * comprimento) * 18;
		return potencia;
	}

}
