package aula_10;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 07/05/2015
 */
public class R034 {

	public static void main(String[] args) {
		
		double maior_preco = 0.0;
		double soma_preco = 0.0;
		double media_preco = 0.0;
		int quantidade_produtos = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de produtos: "));
		
		for (int i = 1; i <=quantidade_produtos; i++) {
				//int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do: " + i + " produto"));
				double preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preco do produto " + i));
				
				soma_preco += preco;
				media_preco = soma_preco /quantidade_produtos;
				
				
				if (preco > maior_preco) {
					maior_preco = preco;
				}
				
				
			}
		
		System.out.println("O maior preco é: " + maior_preco);
		System.out.println("A media dos precos é: " + media_preco);
			
				
		
		
		
		
		

	}

}
