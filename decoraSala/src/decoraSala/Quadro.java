package decoraSala;

public class Quadro {
	//Atributos
	private double altura;
	private double largura;
	private String moldura;
	private String corMoldura;
	
	//Getters e setters
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public String getMoldura() {
		return moldura;
	}

	public void setMoldura(String moldura) {
		this.moldura = moldura;
	}

	public String getCorMoldura() {
		return corMoldura;
	}

	public void setCorMoldura(String corMoldura) {
		this.corMoldura = corMoldura;
	}
	
	
	//Metodo
	public double area() {
		double area;
		area = altura * largura;
		return area;
	}
}
