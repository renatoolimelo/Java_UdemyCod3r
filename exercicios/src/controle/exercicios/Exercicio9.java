package controle.exercicios;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {

		String numeroDigitado;
		double numero;
		double maior = 0;

		for (int i = 0; i < 10; i++) {
			numeroDigitado = JOptionPane.showInputDialog("Digite o n�mero " + (i + 1));

			try {
				numero = Double.parseDouble(numeroDigitado);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "N�mero inv�lido: " + ex.getMessage());
				i--;
				continue;
			}

			if (i == 0) {
				maior = numero;
			} else if (maior < numero) {
				maior = numero;
			}

		}
		JOptionPane.showMessageDialog(null, "O maior n�mero � " + maior);
	}
}
