package aula_6;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 03/04/2015
 */
public class EX0403 {
	
	//calcula o IMC
	public float calcula_IMC(float peso, float altura) {
		
		float IMC = peso / (altura * altura);
		
		return IMC;
		
		
	}
	
	//categoria do IMC
	public float categoria(float reultado_IMC) {
		
		if (reultado_IMC <16 ) {
			JOptionPane.showMessageDialog(null, " Com massa corporal de: " + reultado_IMC + "m2, " + " Sua classificacao é Magreza Grave");
			
		}else if (reultado_IMC >16 && reultado_IMC <17) {
			JOptionPane.showMessageDialog(null, "  Com massa corporal de: " + reultado_IMC + "m2, " + " Sua classificacao é Magreza Moderada");
			
		}else if (reultado_IMC >17 && reultado_IMC <18.5) {
			JOptionPane.showMessageDialog(null, " Com massa corporal de: " + reultado_IMC + "m2, " + " Sua classificacao é Magreza Leve");

		}else if (reultado_IMC >18.5 && reultado_IMC <25) {
			JOptionPane.showMessageDialog(null, " Com massa corporal de: " + reultado_IMC + "m2, " + " Sua classificacao é Saudavel");

		}else if (reultado_IMC >25 && reultado_IMC <30) {
			JOptionPane.showMessageDialog(null, " Com massa corporal de: " + reultado_IMC + "m2, " + " Sua classificacao é Sobrepeso");

		}else if (reultado_IMC >30 && reultado_IMC <35) {
			JOptionPane.showMessageDialog(null, " Com massa corporal de: " + reultado_IMC + "m2, " + " Sua classificacao é Obesidade Grau 1");

		}else if (reultado_IMC > 35 && reultado_IMC <40) {
			JOptionPane.showMessageDialog(null, " Com massa corporal de: " + reultado_IMC + "m2, " + " Sua classificacao é Obesidade Grau 2 (severa)");

		}else if (reultado_IMC >= 40) {
			JOptionPane.showMessageDialog(null, " Com massa corporal de: " + reultado_IMC + "m2, " + " Sua classificacao é Obesiddade Grau 3 (Morbida)");
		}
		return reultado_IMC;
		
	}
	
	
	
	
	public static void main(String[] args) {
		EX0403 Calculo_IMC = new EX0403();
		float reultado_IMC;
		
		float peso = new Float(JOptionPane.showInputDialog("Qual seu peso: "));
		float altura = new Float(JOptionPane.showInputDialog("Qual sua altura"));
		
		reultado_IMC = Calculo_IMC.calcula_IMC(peso,altura);
		JOptionPane.showMessageDialog(null, "Seu indice de massa corporal é: " + reultado_IMC);
		
		
		Calculo_IMC.categoria(reultado_IMC);
		
		
	}

}
