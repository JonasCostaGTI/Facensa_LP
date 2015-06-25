package aula_3;

import javax.swing.JOptionPane;

public class S020 {

	public static void main(String[] args) {
		
		double queijo_QGramas = 50;
		double presunto_QGramas = 50;
		double hamburguer = 100;
		
		String nome_sanduiche = JOptionPane.showInputDialog(null,"qual o nome do sanduiche: ");
		int quantidades_produzir = new Integer(JOptionPane.showInputDialog(null,"qual a quantidade de sanduiches a fazer: "));
		
		double quantidade_queijo = quantidades_produzir * ((queijo_QGramas * 2) / 1000);
		double quantidade_presunto = quantidades_produzir * (presunto_QGramas / 1000);
		double quantidade_hamburguer = quantidades_produzir * (hamburguer / 1000);
		
		JOptionPane.showMessageDialog(null, "voce ira gastar "+quantidade_queijo+"kg de queijo "+ quantidade_presunto+"kg de presunto "+quantidade_hamburguer+"kg de hamburguer para fazer "+quantidades_produzir+" hamburguer "+nome_sanduiche);

	}

}
