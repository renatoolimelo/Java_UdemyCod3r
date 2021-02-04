package fundamentos.exercicios;

import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double peso;
		double altura;
		double imc;
		
		peso = IMCMetodos.informa(entrada, "Peso");
		altura = IMCMetodos.informa(entrada, "Altura");
		imc = IMCMetodos.calculaIMC(peso, altura);
		
		System.out.println("Seu IMC é " + imc);
		
	}

}
