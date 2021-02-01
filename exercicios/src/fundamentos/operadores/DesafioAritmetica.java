package fundamentos.operadores;

public class DesafioAritmetica {

	public static void main(String[] args) {

		int numA = (int) Math.pow(6 * (3 + 2), 2);
		int denA = 3 * 2;
		int superiorA = numA / denA;

		System.out.println(superiorA);

		int numB = (1 - 5) * (2 - 7);
		int denB = 2;
		int superiorB = (int) Math.pow((numB/denB),2);

		System.out.println(superiorB);
		
		int superior = (int) Math.pow((superiorA - superiorB),3);
		int inferior = (int) Math.pow(10, 3);
		int resultado = superior / inferior;
		
		System.out.println(resultado);

	}

}
