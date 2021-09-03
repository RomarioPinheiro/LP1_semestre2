package decoraSala;

public class Parede {
	private double altura;
	private double largura;
	private String cor;
	

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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double area() {
		double area;
		area = altura * largura;
		return area;
	}
	
	
	
}
