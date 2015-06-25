package aula_15_prova;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 18/06/2015
 */
public class S011 {

	public static void main(String[] args) {
		int largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura"));
		int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento"));
		
		int metros_rodape = (largura * 2) + (comprimento * 2);
		int metros_quadrados = largura * comprimento;
		
		JOptionPane.showMessageDialog(null, "sera nescessario " + metros_rodape + " metros de rodape");
		JOptionPane.showMessageDialog(null, "Sera nescessario " + metros_quadrados + " m2 de piso ");
		
		
	}

}
