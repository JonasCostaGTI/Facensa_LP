package aula_6;

import javax.swing.JOptionPane;



/**
 * @author jonascosta
 * 13/04/2015
 */
public class EX0408 {
	
	public int pega_dia_da_semana() {
		int dia;
		
		dia = new Integer(JOptionPane.showInputDialog("1:segunda, 2:terca, 3:quarta, 4:quinta, 5:sexta, 6:sabado, 0:domino "));
		
		switch (dia) {
			case 1 :
				JOptionPane.showMessageDialog(null, "Hoje é segunda ");
				break;
			case 2 :
				JOptionPane.showMessageDialog(null, "Hoje é terca ");
			break;
			case 3 :
				JOptionPane.showMessageDialog(null, "Hoje é quarta ");
			break;
			case 4 :
				JOptionPane.showMessageDialog(null, "Hoje é quinta ");
			break;
			case 5 :
				JOptionPane.showMessageDialog(null, "Hoje é sexta ");
			break;
			case 6 :
				JOptionPane.showMessageDialog(null, "Hoje é sabado ");
			break;
			case 0 :
				JOptionPane.showMessageDialog(null, "Hoje é domingo ");
			break;

			default :
				JOptionPane.showMessageDialog(null, "dia invalido ");

				break;
		}
			
		return dia;
	
	}
	
	public int pega_status_ferias() {
		
		int status = 0;
		status = Integer.parseInt(JOptionPane.showInputDialog("digite 1 para trabalhando ou 0 para ferias: "));
		
		if (status == 1) {
			JOptionPane.showMessageDialog(null, "trabalhando ");
		}if (status==0){
			JOptionPane.showMessageDialog(null, "ferias ");
		}
		
		return status;
		
	}

	public void set_alarme(int dia, int status) {
		
		if (dia <= 5 && dia != 0 && status == 1) {
			JOptionPane.showMessageDialog(null, "O alarme esta setado para: 07:00 porque voce esta trabalhando");
			
		}else if (dia <= 5 && dia != 0 && status == 0) {
			JOptionPane.showMessageDialog(null, "O alarme esta setado para: 10:00 porque voce esta de ferias mas, é dia de semana");
				
		}else if (dia > 5 || dia == 0 && status == 1) {
			JOptionPane.showMessageDialog(null, "O alarme esta setado para: 10:00 porque é fim de semana mas, voce nao esta de ferias");
			
		}else if (dia > 5  || dia == 0  && status == 0) {
			JOptionPane.showMessageDialog(null, "O alarme esta DESLIGADO porque é fim de semana e voce esta de ferias");
		}
		
		
		
		return ;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		EX0408 ex0408 = new EX0408();
		int dia = 0;
		int status = 0;
		
		dia = ex0408.pega_dia_da_semana();
		status = ex0408.pega_status_ferias();
		ex0408.set_alarme(dia, status);
		
		

	}

}
