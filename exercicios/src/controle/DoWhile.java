package controle;

import javax.swing.JOptionPane;

public class DoWhile {

	public static void main(String[] args) {

		String texto = "";

		do {
			JOptionPane.showMessageDialog(null, "Você precisa falar as palavras mágicas...");
			texto = JOptionPane.showInputDialog("Quer sair?");
		} while (!texto.equalsIgnoreCase("sim"));
		
	}

}
