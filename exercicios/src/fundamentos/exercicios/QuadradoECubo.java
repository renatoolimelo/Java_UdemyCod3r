package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoECubo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valor;
		double quadrado;
		double cubo;
		
		valor = QuadradoECuboMetodos.informaValor(entrada);
		quadrado = QuadradoECuboMetodos.calcula(valor, 2);
		cubo = QuadradoECuboMetodos.calcula(valor, 3);
		
		System.out.printf("O valor %.0f ao quadrado é %.0f e ao cubo é %.0f.", valor, quadrado, cubo);
		
		entrada.close();
		
	}

}
