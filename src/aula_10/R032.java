package aula_10;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 07/05/2015
 */
public class R032 {

	public static void main(String[] args) {

		float valor_total = 0;
		float media = 0;
		
		
		
		String condicao = "s"	;
		while (condicao.equals("s")) {
			
		
		int numero_mercadorias = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de mercadorias no estoque: "));
		
		for (int i = 1; i <=numero_mercadorias; i++) {
			float valor_mercadoria = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da mercadoria: " + i));
			valor_total += valor_mercadoria;
	
		}
		media = valor_total / numero_mercadorias;
		
		
		System.out.println("O valor total das mercadorias é de: " + valor_total);
		System.out.println("A media de valor das mercadorias é de: "  + media);
		
		condicao = JOptionPane.showInputDialog(" S ou N");
		

		}
	}

}
