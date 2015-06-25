package aula_5;

import javax.swing.JOptionPane;

public class C031 {

	public static void main(String[] args) {
		String codigo_produto = (JOptionPane.showInputDialog("qual o codigo do produto: "));
		int quantidade_produto = new Integer(JOptionPane.showInputDialog("qual a quantidade do produto: "));
		
		if (codigo_produto.equals("P001") || (codigo_produto.equals("p001"))){
			JOptionPane.showMessageDialog(null, "o produto é uma caneta e o valor unitario é de: 1.25 " + "o preco da compra é de: " + (quantidade_produto * 1.25));
		}else if (codigo_produto.equals("P002") || (codigo_produto.equals("p002"))) {
			JOptionPane.showMessageDialog(null, "o produto é um lapis e o valor unitario é de: 0.25 " + "o preco da compra é de: " + (quantidade_produto * 0.25));
		}else if (codigo_produto.equals("P003") || (codigo_produto.equals("p003"))) {
			JOptionPane.showMessageDialog(null, "o produto é uma borracha e o valor unitario é de: 1.75 " + "o preco da compra é de: " + (quantidade_produto * 1.75));
		}

	}

}
