package aula_5;

import javax.swing.JOptionPane;

public class C029 {

	public static void main(String[] args) {
		int menu = new Integer(JOptionPane.showInputDialog("digite: 1-solteiro(a), 2-desquitado(a), 3-casado(a), 4-divorciado(a), 5-viuvo(a)"));
		
		switch (menu) {
		case 1:
			JOptionPane.showMessageDialog(null, " Voce escolheu a opcao solteiro ");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, " Voce escolheu a opcao desquitado ");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, " Voce escolheu a opcao casado");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, " Voce escolheu a opcao divorciado");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, " Voce escolheu a opcao viuvo");
			break;
			default:
				JOptionPane.showMessageDialog(null, "opcao invalida");
		}
	}

}
