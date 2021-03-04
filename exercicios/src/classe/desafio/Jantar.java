package classe.desafio;

import javax.swing.JOptionPane;

public class Jantar {

	public static void main(String[] args) {

		Comida c1 = new Comida("Arroz", 0.256);
		Comida c2 = new Comida("Feijao", 0.4);

		Pessoa p1 = new Pessoa("Renato", 100.1);

		p1.comer(c1);
		JOptionPane.showMessageDialog(null, p1.toString());
		p1.comer(c2);
		JOptionPane.showMessageDialog(null, p1.toString());

	}

}
