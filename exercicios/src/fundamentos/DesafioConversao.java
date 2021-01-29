package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu último salário: ");
		String ultimoSal = entrada.nextLine();
				
		System.out.print("Informe seu penúltimo salário: ");
		String penultimoSal = entrada.nextLine();		
		
		System.out.print("Informe seu antepenúltimo salário: ");
		String antepenultimoSal = entrada.nextLine();
		
		ultimoSal = ultimoSal.replace(",", ".");
		penultimoSal = penultimoSal.replace(",", ".");
		antepenultimoSal = antepenultimoSal.replace(",", ".");
		
		double ultimoSalario = Double.parseDouble(ultimoSal);
		double penultimoSalario = Double.parseDouble(penultimoSal);
		double antepenultimoSalario = Double.parseDouble(antepenultimoSal);
		
		double media = (ultimoSalario + penultimoSalario + antepenultimoSalario) / 3;
		
		System.out.printf("A média dos três últimos salários é de R$%.2f.", media);		
		
		entrada.close();
		
	}

}
