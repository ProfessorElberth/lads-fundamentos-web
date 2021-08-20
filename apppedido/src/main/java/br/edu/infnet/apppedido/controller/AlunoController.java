package br.edu.infnet.apppedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.apppedido.model.domain.Aluno;
import br.edu.infnet.apppedido.model.service.AlunoService;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;

	@GetMapping(value = "/aluno")
	public String tela() {
		return "aluno/cadastro";
	}	
	
	@GetMapping(value = "/aluno/lista")
	public String telaLista(Model model) {

		model.addAttribute("lista", alunoService.obterLista());

		return "aluno/lista";
	}

	@PostMapping(value = "/aluno/incluir")
	public String incluir(Model model, Aluno aluno) {

		alunoService.incluir(aluno);
		
		model.addAttribute("nomeDoAluno", aluno.getNome()); 
		
		return "aluno/confirmacao";
	}	
	
	@GetMapping(value = "/aluno/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id) {

		alunoService.excluir(id);
		
		return "redirect:/aluno/lista";
	}
}