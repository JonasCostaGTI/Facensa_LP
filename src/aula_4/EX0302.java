package aula_4;

import javax.swing.JOptionPane;

public class EX0302 {

	public static void main(String[] args) {
		int horas_Trabalho_pessoa_1 = new Integer(JOptionPane.showInputDialog("quantas horas de trabalho a pessoa1 trabalhou este mes: "));
		int horas_Trabalho_pessoa_2 = new Integer(JOptionPane.showInputDialog("quantas horas de trabalho a pessoa2 trabalhou este mes: "));
		
		float preco_hora_pessoa1 = new Float(JOptionPane.showInputDialog("quanto a pessoa1 ganha por Hora: "));
		float preco_hora_pessoa2 = new Float(JOptionPane.showInputDialog("quanto a pessoa2 ganha por Hora: "));
		
		float salario_pessoa1 = preco_hora_pessoa1 * horas_Trabalho_pessoa_1;
		float salario_pessoa2 = preco_hora_pessoa2 * horas_Trabalho_pessoa_2;
		
		if (salario_pessoa1 > salario_pessoa2){
			JOptionPane.showMessageDialog(null, "a pessoa2 que trabalhou " + horas_Trabalho_pessoa_2 + "h, tem o menor salario, e ganhou " + salario_pessoa2 + "R$");
		}else if (salario_pessoa1 < salario_pessoa2){
			JOptionPane.showMessageDialog(null, "a pessoa1 que trabalhou " + horas_Trabalho_pessoa_1 + "h, tem o menor salario, e ganhou " + salario_pessoa1 + "R$");
		}else if (salario_pessoa1 == salario_pessoa2) {
			JOptionPane.showMessageDialog(null, "Os trabalhadores ganha a mesma coisa " + salario_pessoa1 + "R$  " + salario_pessoa2 + "R$  ");
		}

		

		

			
	}

}
