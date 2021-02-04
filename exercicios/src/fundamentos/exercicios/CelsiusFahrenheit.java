package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusFahrenheit {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double temperaturaCelsius;
		double temperaturaFahrenheit;

		temperaturaCelsius = CelsiusFahrenheitMetodos.informaTemperaturaCelsius(entrada);
		temperaturaFahrenheit = CelsiusFahrenheitMetodos.calculaFahrenheit(entrada, temperaturaCelsius);
		
		System.out.printf("A temperatura %.2f°C é a mesma que %.2fºF.", temperaturaCelsius, temperaturaFahrenheit);		
		
		entrada.close();
		
	}

}
