package br.edu.infnet.apppedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.service.ComidaService;

@Controller
public class ComidaController {
	
	@Autowired
	private ComidaService comidaService;

	@GetMapping(value = "/comida/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("comidas", comidaService.obterLista(usuario));
		
		return "comida/lista";
	}	
	
	@GetMapping(value = "/comida")
	public String telaCadastro() {
		return "comida/cadastro";
	}
	
	@PostMapping(value = "/comida/incluir")
	public String incluir(Model model, Comida comida, @SessionAttribute("user") Usuario usuario) {
		
		comida.setUsuario(usuario);
		
		comidaService.incluir(comida);
		
		model.addAttribute("msg", "Comida " + comida.getDescricao() + " cadastrada com sucesso!!!");
		
		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/comida/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Comida comida = comidaService.obterPorId(id);
		
		String mensagem = null;
		try {
			comidaService.excluir(id);		
			mensagem = "A comida " + comida.getDescricao() + " foi removida com sucesso!!!";
		} catch (Exception e) {
			mensagem = "Foi impossível realizar a exclusão da comida "+ comida.getDescricao();
		}
		model.addAttribute("msg", mensagem);
		
		return telaLista(model, usuario);
	}
}