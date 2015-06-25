package lista_exercicios;

import java.util.Calendar;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 15/06/2015
 */
public class S007 {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		
		int ano_nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento: "));
		int ano_atual = calendario.get(Calendar.YEAR);
		
		int idade_atual = ano_atual - ano_nascimento;
		
		JOptionPane.showMessageDialog(null, "A sua idade atual é de: " + idade_atual);
		
		
		
	}

}
