package aula_4;

import javax.swing.JOptionPane;

public class Go_12 {

	public static void main(String[] args) {

		int idade = new Integer(
				JOptionPane.showInputDialog("qual a sua idade:"));

		if (idade >= 18 && idade < 70) {
			JOptionPane.showMessageDialog(null,
					"Obrigatório votar nas eleições!");
		} else {
			if ((idade >= 16 && idade < 18) || idade >= 70) {
				JOptionPane
						.showMessageDialog(null, "Obrigatório nas eleições!");
			} else {
				JOptionPane.showMessageDialog(null,
						"nao pode votar nas eleições!");
			}
		}

	}
}
