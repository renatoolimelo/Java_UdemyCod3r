package controle.exercicios;

import javax.swing.JOptionPane;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Informe a palavra:").trim();
		
		for(int i = 0; i < palavra.length(); i++) {
			JOptionPane.showMessageDialog(null, palavra.substring(i, i+1));
		}
		
	}

}
