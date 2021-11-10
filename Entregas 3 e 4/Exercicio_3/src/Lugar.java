
public class Lugar {
	String nome;
	String endereco;
	String drescricao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDrescricao() {
		return drescricao;
	}
	public void setDrescricao(String drescricao) {
		this.drescricao = drescricao;
	}
	public Lugar(String nome, String endereco, String drescricao) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.drescricao = drescricao;
	}
	@Override
	public String toString() {
		return "Destino: " + nome + ", endereco= " + endereco + ", drescricao= " + drescricao;
	}

}
