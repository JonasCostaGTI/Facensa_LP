package aula_6;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 14/04/2015
 */
public class EX0409 {
	
	
	public int[]  pega_numeros() {
		
		int numeros[] = new int[3];

		for (int i = 0; i < numeros.length; ) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("digite o " + (i+1) + ": de 1 ate 3: "));
			i++;
		}	
		return numeros;
	
	}
	
	
	public int pega_resultado(int[] numero) {
		
		if (numero[0]==2 && numero[1]==2 && numero[2]==2) {
			JOptionPane.showMessageDialog(null, "resultado iigual a 10 ");
			
		}else if ((numero[0]==numero[1] && numero[0]!=2 &&numero[1]!=2) && 
				(numero[0] == numero[2] && numero[0]!=2 && numero[2]!=2) && 
				(numero[2] == numero[1] && numero[2]!=2 && numero[1]!=2)) {
				JOptionPane.showMessageDialog(null, "resulatado é igual a 5 ");
			
		}else if ((numero[1]!= 1 && numero[2]!=1) && numero[0]==1 || numero[0]==2 || numero[0]==3){
			JOptionPane.showMessageDialog(null, "resultado é igual a 1 ");
			
		}else{
			JOptionPane.showMessageDialog(null, "resulatado igual a 0 ");
		}
		
	
		return 0;
		
	}

	public static void main(String[] args) {
		EX0409 ex0409 = new EX0409();
		int numero[];
	
		
	     numero = ex0409.pega_numeros();
	     ex0409.pega_resultado(numero);
	     
		

	}

}
