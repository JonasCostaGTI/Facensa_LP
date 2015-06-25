package aula_2;

import javax.swing.JOptionPane;

public class Ex0201 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null,"qual seu nome? ");
		int ano_nacimento = new Integer(JOptionPane.showInputDialog(null,"qual o ano do seu nascimento? "));
				
		int idade = 2015 - ano_nacimento;
		JOptionPane.showMessageDialog(null, nome + ", sua idade é de " + idade + " anos");
	}

}
