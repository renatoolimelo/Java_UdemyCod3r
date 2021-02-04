package fundamentos;

import java.util.Scanner;

public class CalculadoraMenu {

	public static void main(String[] args) {

		double primeiroNumero;
		double segundoNumero;
		String operador;
		double resultado;

		Scanner entrada = new Scanner(System.in);

		primeiroNumero = CalculadoraMetodos.escolherNumero(entrada, 1);
		entrada.nextLine();
		segundoNumero = CalculadoraMetodos.escolherNumero(entrada, 2);
		entrada.nextLine();
		operador = CalculadoraMetodos.escolherOperador(entrada);

		resultado = CalculadoraMetodos.calculo(operador, primeiroNumero, segundoNumero);

		System.out.println("Resultado da operação: " + resultado);

		entrada.close();
	}

}
