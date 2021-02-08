package controle.exercicios;

import javax.swing.JOptionPane;

public abstract class Exercicio7Metodos {

	public static double verificaNumeroDigitado(String numeroDigitado) {

		double numero;

		try {
			numero = Double.parseDouble(numeroDigitado);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Número inválido");
			return -1;
		}
		return numero;
	}

}
