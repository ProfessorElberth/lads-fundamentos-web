package br.edu.infnet.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.edu.infnet.conexao.Conexao;
import br.edu.infnet.model.domain.Aluno;

public class AlunoDao {
	
	public static void incluir(Aluno aluno) {
		String sql = "INSERT INTO TAluno "
				+ "(nome, idade, mensalidade, email, curso, regiao, disciplinas) "
				+ "VALUES (?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setInt(2, aluno.getIdade());
			ps.setFloat(3, aluno.getMensalidade());
			ps.setString(4, aluno.getEmail());
			ps.setString(5, aluno.getCurso());
			ps.setString(6, aluno.getRegiao());
			ps.setString(7, Arrays.toString(aluno.getDisciplinas()));

			ps.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public static List<Aluno> obterLista(){
		List<Aluno> lista = new ArrayList<Aluno>();
		
		String sql = "SELECT * FROM TAluno ORDER BY nome";
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {

				Aluno aluno = new Aluno(rs.getString("nome"), rs.getString("email"));
				aluno.setIdade(rs.getInt("idade"));
				aluno.setMensalidade(rs.getFloat("mensalidade"));
				aluno.setCurso(rs.getString("curso"));
				aluno.setRegiao(rs.getString("regiao"));
//				aluno.setDisciplinas(rs.getString("disciplinas"));
				
				lista.add(aluno);
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return lista;
	}

	public static Aluno validar(String email, String senha) {
		
		if(email.equals(senha)) {
			
			return new Aluno("Elberth Moraes", email);
		}
		
		return null;
	}	
}