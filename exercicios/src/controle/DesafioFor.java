package controle;

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";
		for (;;) {
			System.out.println(valor);
			valor += "#";
			if (valor.equalsIgnoreCase("######")) {
				break;
			}
		}
		
		System.out.println();
		
		for(String v = "#"; !v.equals("######"); v+="#") {
			System.out.println(v);
		}
	}
}
