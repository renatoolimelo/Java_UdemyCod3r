package classe;

public class ValorNulo {

	public static void main(String[] args) {

		String s1 = "";
		System.out.println(s1.concat("!!!!"));

//		Erro null pointer
		String s2 = Math.random() > 0.5 ? "teste" : null;
		if (s2 != null) {
			System.out.println(s2.concat("?????"));
		}

//		Erro null pointer
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		if (d1 != null) {
			d1.setMes(3);
			System.out.println(d1.getMes());
		}

	}

}
