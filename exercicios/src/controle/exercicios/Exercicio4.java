package controle.exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		String numeroDigitado = JOptionPane.showInputDialog("Informe o número:").trim();
		long numero;
		boolean numeroPrimo;

		numero = Exercicio4Metodos.converteNumero(numeroDigitado);

		if (numero <= 0) {
			JOptionPane.showMessageDialog(null, "Número inválido:");
		} else {
			numeroPrimo = Exercicio4Metodos.verificaPrimo(numero);

			if (numeroPrimo) {
				JOptionPane.showMessageDialog(null, "O número " + numero + " é primo");
			} else {
				JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo");
			}
		}
	}
}
