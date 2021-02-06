package controle;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {

		String message;
		double nota = 0;
		int qtdNotasValidas = 0;
		int qtdNotasInvalidas = 0;
		double soma = 0;
		double media = 0;

		while (nota != -1) {
			try {
				message = JOptionPane.showInputDialog("Informe a nota de 0 a 10:").trim();
				if (message.isEmpty()) {
					continue;
				}
				nota = Double.parseDouble(message);
				if (nota >= 0 && nota <= 10) {
					JOptionPane.showMessageDialog(null, "Nota adicionada com sucesso!");
					qtdNotasValidas++;
					soma += nota;
				} else if (nota == -1) {
					JOptionPane.showMessageDialog(null, "Calculando o resulatdo!");
				} else {
					JOptionPane.showMessageDialog(null, "Nota inválida: " + nota);
					qtdNotasInvalidas++;
				}

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Nota inválida: " + ex.getMessage());
				qtdNotasInvalidas++;
				continue;
			}
		}
		JOptionPane.showMessageDialog(null, "Total de notas inválidas: " + qtdNotasInvalidas);
		JOptionPane.showMessageDialog(null, "Quantidade de notas válidas " + qtdNotasValidas);
		if (qtdNotasValidas == 0) {
			qtdNotasValidas++;
		}
		media = soma / qtdNotasValidas;
		JOptionPane.showMessageDialog(null, "Média das notas: " + media);
	}
}
