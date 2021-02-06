package controle;

import javax.swing.JOptionPane;

public class IfElseIf {

	public static void main(String[] args) {

		double nota;

		try {
			String message = JOptionPane.showInputDialog("Digite a nota");
			nota = Double.parseDouble(message);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			nota = -1;
		}

		if (nota > 10 || nota < 0) {
			System.out.println("Nota inválida!");
		} else if (nota >= 8.1) {
			System.out.println("Conceito A");
		} else if (nota >= 6.1) {
			System.out.println("Conceito B");
		} else if (nota >= 4.1) {
			System.out.println("Conceito C");
		} else if (nota >= 2.1) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito E");
		}

	}

}
