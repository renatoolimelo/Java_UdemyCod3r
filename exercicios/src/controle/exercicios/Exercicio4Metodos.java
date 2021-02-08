package controle.exercicios;

import javax.swing.JOptionPane;

public abstract class Exercicio4Metodos {

	public static long converteNumero(String numeroDigitado) {

		long numero;

		try {
			numero = Long.parseLong(numeroDigitado);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Número inválido: " + ex.getMessage());
			numero = 0;
		}
		return numero;
	}

	public static boolean verificaPrimo(long numero) {

		if (numero == 1) {
			return true;
		}

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
