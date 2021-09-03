package decoraSala;

public class Sofa {
	//Atributos
	private double comprimento;
	private double largura;
	private double altura;
	private int qtdAssentos;
	private String cor;
	private boolean braco;
	
	
	//Getters e setters
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getQtdAssentos() {
		return qtdAssentos;
	}
	public void setQtdAssentos(int qtdAssentos) {
		this.qtdAssentos = qtdAssentos;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isBraco() {
		return braco;
	}
	public void setBraco(boolean braco) {
		this.braco = braco;
	}
	
	//Metodos
	double areaBase() {
		double area_base;
		area_base = comprimento * largura;
		return area_base;
	}
	double areaEncosto() {
		double area_encosto;
		area_encosto = comprimento * altura;
		return area_encosto;
	}
}
