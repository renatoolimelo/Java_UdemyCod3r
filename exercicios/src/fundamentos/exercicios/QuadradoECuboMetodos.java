package fundamentos.exercicios;

import java.util.Scanner;

public abstract class QuadradoECuboMetodos {

	public static double informaValor(Scanner entrada) {
		
		double valor;
		
		try {
			System.out.print("Valor para cálculo: ");
			valor = entrada.nextDouble();
		} catch (Exception ex) {
			System.out.println("Valor inválido: " + ex.getMessage());
			entrada.nextLine();
			valor = QuadradoECuboMetodos.informaValor(entrada);
		}		
		return valor;		
	}
	
	public static double calcula(double valor, int potencia) {
		
		double resultado;
		
		resultado = Math.pow(valor, potencia);
		
		return resultado;
	}

}
