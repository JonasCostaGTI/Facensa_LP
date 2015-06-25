package aula_3;

import javax.swing.JOptionPane;

public class S001 {

	public static void main(String[] args) {
		 float valor_produto = new Float(JOptionPane.showInputDialog(null, "qual o valor do produto: "));
		 
		 double acrescimo = 0.30;
		 double valor_final = (valor_produto * acrescimo) + valor_produto;
		 
		 JOptionPane.showMessageDialog(null, "o valor do produto com acrescimo de 30% Ž de: " + valor_final);
		 
	}

}
	