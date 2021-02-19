package classe;

public class Produto {

	private String nome;
	private double preco;
	private static double desconto = 0.25;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "O produto " + nome + " está com o preço de " + preco + " e um desconto adicional de "
				+ Math.round(desconto * 100) + "%.";
	}

	public double precoComDesconto() {
		return preco * (1 - desconto);
	}

	public double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}

	public static void setDesconto(double desconto) {
		Produto.desconto = desconto;
	}
	

}
