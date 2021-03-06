import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Escola {

	public static void main(String[] args) {
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		ArrayList<Professor> professores = new ArrayList<>();
		ArrayList<Curso> cursos = new ArrayList<>();
		Map <Aluno, Curso> mapaCursoAluno = new HashMap();
		Map <Professor, Curso> mapaCursoProfessor = new HashMap();
		Set <String> RAAlunos = new HashSet();
		
		
		//Adicionar alunos
		Aluno a1 = new Aluno("Andre", "RA-0001");
		Aluno a2 = new Aluno("Filipe", "RA-0002");
		Aluno a3 = new Aluno("Ana", "RA-0003");
		Aluno a4 = new Aluno("Clara", "RA-0004");
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		//Adicionar Professores
		Professor p1 = new Professor("Paulo", "id-001", "Matem?tica");
		Professor p2 = new Professor("Jo?o", "id-002", "Inform?tica");
		
		professores.add(p1);
		professores.add(p2);
		
		//Adicionar Cursos
		Curso c1 = new Curso("Linguagem de Programa??o", "Sala-02", "Inform?tica");
		Curso c2 = new Curso("Simula??o Computacional", "Sala-Virtual(Teams)", "Matem?tica");
		
		cursos.add(c1);
		cursos.add(c2);
		
		mapaCursoAluno.put(a1, c1);
		mapaCursoAluno.put(a2, c1);
		mapaCursoAluno.put(a3, c2);
		mapaCursoAluno.put(a4, c2);
		
		mapaCursoProfessor.put(p1, c2);
		mapaCursoProfessor.put(p2, c1);
		
		System.out.println(mapaCursoProfessor);
		System.out.println(mapaCursoAluno);
		
		Aluno alu = a1;
		Curso curso =(Curso)mapaCursoAluno.get(alu);
		System.out.println(alu.toString()+ ", " + curso.toString());
		
		Professor prof = p1;
		Curso cur =(Curso)mapaCursoProfessor.get(prof);
		System.out.println(prof.toString()+ ", " + cur.toString());
		}

}
