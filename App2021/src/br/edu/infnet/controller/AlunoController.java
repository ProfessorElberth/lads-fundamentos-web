package br.edu.infnet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Aluno;
import br.edu.infnet.model.repository.AlunoDao;

public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AlunoController() {
        super();    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tela = request.getParameter("tela");
		
		if("lista".equals(tela)) {
			request.getRequestDispatcher("aluno/cadastro.jsp").forward(request, response);
		} else {
			request.setAttribute("lista", AlunoDao.obterLista());		
			request.getRequestDispatcher("aluno/lista.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email"));
		aluno.setIdade(Integer.valueOf(request.getParameter("idade")));
		aluno.setMensalidade(Float.valueOf(request.getParameter("mensalidade")));
		aluno.setCurso(request.getParameter("curso"));
		aluno.setRegiao(request.getParameter("regiao"));
		aluno.setDisciplinas(request.getParameterValues("disciplinas"));
		
		AlunoDao.incluir(aluno);
		
		request.setAttribute("nomeDoAluno", aluno.getNome());
		request.setAttribute("lista", AlunoDao.obterLista());

		request.getRequestDispatcher("confirmacao.jsp").forward(request, response);
	}
}