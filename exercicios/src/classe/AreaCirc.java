package classe;

public class AreaCirc {

	private double raio;
	private final static double PI = Math.PI;

	public AreaCirc(double raio) {
		this.raio = raio;
	}

	public double area() {
		return Math.pow(raio, 2) * PI;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}
