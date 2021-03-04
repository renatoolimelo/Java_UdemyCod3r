package classe.desafio;

public class Pessoa {

	private String nome;
	private double peso;
	private double pesoFinal;

	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
		this.pesoFinal = peso;
	}

	public void comer(Comida comida) {
		this.pesoFinal += comida.getPeso();
	}
	
	@Override
	public String toString() {
		return "O peso de " + nome + " passou de " + peso + " para " + pesoFinal;
	}

}
