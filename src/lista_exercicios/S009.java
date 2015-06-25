package lista_exercicios;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 18/06/2015
 */
public class S009 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
		
		int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de D:"));
		int e = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de E:"));
		
		
		
		int x = 0;
		int y = 0;
		
		int c = (a*x) + (b*y);
		int f = (d*x) + (e*y);
		
		x =  (c*e)-(b*f) / (a*e)-(b*d)  ; 
		y =  (a*f)-(c*d) / (a*e)-(b*d)  ;
		
		
		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);
		
		
	}

}
