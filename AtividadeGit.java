package git;

import javax.swing.JOptionPane;

public class AtividadeGit {
	
	
	public static void main(String[] args) {
		
		
		int escolha = 0;
		Double num1 = 0.0;
		Double num2 = 0.0;
		Double resultado = 0.0; 
		
		StringBuffer numero1 = new StringBuffer();
		StringBuffer numero2 = new StringBuffer();
		StringBuffer escolhaOperacao = new StringBuffer();
		
		numero1.append("Calculadora de Soma e Subtra��o");
		numero1.append("\n");
		numero1.append("Digite a primeiro n�mero");
	
		numero2.append("Calculadora de Soma e Subtra��o");
		numero2.append("\n");
		numero2.append("Digite o segundo n�mero");
		
		escolhaOperacao.append("Digite o n�mero que corresponde a opera��o que voc� deseja realizar");
		escolhaOperacao.append("\n\n");
		escolhaOperacao.append("01 - Soma");
		escolhaOperacao.append("\n");
		escolhaOperacao.append("02 - Subtra��o");
	
		num1 = jopDou(numero1.toString());
		num2 = jopDou(numero2.toString());
		
		escolha = jopInt(escolhaOperacao.toString());
		
		
		if (escolha == 1) {
			
		resultado = num1 + num2;
		
		JOptionPane.showMessageDialog(null, num1+" + "+num2+" = "+resultado);
			
		} else {
			
			//Fazer o calculo da substra��o
			resultado = num1 - num2;
			JOptionPane.showMessageDialog(null, num1+" - "+num2+" = "+resultado);
			

		}

		
		}
	
	public static Integer jopInt(String mensagem) {
		
		Integer numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
		return numero;
	}
	
	public static Double jopDou(String mensagem) {
		
		Double numero = 0.0;
		numero = Double.parseDouble(JOptionPane.showInputDialog(mensagem));
		return numero;
	}
	
}