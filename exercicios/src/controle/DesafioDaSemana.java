package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioDaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String diaDaSemana;

		try {
			//System.out.print("Informe o dia da semana: ");
			//diaDaSemana = entrada.nextLine().toUpperCase();
			diaDaSemana = JOptionPane.showInputDialog("Informe o dia da semana:").toUpperCase();
		} catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
			diaDaSemana = "0";
		}

		switch (diaDaSemana) {
		case "DOMINGO":
			System.out.println("1");
			break;
		case "SEGUNDA":
			System.out.println("2");
			break;
		case "TERÇA":
			System.out.println("3");
			break;
		case "QUARTA":
			System.out.println("4");
			break;
		case "QUINTA":
			System.out.println("5");
			break;
		case "SEXTA":
			System.out.println("6");
			break;
		case "SÁBADO":
			System.out.println("7");
			break;
		case "SABADO":
			System.out.println("7");
			break;
		default:
			System.out.println("Dia inválido!");
			break;
		}
		
		System.out.println("Fim");

		entrada.close();

	}

}
