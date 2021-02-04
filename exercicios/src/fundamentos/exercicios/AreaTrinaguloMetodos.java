package fundamentos.exercicios;

import java.util.Scanner;

public abstract class AreaTrinaguloMetodos {

	public static double informacoes(Scanner entrada, String atributo) {

		double valor;

		try {
			System.out.printf("Valor da %s: ", atributo);
			valor = entrada.nextDouble();
		} catch (Exception ex) {
			System.out.println("Número inválido: " + ex.getMessage());
			entrada.nextLine();
			valor = AreaTrinaguloMetodos.informacoes(entrada, atributo);
		}
		return valor;
	}

	public static double calcula(double base, double altura) {

		double resultado;

		resultado = (base * altura) / 2;

		return resultado;

	}

}
