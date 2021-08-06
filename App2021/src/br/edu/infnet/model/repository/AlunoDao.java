package br.edu.infnet.model.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.model.domain.Aluno;

public class AlunoDao {
	
	private static List<Aluno> alunos = new ArrayList<Aluno>();
	
	public static void incluir(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public static List<Aluno> obterLista(){
		return alunos;
	}

	public static Aluno validar(String email, String senha) {
		
		if(email.equals(senha)) {
			
			return new Aluno("Elberth Moraes", email);
		}
		
		return null;
	}	
}