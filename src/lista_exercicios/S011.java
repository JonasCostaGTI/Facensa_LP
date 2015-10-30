package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta 30 de out de 2015
 * 
 *         Suponha que a sala de sua casa seja retangular. Faça um algoritmo
 *         para ler as dimensões da sala e calcular: - quantos metros de
 *         rodapé são necessários; - quantos metros quadrados de piso são
 *         necessários;
 */
public class S011 {

	public static void main(String[] args) {
		double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da largura da sala"));
		double cumprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cumprimento da sala"));

		double m_rodape = (largura * 2) + (cumprimento * 2);
		double m_piso = largura * cumprimento;

		System.out.println("A quantidade nescessaria de roda-pe para uma sala com largura de: " + largura + "\ne: "
				+ cumprimento + " de cumprimento é de: " + m_rodape + " metros de roda-pe");

		System.out.println("A quantidade nescessaria de piso em uma sala com largura de: " + largura + "\ne: "
				+ cumprimento + " de cumprimento é de: " + m_piso + " m ");
	}

}
