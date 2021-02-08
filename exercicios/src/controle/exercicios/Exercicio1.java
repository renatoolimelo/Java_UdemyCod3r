package controle.exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		String informaNumero = JOptionPane.showInputDialog("Informe o n�mero:");
		int numero;
		boolean numeroValido;
		boolean numeroPar;

		try {
			numero = Integer.parseInt(informaNumero);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "N�mero inv�lido: " + ex.getMessage());
			numero = -1;
		}

		numeroValido = Exercicio1Metodos.validaNumero(numero);
		numeroPar = Exercicio1Metodos.validaPar(numero);

		if (numeroValido && numeroPar) {
			JOptionPane.showMessageDialog(null, "O n�mero � par e est� entre 0 e 10!");
		} else if (!numeroValido && numeroPar) {
			JOptionPane.showMessageDialog(null, "N�mero n�o � valido mesmo sendo par!");
		} else if (numeroValido && !numeroPar) {
			JOptionPane.showMessageDialog(null, "N�mero � valido por�m n�o � par!");
		} else {
			JOptionPane.showMessageDialog(null, "N�mero n�o valido � n�o � par!");
		}
	}
}
