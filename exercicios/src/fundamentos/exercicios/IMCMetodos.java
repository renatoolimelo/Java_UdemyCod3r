package fundamentos.exercicios;

import java.util.Scanner;

public abstract class IMCMetodos {

	public static double informa(Scanner entrada, String informacao) {

		double peso;

		try {
			System.out.print(informacao + " : ");
			peso = entrada.nextDouble();
		} catch (Exception ex) {
			System.out.println(informacao + " inválido: " + ex.getMessage());
			entrada.nextLine();
			peso = IMCMetodos.informa(entrada, informacao);
		}
		return peso;
	}

	public static double calculaIMC(double peso, double altura) {

		double imc;

		imc = peso / Math.pow(altura, 2);

		return imc;

	}

}
