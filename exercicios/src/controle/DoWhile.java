package controle;

import javax.swing.JOptionPane;

public class DoWhile {

	public static void main(String[] args) {

		String texto = "";

		do {
			JOptionPane.showMessageDialog(null, "Voc� precisa falar as palavras m�gicas...");
			texto = JOptionPane.showInputDialog("Quer sair?");
		} while (!texto.equalsIgnoreCase("sim"));
		
	}

}
