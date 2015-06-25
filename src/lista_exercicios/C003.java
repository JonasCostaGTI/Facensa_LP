package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 18/06/2015
 */
public class C003 {

	public static void main(String[] args) {
		int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do dividendo: "));
		int divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do divisor: "));
		
		boolean eh_divisor = verifica_divisao(dividendo, divisor);
		if (eh_divisor) {
			JOptionPane.showMessageDialog(null, "O dividendo " + dividendo + " é divisivel pelo divisor " + divisor);
		}else {
			JOptionPane.showMessageDialog(null, "O dividendo " + dividendo + " Nao é divisivel pelo divisor " + divisor);
		}
	}

	private static boolean verifica_divisao(int dividendo, int divisor) {
		return dividendo % divisor == 0;
	}

}
