package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String trabalhoDeTerca = "a";
		boolean tercaSucesso = false;
		String trabalhoDeQuinta = "a";
		boolean quintaSucesso = false;

		while (!trabalhoDeTerca.equals("S") && !trabalhoDeTerca.equals("N")) {

			System.out.println("O trabalho de terça foi um sucesso? S/N\n");
			try {
				trabalhoDeTerca = entrada.nextLine().toUpperCase();
				tercaSucesso = DesafiosLogicos2.trabalho(trabalhoDeTerca);
			} catch (Exception ex) {
				System.out.println("Erro: " + ex.getMessage());
			}
		}

		while (!trabalhoDeQuinta.equals("S") && !trabalhoDeQuinta.equals("N")) {

			System.out.println("O trabalho de quinta foi um sucesso? S/N\n");
			try {
				trabalhoDeQuinta = entrada.nextLine().toUpperCase();
				quintaSucesso = DesafiosLogicos2.trabalho(trabalhoDeQuinta);		
			} catch (Exception ex) {
				System.out.println("Erro: " + ex.getMessage());
			}
		}

		if (tercaSucesso && quintaSucesso) {
			System.out.println("Saíram para comprar a TV de 50 polegadas");
			System.out.println("E tomaram sorvete no shopping");
		} else if (!tercaSucesso && quintaSucesso) {
			System.out.println("Saíram para comprar a TV de 32 polegadas");
			System.out.println("E tomaram sorvete no shopping");
		} else if (tercaSucesso && !quintaSucesso) {
			System.out.println("Saíram para comprar a TV de 32 polegadas");
			System.out.println("E tomaram sorvete no shopping");
		} else {
			System.out.println("Ficaram o dia em casa e não compraram nenhuma TV.");
		}

		entrada.close();

	}

}
