package aula_8;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * 20/04/2015
 */
public class EX0513 {

	public static void main(String[] args) {
		
		
		String nome = EX0513.Pega_nome();
		float salario_bruto = EX0513.pega_salario_bruto();
		float desconto_INSS = EX0513.calcula_desconto_INSS(salario_bruto);
		int numero_dependentes = EX0513.pega_numero_dependentes();
		float salario_liquido = EX0513.calcula_salario_liquido(salario_bruto,numero_dependentes,desconto_INSS);
		
		JOptionPane.showMessageDialog(null, "O salario do funcionario: " + nome + ", com todos os descontos é: " + salario_liquido);
		
	}

	private static float calcula_salario_liquido(float salario_bruto,int numero_dependentes, float desconto_INSS) {
		float auxilio_passagen = 40;
		float auxilio_refeicao = 100;
		return (salario_bruto-desconto_INSS) + (15 * numero_dependentes) + (auxilio_passagen + auxilio_refeicao);
	}

	private static float calcula_desconto_INSS(float salario_bruto) {
		float desconto = 0;
		if (salario_bruto <=300) {
			float resultado = (float) ((float) salario_bruto * 0.8);
			desconto = salario_bruto - resultado;	
		}else if (salario_bruto > 300 || salario_bruto <=700) {
			float resultado = (float) ((float) salario_bruto * 0.9);
			desconto = salario_bruto - resultado;
		}else if (salario_bruto > 700) {
			float resultado = (float) ((float) salario_bruto * 0.10);
			desconto = salario_bruto - resultado;
		}
		return desconto;
	}

	private static int pega_numero_dependentes() {
		int numero_dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de dependentes: "));
		return numero_dependentes;
	}

	private static float pega_salario_bruto() {
		float salario_bruto = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario bruto: "));
		return salario_bruto;
	}

	private static String Pega_nome() {
		String nome = JOptionPane.showInputDialog("Digite o nome do funcionario: ");
		return nome;
	}

}
