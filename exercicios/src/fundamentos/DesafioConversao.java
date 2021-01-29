package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu �ltimo sal�rio: ");
		String ultimoSal = entrada.nextLine();
				
		System.out.print("Informe seu pen�ltimo sal�rio: ");
		String penultimoSal = entrada.nextLine();		
		
		System.out.print("Informe seu antepen�ltimo sal�rio: ");
		String antepenultimoSal = entrada.nextLine();
		
		ultimoSal = ultimoSal.replace(",", ".");
		penultimoSal = penultimoSal.replace(",", ".");
		antepenultimoSal = antepenultimoSal.replace(",", ".");
		
		double ultimoSalario = Double.parseDouble(ultimoSal);
		double penultimoSalario = Double.parseDouble(penultimoSal);
		double antepenultimoSalario = Double.parseDouble(antepenultimoSal);
		
		double media = (ultimoSalario + penultimoSalario + antepenultimoSalario) / 3;
		
		System.out.printf("A m�dia dos tr�s �ltimos sal�rios � de R$%.2f.", media);		
		
		entrada.close();
		
	}

}
