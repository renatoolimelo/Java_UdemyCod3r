package controle.exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		String numeroDigitado = JOptionPane.showInputDialog("Informe o n�mero:").trim();
		long numero;
		boolean numeroPrimo;

		numero = Exercicio4Metodos.converteNumero(numeroDigitado);

		if (numero <= 0) {
			JOptionPane.showMessageDialog(null, "N�mero inv�lido:");
		} else {
			numeroPrimo = Exercicio4Metodos.verificaPrimo(numero);

			if (numeroPrimo) {
				JOptionPane.showMessageDialog(null, "O n�mero " + numero + " � primo");
			} else {
				JOptionPane.showMessageDialog(null, "O n�mero " + numero + " n�o � primo");
			}
		}
	}
}
