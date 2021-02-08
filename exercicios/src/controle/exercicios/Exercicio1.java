package controle.exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		String informaNumero = JOptionPane.showInputDialog("Informe o número:");
		int numero;
		boolean numeroValido;
		boolean numeroPar;

		try {
			numero = Integer.parseInt(informaNumero);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Número inválido: " + ex.getMessage());
			numero = -1;
		}

		numeroValido = Exercicio1Metodos.validaNumero(numero);
		numeroPar = Exercicio1Metodos.validaPar(numero);

		if (numeroValido && numeroPar) {
			JOptionPane.showMessageDialog(null, "O número é par e está entre 0 e 10!");
		} else if (!numeroValido && numeroPar) {
			JOptionPane.showMessageDialog(null, "Número não é valido mesmo sendo par!");
		} else if (numeroValido && !numeroPar) {
			JOptionPane.showMessageDialog(null, "Número é valido porém não é par!");
		} else {
			JOptionPane.showMessageDialog(null, "Número não valido é não é par!");
		}
	}
}
