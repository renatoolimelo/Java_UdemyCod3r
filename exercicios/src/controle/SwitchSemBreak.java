package controle;

import javax.swing.JOptionPane;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = JOptionPane.showInputDialog(null, "Informe a cor da sua faixa: ");

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
		}

		String textoIdade = JOptionPane.showInputDialog(null, "Informe a idade:");
		int idade;

		try {
			idade = Integer.parseInt(textoIdade);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
			idade = 0;
		}
		
		switch (idade) {
		case 3:
			JOptionPane.showMessageDialog(null, "Sabe falar");
		case 2:
			JOptionPane.showMessageDialog(null, "Sabe andar");
		case 1:
			JOptionPane.showMessageDialog(null, "Sabe respirar");
		}

	}

}
