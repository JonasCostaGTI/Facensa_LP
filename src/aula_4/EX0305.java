package aula_4;

import javax.swing.JOptionPane;

public class EX0305 {

	public static void main(String[] args) {
		int ano = new Integer(JOptionPane.showInputDialog("digite o ano a saber se é bissesto: "));
		
		if (ano % 4 == 0){
			JOptionPane.showMessageDialog(null, "o ano " + ano + " é bissesto");
		}else{
			JOptionPane.showMessageDialog(null, "o ano " + ano + " nao é bissesto");

		}
	}

}
