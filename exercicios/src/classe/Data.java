package classe;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}
	
	
	@Override
	public String toString() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

}
