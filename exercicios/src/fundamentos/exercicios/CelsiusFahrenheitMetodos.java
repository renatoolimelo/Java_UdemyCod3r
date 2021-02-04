package fundamentos.exercicios;

import java.util.Scanner;

public abstract class CelsiusFahrenheitMetodos {

	public static double informaTemperaturaCelsius(Scanner entrada) {

		double celsius;

		try {
			System.out.print("Informe a temperatura correta: ");
			celsius = entrada.nextDouble();
		} catch (Exception ex) {
			System.out.println("Tempreratura inválida: " + ex.getMessage() + ".\n");
			entrada.nextLine();
			celsius = informaTemperaturaCelsius(entrada);
		}
		return celsius;
	}
	
	public static double calculaFahrenheit(Scanner entrada, double celsius) {
		
		double multiplo = 1.8;
		int soma = 32;
		double fahrenheit;
		
		fahrenheit = (celsius * multiplo) + soma;
		
		return fahrenheit;
		
	}

}
