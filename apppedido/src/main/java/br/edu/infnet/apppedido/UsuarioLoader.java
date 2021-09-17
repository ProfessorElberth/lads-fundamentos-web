package br.edu.infnet.apppedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Endereco;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.service.UsuarioService;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco endereco = new Endereco();
		endereco.setBairro("bairro admin");
		endereco.setCep("12345678");
		endereco.setComplemento("complemento admin");
		endereco.setLocalidade("localidade admin");
		endereco.setLogradouro("logradouro admin");
		endereco.setUf("RJ");
		
		Usuario usuario = new Usuario();
		usuario.setNome("Elberth L C Moraes");
		usuario.setEmail("elberth.moraes@prof.infnet.edu.br");
		usuario.setSenha("123");
		usuario.setAdmin(true);
		usuario.setEndereco(endereco);
		
		usuarioService.incluir(usuario);
	}
}
