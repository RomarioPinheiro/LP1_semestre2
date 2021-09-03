package decoraSala;

public class Sala {

	public static void main(String[] args) {
		Parede par = new Parede();
		Sofa sof = new Sofa();
		Quadro quad = new Quadro();
		
		par.setAltura(2.5);
		par.setLargura(4.0);
		par.setCor("Cinza");
		
		sof.setAltura(1.2);
		sof.setLargura(0.8);
		sof.setComprimento(2.0);
		sof.setBraco(true);
		sof.setCor("bege");
		sof.setQtdAssentos(3);
		
		quad.setAltura(0.8);
		quad.setLargura(0.8);
		quad.setMoldura("madeira");
		quad.setCorMoldura("Dourado");
		
		System.out.println("A sala montada possui parede "+par.getCor()+" de área "+par.area()+"m²"+
                           " e nesta parede estão posicionados um sofá de cor "+sof.getCor()+ " e encosto de área "+
							sof.areaEncosto()+"m²"+" que possui "+sof.getQtdAssentos()+" assentos "+
                           "e dois quadros deorativos de área "+quad.area()+"m²"+" com moldura de "+quad.getMoldura()+" na cor "+
							quad.getCorMoldura()+".");
		

	}

}
