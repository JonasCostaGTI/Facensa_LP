package aula_5;

import javax.swing.JOptionPane;

public class C010 {

	public static void main(String[] args) {
		float nota_grau_1 = new Float(JOptionPane.showInputDialog("qual a nota de grau_1 do aluno: "));
		float nota_grau_2 = new Float(JOptionPane.showInputDialog("qual a nota de grau_2 do aluno: "));

		float media = ((nota_grau_1 + nota_grau_2) /2 );
		
		if(media >= 7){
			JOptionPane.showMessageDialog(null, "Aluno aprovado. Media final de: " + media);
		}else{
			JOptionPane.showMessageDialog(null, "Aluno reprovado. Media final de: " + media);
		}
		
		
	}

}
