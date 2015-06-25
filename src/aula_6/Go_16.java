package aula_6;

import javax.swing.JOptionPane;

public class Go_16 {
	public int ler_triplo() {
		int numero =  new Integer(JOptionPane.showInputDialog("digite o numero:"));
		int resultado = numero * 3;
		
		JOptionPane.showMessageDialog(null, "O valor do numero X 3 é: " + resultado);
		
		return resultado;
	}
	
	

	
	
	
	public static void main(String[] args) {
		Go_16 triplo = new Go_16();
		
		triplo.ler_triplo();

	}

}
