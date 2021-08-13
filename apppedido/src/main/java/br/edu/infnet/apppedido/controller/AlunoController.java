package br.edu.infnet.apppedido.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.apppedido.model.domain.Aluno;

@Controller
public class AlunoController {

	@GetMapping(value = "/aluno")
	public String tela() {
		return "aluno/cadastro";
	}	
	
	@GetMapping(value = "/aluno/lista")
	public String telaLista() {
		return "aluno/lista";
	}

	@PostMapping(value = "/aluno/incluir")
	public String incluir(Model model, Aluno aluno) {
		
		model.addAttribute("nomeDoAluno", aluno.getNome()); 
		
		return "aluno/confirmacao";
	}	
}