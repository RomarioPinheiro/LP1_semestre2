import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AgenciaViagens {

	public static void main(String[] args) {
		ArrayList<Lugar> destinos = new ArrayList<>();
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		Map <String, Lugar> mapaViagem = new HashMap();
		Set <String> CPFClientes = new HashSet();
		
		//Adicionar Clientes
		Pessoa p1 = new Pessoa("001.002.003-01", "Ana");
		Pessoa p2 = new Pessoa("004.005.006-02", "Maria");
		Pessoa p3 = new Pessoa("007.008.009-03", "José");
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		Lugar d1 = new Lugar("Praia Grande", "Caraguatatuba", "Praia");
		Lugar d2 = new Lugar("Caverna", "Januária", "Parque estadual");
		Lugar d3 = new Lugar("Pastel do Maluf", "Campus do Jordão", "É do Maluf?");
		
		destinos.add(d1);
		destinos.add(d2);
		destinos.add(d3);		
		
		for (Pessoa pessoa : pessoas) {
			CPFClientes.add(pessoa.getCpf());
		}
		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa pessoa = pessoas.get(i);
			Lugar lugar  = destinos.get(i);
			mapaViagem.put(pessoa.getCpf(), lugar);
			
		}
		
		System.out.println(CPFClientes);
		
		//Retorna os dados do Cliente através do CPF
		String cpf = "004.005.006-02";
		Lugar lugar =(Lugar)mapaViagem.get(cpf);
		System.out.println("CPF: " + cpf + ", " + lugar.toString());

	}

}
