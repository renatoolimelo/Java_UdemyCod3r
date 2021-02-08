package controle.exercicios;

import java.util.Random;
import javax.swing.JOptionPane;

public abstract class Exercicio6Metodos {

	public static int geraNumeroAleatorio() {

		Random gerador = new Random();

		return gerador.nextInt(100);
	}

	private static int verificaNumeroDigitado(String numeroDigitado) {

		int numero;

		try {
			numero = Integer.parseInt(numeroDigitado);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Número inválido");
			numero = -1;
		}
		return numero;
	}

	public static void jogar(int numeroAleatorio, int creditos) {

		String numeroDigitado;
		int numero;
		int tentativa;

		for (tentativa = creditos; tentativa > 0; tentativa--) {

			JOptionPane.showMessageDialog(null, "Você tem " + tentativa + " tentativas");

			numeroDigitado = JOptionPane.showInputDialog("Informe o número:");
			numero = verificaNumeroDigitado(numeroDigitado);

			if (numero == -1) {
				continue;
			} else if (numero < numeroAleatorio) {
				JOptionPane.showMessageDialog(null, "O número é maior");
			} else if (numero > numeroAleatorio) {
				JOptionPane.showMessageDialog(null, "O número é menor");
			} else if (numero == numeroAleatorio) {
				JOptionPane.showMessageDialog(null, "Número correto Parabéns");
				break;
			}
		}

		if (tentativa == 0) {
			JOptionPane.showMessageDialog(null, "Você perdeu");
		}
	}

}
