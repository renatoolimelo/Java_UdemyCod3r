package fundamentos.exercicios;

import java.util.Scanner;

public abstract class BhaskaraMetodos {

	public static double numero(Scanner entrada, String posicao) {

		double valor;

		try {
			System.out.print("Informe o valor de " + posicao + ": ");
			valor = entrada.nextDouble();
		} catch (Exception ex) {
			System.out.println("Valor inválido: " + ex.getMessage());
			entrada.nextLine();
			valor = BhaskaraMetodos.numero(entrada, posicao);
		}
		return valor;
	}

	private static double delta(double a, double b, double c) {

		double valor;

		try {
			valor = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
		} catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
			valor = -1;
		}
		return valor;
	}

	public static double calculaA(double a, double b, double c) {

		double resultado;
		double delta;

		delta = BhaskaraMetodos.delta(a, b, c);

		if (delta < 0) {
			System.out.println("Não é possível realizar o calculo!");
			return -999.9;
		} else {
			try {
				resultado = (-b + delta) / (2 * a);
				return resultado;
			} catch (Exception ex) {
				System.out.println("Erro: " + ex.getMessage());
				return -999.9;
			}

		}

	}
	
	public static double calculaB(double a, double b, double c) {

		double resultado;
		double delta;

		delta = BhaskaraMetodos.delta(a, b, c);

		if (delta < 0) {
			System.out.println("Não é possível realizar o calculo!");
			return -999.9;
		} else {
			try {
				resultado = (-b - delta) / (2 * a);
				return resultado;
			} catch (Exception ex) {
				System.out.println("Erro: " + ex.getMessage());
				return -999.9;
			}

		}

	}

}
