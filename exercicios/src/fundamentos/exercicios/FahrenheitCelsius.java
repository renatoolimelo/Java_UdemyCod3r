package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitCelsius {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double temperaturaCelsius;
		double temperaturaFahrenheit;

		temperaturaFahrenheit = FahrenheitCelsiusMetodos.informaTemperaturaFahrenheit(entrada);
		temperaturaCelsius = FahrenheitCelsiusMetodos.calculaCelsius(entrada, temperaturaFahrenheit);
		
		System.out.printf("A temperatura %.2f�F � a mesma que %.2f�C.", temperaturaFahrenheit, temperaturaCelsius);		
		
		entrada.close();
		
	}

}
