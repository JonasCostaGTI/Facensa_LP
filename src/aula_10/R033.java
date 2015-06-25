package aula_10;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 07/05/2015
 */
public class R033 {

	public static void main(String[] args) {
		
		int quantidade = R033.pega_quantidade();
		
		int numeros = 0;
		int maior_numero = 0;
		int soma = 0;
		int media = 0;
		
		for (int i = 1; i <=quantidade; i++) {
			numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do numero: "+ i));
			soma +=numeros;
			
			if (numeros > maior_numero) {
				maior_numero = numeros;
			}
		}
		
		media = soma / quantidade;
		
		JOptionPane.showMessageDialog(null,"O maior numero é: " + maior_numero);
		JOptionPane.showMessageDialog(null, "A soma dos numeros é: " + soma);
		JOptionPane.showMessageDialog(null, "A media é: " + media);

	}

	private static int pega_quantidade() {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		return quantidade;
	}

}
