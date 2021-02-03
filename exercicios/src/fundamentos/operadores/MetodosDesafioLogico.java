package fundamentos.operadores;

import java.util.Scanner;

public class MetodosDesafioLogico {

	public static boolean trabalhou(String trabalhou) {

		if (trabalhou.equals("S")) {
			return true;
		} else if (trabalhou.equals("N")) {
			return false;
		} else {
			System.out.println("Resposta inválida!!\n");
			return false;
		}
	}

	public static boolean pergunta(Scanner entrada, String dia) {

		String trabalhou = "a";
		boolean retornoSeTrabalhou = false;

		while (!trabalhou.equals("S") && !trabalhou.equals("N")) {

			System.out.println("O trabalho de " + dia + " foi um sucesso? S/N\n");
			try {
				trabalhou = entrada.nextLine().toUpperCase();
				retornoSeTrabalhou = MetodosDesafioLogico.trabalhou(trabalhou);
			} catch (Exception ex) {
				System.out.println("Erro: " + ex.getMessage());
			}
		}
		return retornoSeTrabalhou;
	}
	
	public static void resultado(boolean sucesso1, boolean sucesso2) {
		
		if (sucesso1 && sucesso2) {
			System.out.println("Saíram para comprar a TV de 50 polegadas");
			System.out.println("E tomaram sorvete no shopping");
		} else if (sucesso1 ^ sucesso2) {
			System.out.println("Saíram para comprar a TV de 32 polegadas");
			System.out.println("E tomaram sorvete no shopping");
		} else {
			System.out.println("Ficaram o dia em casa e não compraram nenhuma TV.");
		}
	}

}
