package br.edu.infnet.model.testes;

import br.edu.infnet.conexao.Conexao;

public class ConexaoTeste {

	public static void main(String[] args) {

		if (Conexao.obterConexao() != null) {
			System.out.println("Conectou!!!");
		} else {
			System.out.println("Deu ruim!!!");
		}
	}
}