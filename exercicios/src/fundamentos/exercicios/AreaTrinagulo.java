package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTrinagulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double altura;
		double base;
		double area;
		
		altura = AreaTrinaguloMetodos.informacoes(entrada, "altura");
		base = AreaTrinaguloMetodos.informacoes(entrada, "base");
		area = AreaTrinaguloMetodos.calcula(base, altura);
		
		System.out.println("A área do triângulo é de " + area);
		
	}

}
