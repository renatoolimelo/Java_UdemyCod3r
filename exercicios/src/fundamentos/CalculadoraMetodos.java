package fundamentos;

import java.util.Scanner;

public abstract class CalculadoraMetodos {

	public static double escolherNumero(Scanner entrada, int posicao) {

		double numero;

		try {
			System.out.printf("Favor escolher o numero %d.: ", posicao);
			numero = entrada.nextDouble();
		} catch (Exception ex) {
			System.out.println("Número inválido!!");
			System.out.println("Erro: " + ex.getMessage());
			entrada.nextLine();
			numero = escolherNumero(entrada, posicao);
		}
		return numero;
	}

	public static String escolherOperador(Scanner entrada) {

		String operador = "a";

		while (verificaOperador(operador)) {
			try {
				System.out.print("Escolha um operador válido: ");
				operador = entrada.nextLine();
			} catch (Exception ex) {
				System.out.println("Erro: " + ex.getMessage());
			}
		}

		return operador;
	}

	private static boolean verificaOperador(String operador) {

		if (operador.equals("+")) {
			return false;
		}

		if (operador.equals("-")) {
			return false;
		}

		if (operador.equals("*")) {
			return false;
		}

		if (operador.equals("/")) {
			return false;
		}

		if (operador.equals("%")) {
			return false;
		}

		return true;

	}

	public static double calculo(String operador, double primeiroNumero, double segundoNumero) {

		double resultado;

		switch (operador) {
		case "+":
			resultado = primeiroNumero + segundoNumero;
			return resultado;
		case "-":
			resultado = primeiroNumero - segundoNumero;
			return resultado;
		case "*":
			resultado = primeiroNumero * segundoNumero;
			return resultado;
		case "/":
			resultado = primeiroNumero / segundoNumero;
			return resultado;
		case "%":
			resultado = primeiroNumero % segundoNumero;
			return resultado;
		default:
			System.out.println("Erro na operação!");
			return 0;

		}

	}

}
