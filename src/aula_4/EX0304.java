package aula_4;

import java.util.Calendar;
import java.util.GregorianCalendar;


import javax.swing.JOptionPane;

public class EX0304 {

	public static void main(String[] args) {
		
		
		int ano_de_nacismento = new Integer(JOptionPane.showInputDialog(null,"Qual o ano de seu nacimento: "));
		
		
		Calendar ano_atual = GregorianCalendar.getInstance();
		int idade =  ano_atual.get(Calendar.YEAR) - ano_de_nacismento;	
		JOptionPane.showMessageDialog(null, "sua idade é de " + idade + " anos");
			
		if (idade <= 17){
			JOptionPane.showMessageDialog(null, "com "+idade + " anos, voce esta na faixa etaria JOVEM");
			if( idade <=10 ){
				JOptionPane.showMessageDialog(null, "com "+idade + " anos, voce esta na faixa etaria JOVEM e categoria INFANTIL");
			}
			if(idade >10 &&  idade <=17){
				JOptionPane.showMessageDialog(null, "com "+idade + " anos, voce esta na faixa etaria JOVEM e categoria JUVENIL");
			}
		}
		else if(idade >=18 && idade <59){
			JOptionPane.showMessageDialog(null, "com "+idade + " anos, voce esta na faixa etaria ADULTA");
		}
		else if(idade >59){
			JOptionPane.showMessageDialog(null, "com "+idade + " anos, voce esta na faixa etaria IDOSO");
		
		}
		
		
	}
}
