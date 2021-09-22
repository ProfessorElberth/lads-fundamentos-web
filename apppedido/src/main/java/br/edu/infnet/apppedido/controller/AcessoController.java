package br.edu.infnet.apppedido.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.service.BebidaService;
import br.edu.infnet.apppedido.model.service.ComidaService;
import br.edu.infnet.apppedido.model.service.PedidoService;
import br.edu.infnet.apppedido.model.service.SolicitanteService;
import br.edu.infnet.apppedido.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private SolicitanteService solicitanteService;
	@Autowired
	private BebidaService bebidaService;
	@Autowired
	private ComidaService comidaService;
	@Autowired
	private PedidoService pedidoService;

	@GetMapping(value = "/app")
	public String telaApp(Model model) {

		Map<String, Integer> mapaTotal = new HashMap<String, Integer>();
		mapaTotal.put("Usuários", usuarioService.obterQtde());
		mapaTotal.put("Solicitantes", solicitanteService.obterQtde());
		mapaTotal.put("Bebidas", bebidaService.obterQtde());
		mapaTotal.put("Comidas", comidaService.obterQtde());
		mapaTotal.put("Pedidos", pedidoService.obterQtde());

		model.addAttribute("totalizacao", mapaTotal);
		
		return "app";
	}
	
	@GetMapping(value = "/")
	public String telaHome() {
		return "index";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}

	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		
		session.removeAttribute("user");
		
		return "redirect:/";
	}

	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {

		Usuario usuario = usuarioService.validar(email, senha);

		if(usuario != null) {
			
			model.addAttribute("user", usuario);

			return "index";
		} else {
			model.addAttribute("mensagem", "Autenticação inválida para o usuário "+ email +"!!!");
			
			return "login";
		}
	}
}