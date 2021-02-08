package controle.exercicios;

import javax.swing.JOptionPane;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		String numeroDigitado;
		double numero;
		double soma = 0;
		boolean repetir = true;
		
		
		do {
			numeroDigitado = JOptionPane.showInputDialog("Informe o numero");
			
			numero = Exercicio7Metodos.verificaNumeroDigitado(numeroDigitado);
			
			if (numero >= 0) {
				soma += numero;
			} else {
				JOptionPane.showMessageDialog(null, "O total foi de " + soma);
				repetir = false;
			}
		} while (repetir);
			
	JOptionPane.showMessageDialog(null, "Fim do programa");
			
	}

}
