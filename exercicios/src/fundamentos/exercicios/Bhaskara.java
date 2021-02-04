package fundamentos.exercicios;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double a;
		double b;
		double c;
		double resultado1;
		double resultado2;
		
		a = BhaskaraMetodos.numero(entrada, "A");
		
		if (a != 0) {
		
			b = BhaskaraMetodos.numero(entrada, "B");
			c = BhaskaraMetodos.numero(entrada, "C");
			
			resultado1 = BhaskaraMetodos.calculaA(a, b, c);
			resultado2 = BhaskaraMetodos.calculaB(a, b, c);
			
			System.out.printf("O resultado é %.2f e %.2f.", resultado1, resultado2);
			
		} else {
			System.out.println("Não é possível calcular com o valor de A = 0 - Erro divisão por zero");			
		}
		
		
	}

}
