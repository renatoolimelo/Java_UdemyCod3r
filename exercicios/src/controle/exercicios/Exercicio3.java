package controle.exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		String notaDigitada = JOptionPane.showInputDialog("Informe a nota do aluno:");
		double nota;

		nota = Exercicio3Metodos.converteString(notaDigitada);
		Exercicio3Metodos.status(nota);

	}

}
