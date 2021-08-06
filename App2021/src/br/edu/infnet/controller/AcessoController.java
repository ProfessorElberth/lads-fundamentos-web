package br.edu.infnet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Aluno;
import br.edu.infnet.model.repository.AlunoDao;

public class AcessoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AcessoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		Aluno aluno = AlunoDao.validar(email, senha);
		
		if(aluno != null) {	
			
			request.setAttribute("lista", AlunoDao.obterLista());
			
			request.getRequestDispatcher("aluno/lista.jsp").forward(request, response);
		} else {			
			request.setAttribute("mensagem", "Autenticação inválida para o usuário "+ email +"!!!");

			doGet(request,response);
		}
	}
}