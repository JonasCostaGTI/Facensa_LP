package aula_4;

import javax.swing.JOptionPane;

public class EX0303 {

	public static void main(String[] args) {
		int valor_1 = new Integer(
				JOptionPane.showInputDialog("digite o valor 1: "));
		int valor_2 = new Integer(
				JOptionPane.showInputDialog("digite o valor 2: "));

		int decisao = new Integer(
				JOptionPane.showInputDialog("digite: 1- Adição, 2- Subtração, 3- Multiplicação e 4- Divisão"));

		switch (decisao) {
		case 1:
			int soma = valor_1 + valor_2;
			JOptionPane.showMessageDialog(null, "o valor da soma de " + valor_1
					+ " e " + valor_2 + " é de: " + soma);
			break;
		case 2:
			int subtracao = valor_1 - valor_2;
			JOptionPane.showMessageDialog(null, "o valor da subtracao de "
					+ valor_1 + " e " + valor_2 + " é de: " + subtracao);
			break;
		case 3:
			int multiplicacao = valor_1 * valor_2;
			JOptionPane.showMessageDialog(null, "o valor da multiplicacao de "
					+ valor_1 + " e " + valor_2 + " é de: " + multiplicacao);
			break;
		case 4:
			int divisao = valor_1 / valor_2;
			float resto = valor_1 % valor_2;
			JOptionPane.showMessageDialog(null, "o valor da divisao de "
					+ valor_1 + " e " + valor_2 + " é de: " + divisao
					+ " com o resto da divisao de " + resto);
			break;
		default:
			JOptionPane.showMessageDialog(null, "valor invalido");
		}
	}

}
