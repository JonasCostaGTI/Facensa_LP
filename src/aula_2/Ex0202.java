package aula_2;

import javax.swing.JOptionPane;

public class Ex0202 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("qual o nome da crianca? ");
		int fraldas_dia = new Integer(JOptionPane.showInputDialog("quantas fraldas " + nome + " utiliza por dia? "));
		float preco = new Float(JOptionPane.showInputDialog("qual o preco do pacote da fralda? "));
		int quantidade_fraldas = new Integer(JOptionPane.showInputDialog("qual a quantidade de fraldas em cada pacote? "));
		
		int uso_anual = 365 * fraldas_dia;
		float valor_cada_fralda = preco / quantidade_fraldas;
		float investimento_anual = uso_anual * valor_cada_fralda;
		
		JOptionPane.showMessageDialog(null, "O bebe "+ nome + " ira gastar por ano "+ uso_anual + " fraldas, sendo necessario o investimento de " + investimento_anual + " R$");
	}

}
