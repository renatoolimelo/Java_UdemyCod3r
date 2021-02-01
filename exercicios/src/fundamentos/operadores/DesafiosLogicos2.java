package fundamentos.operadores;

public class DesafiosLogicos2 {

	public static boolean trabalho(String diaDoTrabalho) {

		if (diaDoTrabalho.equals("S")) {
			return true;
		} else if (diaDoTrabalho.equals("N")) {
			return false;
		} else {
			System.out.println("Resposta inválida!!\n");
			return false;
		}

	}

}
