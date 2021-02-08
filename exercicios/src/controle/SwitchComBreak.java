package controle;

import javax.swing.JOptionPane;

public class SwitchComBreak {

	public static void main(String[] args) {

		String notaTexto = JOptionPane.showInputDialog("Informe a nota:");
		int nota;

		try {
			nota = Integer.parseInt(notaTexto);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Nota inválida: " + ex.getMessage());
			nota = -1;
		}

		switch (nota) {
		case 10:
		case 9:
			JOptionPane.showMessageDialog(null, "Conceito A");
			break;
		case 8:
		case 7:
			JOptionPane.showMessageDialog(null, "Conceito B");
			break;
		case 6:
		case 5:
			JOptionPane.showMessageDialog(null, "Conceito C");
			break;
		case 4:
		case 3:
			JOptionPane.showMessageDialog(null, "Conceito D");
			break;
		case 2:
		case 1:
		case 0:
			JOptionPane.showMessageDialog(null, "Conceito E");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Apenas notas de 0 a 10");
			break;
		}

	}

}
