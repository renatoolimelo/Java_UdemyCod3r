package fundamentos.exercicios;

import java.util.Scanner;

public abstract class FahrenheitCelsiusMetodos {

	public static double informaTemperaturaFahrenheit(Scanner entrada) {

		double fahrenheit;

		try {
			System.out.print("Informe a temperatura correta: ");
			fahrenheit = entrada.nextDouble();
		} catch (Exception ex) {
			System.out.println("Tempreratura inválida: " + ex.getMessage() + ".\n");
			entrada.nextLine();
			fahrenheit = informaTemperaturaFahrenheit(entrada);
		}
		return fahrenheit;
	}
	
	public static double calculaCelsius(Scanner entrada, double fahrenheit) {
		
		double multiplica = 5.0/9.0;
		int subtrai = 32;
		double celsius;
		
		celsius = (fahrenheit - subtrai) * multiplica;
		
		return celsius;
		
	}

}
