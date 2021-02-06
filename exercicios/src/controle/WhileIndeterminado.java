package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class WhileIndeterminado {

	public static void main(String[] args) {

		//Scanner entrada = new Scanner(System.in);

		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			//System.out.print("Você diz: ");
			//valor = entrada.nextLine();
			valor = JOptionPane.showInputDialog("Você diz: ");
		}
		
		//entrada.close();
	}

}
