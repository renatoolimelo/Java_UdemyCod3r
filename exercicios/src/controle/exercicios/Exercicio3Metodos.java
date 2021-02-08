package controle.exercicios;

import javax.swing.JOptionPane;

public abstract class Exercicio3Metodos {

	public static double converteString(String notaDigitada) {

		double nota;

		try {
			nota = Double.parseDouble(notaDigitada);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Nota inválida: " + ex.getMessage());
			nota = -1;
		}
		return nota;
	}

	public static void status(double nota) {

		if (nota >= 7.0 && nota <= 10.0) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		} else if (nota >= 4.0 && nota < 7.0) {
			JOptionPane.showMessageDialog(null, "Recuperação");
		} else if (nota >= 0.0 && nota < 4.0) {
			JOptionPane.showMessageDialog(null, "Reprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Informar nota entre 0 e 10");
		}

	}
}
