
public class Professor {
	String nome;
	String id;
	String areaFormacao;
	
	
	@Override
	public String toString() {
		return nome + ", id=" + id + ", �rea=" + areaFormacao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getAreaFormacao() {
		return areaFormacao;
	}


	public void setAreaFormacao(String areaFormacao) {
		this.areaFormacao = areaFormacao;
	}


	public Professor(String nome, String id, String areaFormacao) {
		super();
		this.nome = nome;
		this.id = id;
		this.areaFormacao = areaFormacao;
	}

}
