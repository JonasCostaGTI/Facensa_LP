package aula_6;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 11/04/2015
 */
public class EX0406 {
	
	public int pega_meu_parametro() {
		int parametro;
		parametro = Integer.parseInt(JOptionPane.showInputDialog(" de 1 a 10, qual a nota da minha roupa: "));
		return parametro;
	
		
	}

	
	public int  pega_parametro_dela() {
		int parametro_dela;
		parametro_dela =  Integer.parseInt(JOptionPane.showInputDialog("de 1 a 10, qual a nota da roupa dela:"));
		return parametro_dela;
		
	}
	
	
	public int determina_mesa(int meu_parametro, int parametro_dela) {
		
		int mesa = 0;
		
		if ((meu_parametro > 8 && parametro_dela >= 2) || (parametro_dela > 8 && meu_parametro >= 2)){
			mesa = 2;
			JOptionPane.showMessageDialog(null, "um de nos dois obtivetemos avaliacao acima ou igual a 8. ou seja, Sim. Codigo: " + mesa);
			
		}else if ((meu_parametro <= 2 && parametro_dela > 8) || (parametro_dela <= 2 && meu_parametro > 8)) {
			mesa = 0;
			JOptionPane.showMessageDialog(null, "um de nos dois obtivetemos avaliacao de menor que 2. ou seja, Nao. Codigo: " + mesa);
			
		}else if ((meu_parametro >= 2 && meu_parametro < 8) || (parametro_dela >= 2 && parametro_dela < 8)) {
			mesa = 1;
			JOptionPane.showMessageDialog(null, "um de nos dois obtivemos avaliacao de maior que 2 e menor que 7. ou seja, Talvez. Codigo: " + mesa);

		}
		
		return mesa;
		
	}
	
	
	

	public static void main(String[] args) {
		EX0406 ex0406 = new EX0406();
		
		int meu_parametro = 0;
		int parametro_dela = 0;
		
		meu_parametro = ex0406.pega_meu_parametro();
		parametro_dela = ex0406.pega_parametro_dela();
		ex0406.determina_mesa(meu_parametro, parametro_dela);
	}

}
