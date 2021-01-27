package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		final int ajuste = 32;
		final double fatorFahrenheit = 5.0 / 9;
		final double fatorCelsius = 9.0 / 5;
		double temperaturaFahrenheit;
		double temperaturaCelsius;
		int opcao = -1;

		Scanner entrada = new java.util.Scanner(System.in);

		while (opcao != 0) {

			System.out.println("Escolha a op��o: ");
			System.out.println("1 - Convers�o para Celsius");
			System.out.println("2 - Convers�o para Fahrenheit");
			System.out.println("0 - Finalizar o programa");

			try {
				opcao = entrada.nextInt();
			} catch (Exception ex) {
				System.out.println("Erro: " + ex.getMessage());
				entrada.nextLine();
			}

			switch (opcao) {

			case 0:
				System.out.println("Fim do programa!!!");
				break;

			case 1:
				System.out.print("Temperatura Fahrenheit para convers�o em Celsius: ");

				try {
					temperaturaFahrenheit = entrada.nextDouble();
					temperaturaCelsius = (temperaturaFahrenheit - ajuste) * fatorFahrenheit;
					System.out.println("Temperatura em Celsius e " + temperaturaCelsius + "�C");
				} catch (Exception ex) {
					System.out.println("Erro: " + ex.getMessage());
					entrada.nextLine();
				} finally {
					opcao = -1;
				}

				break;

			case 2:
				System.out.print("Temperatura Fahrenheit para convers�o em Celsius: ");

				try {
					temperaturaCelsius = entrada.nextDouble();
					temperaturaFahrenheit = (temperaturaCelsius * fatorCelsius) + ajuste;
					System.out.println("Temperatura em Fahrenheit e " + temperaturaFahrenheit + "�F");
				} catch (Exception ex) {
					System.out.println("Erro: " + ex.getMessage());
				} finally {
					opcao = -1;
				}

				break;
			default:
				System.out.println("Op��o Inv�lida!!!");
				opcao = -1;
			}

			System.out.println();

		}

		entrada.close();

	}

}
