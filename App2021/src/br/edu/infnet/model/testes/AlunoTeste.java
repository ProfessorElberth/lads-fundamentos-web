package br.edu.infnet.model.testes;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.model.domain.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		//caso0: definicao
		List<Aluno> alunos;
		
		//caso1: criacao
		alunos = new ArrayList<Aluno>();
		
		//caso2: atribuicao
		
		Aluno a1 = new Aluno("elberth", "elberth@elberth.com");
		Aluno a2 = new Aluno("jose", "jose@jose.com");
		Aluno a3 = new Aluno("aline", "aline@aline.com");
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		
		//caso3: leitura um
		System.out.println("Aluno: " + alunos.get(0).getEmail());
		
		//caso4: leitura todos
		System.out.println("Quantidade: " + alunos.size());
		for(Aluno aluno : alunos) {
			System.out.println("Aluno: " + aluno.getNome());
		}
	}
}
