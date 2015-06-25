package aula_6;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 06/04/2015
 */
public class EX0405 {
	
	public int pega_numero_charutos() {
		
		int quantidade_charutos = new Integer(JOptionPane.showInputDialog("qual a quantidade de charutos: "));		
		return quantidade_charutos;
	}
	

	public int pega_dia_da_semana() {
		int dia;
		
		dia = new Integer(JOptionPane.showInputDialog("1 para segunda até 7 para domingo: "));
		
		switch (dia) {
			case 1 :
				JOptionPane.showMessageDialog(null, "Hoje é segunda ");
				break;
			case 2 :
				JOptionPane.showMessageDialog(null, "Hoje é terca ");
			break;case 3 :
				JOptionPane.showMessageDialog(null, "Hoje é quarta ");
			break;case 4 :
				JOptionPane.showMessageDialog(null, "Hoje é quinta ");
			break;case 5 :
				JOptionPane.showMessageDialog(null, "Hoje é sexta ");
			break;case 6 :
				JOptionPane.showMessageDialog(null, "Hoje é sabado ");
			break;case 7 :
				JOptionPane.showMessageDialog(null, "Hoje é domingo ");
			break;

			default :
				JOptionPane.showMessageDialog(null, "dia invalido ");

				break;
		}
			
		return dia;
		
	}
	
	
	public boolean decide_festa_continua(int dia, int charutos) {
		
		boolean continua = false;
		
		if (dia  <= 5 && charutos >= 40 && charutos <=60 ) {
			JOptionPane.showMessageDialog(null, "Festa continua, Hoje é dia de semana mas, estamos dentro do limite de charutos. dia: " + dia + ", Charutos: " + charutos);
			continua = true;
			
			}
		
		switch (dia) {
			case 6 :
				if (charutos >40){
					JOptionPane.showMessageDialog(null, "Festa continua, Hoje é sabado ou seja, sem limite maximo de charutos. dia: " + dia + ", Charutos: " + charutos);
					continua = true;
				}
				break;
			case 7 :
				if (charutos >40){
					JOptionPane.showMessageDialog(null, "Festa continua, Hoje é domingo ou seja sem, sem limite maximo de charutos. dia: " + dia + ", Charutos: " + charutos);
					continua = true;

				}
				break;	
			
		
		}
		
		return continua;
		
	}
	
	
	public boolean decide_festa_para(int dia, int charutos) {
		
		boolean para = false;
		if (dia <=5 && charutos < 40 || charutos > 60 ) {
			JOptionPane.showMessageDialog(null, "Festa para, Hoje é dia de semana e estamos fora do limite de charutos. dia: " + dia + ", Charutos: " + charutos);
			para = true;
			
			}
		
		switch (dia) {
			case 6 :
				if (charutos < 40){
					JOptionPane.showMessageDialog(null, "Festa para, estamos no fim de semana mas estamos fora do limite minimo de charutos. dia: " + dia + ", Charutos: " + charutos);
					para = true;
				}
				break;
			case 7 :
				if (charutos < 40){
					JOptionPane.showMessageDialog(null, "Festa para, estamos no fim de semana mas estamos fora do limite minimo de charutos. dia: " + dia + ", Charutos: " + charutos);
					para = true;

				}
				break;	
			}
		
		return para;
	}
	
	
	
	
	public static void main(String[] args) {
		EX0405 ex0405 = new EX0405();
		
		int charutos = 0;
		int dia = 0;
		boolean continua = false;
		
		
		
		dia = ex0405.pega_dia_da_semana();
		charutos = ex0405.pega_numero_charutos();
		continua = ex0405.decide_festa_continua(dia, charutos);
		
		while (continua) {
			dia = ex0405.pega_dia_da_semana();
			charutos = ex0405.pega_numero_charutos();
			continua = ex0405.decide_festa_continua(dia, charutos);
		}
		
		ex0405.decide_festa_para(dia, charutos);
		
		
		
		
	
		
		
		
		
		
	
		
		
		
		
		
	}

}
