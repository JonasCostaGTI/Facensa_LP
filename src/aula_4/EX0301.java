package aula_4;

import javax.swing.JOptionPane;

public class EX0301 {

	public static void main(String[] args) {
		String nome_pessoa_1 = JOptionPane.showInputDialog("qual o nome da primeira pessoa: ");
		String nome_pessoa_2 = JOptionPane.showInputDialog("qual o nome da segunda pessoa: ");
		
		float altura_pessoa_1 = new Float(JOptionPane.showInputDialog("qual a altura do " +nome_pessoa_1 + " : "));
		float altura_pessoa_2 = new Float(JOptionPane.showInputDialog("qual o altura do " +nome_pessoa_2 + " : "));
		
		if (altura_pessoa_1 > altura_pessoa_2){
			JOptionPane.showMessageDialog(null, nome_pessoa_1 + " é a pessoa maior");
			
		}else if (altura_pessoa_1 < altura_pessoa_2) {
			JOptionPane.showMessageDialog(null, nome_pessoa_2 + " é a pessoa maior");	
			
		}else if (altura_pessoa_1 == altura_pessoa_2){
			JOptionPane.showMessageDialog(null, nome_pessoa_2 + " e " + nome_pessoa_1 + " sao da mesma altura");	
		}
	}
}

