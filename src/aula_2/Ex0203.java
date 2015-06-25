package aula_2;

import javax.swing.JOptionPane;

public class Ex0203 {

	public static void main(String[] args) {
		float largura = new Float(JOptionPane.showInputDialog("qual a largura da cozinha? "));
		float comprimento = new Float(JOptionPane.showInputDialog("qual a comprimento da cozinha? "));
		
		float metros_quadrados = largura * comprimento;
		JOptionPane.showMessageDialog(null,"a cozinha possui " + metros_quadrados + " m2");
		
		float custo_m2_azulejo = new Float(JOptionPane.showInputDialog("qual o valor do m2 do azulejo? "));
		float gasto = metros_quadrados * custo_m2_azulejo;
		
		JOptionPane.showMessageDialog(null,"voce ira gastar " + gasto + " de azulejo na cozinha");

	}

}
