package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		final int ajuste = 32;
		final double fator = 5.0 / 9;
		double temperaturaFahrenheit;
		double temperaturaCelsius;

		Scanner entrada = new java.util.Scanner(System.in);

		System.out.print("Temperatura Fahrenheit para convers�o em Celsius: ");
		temperaturaFahrenheit = entrada.nextDouble();

		temperaturaCelsius = (temperaturaFahrenheit - ajuste) * fator;

		System.out.println("Temperatura em Celsius e " + temperaturaCelsius + "�C");
		
		entrada.close();

	}

}
