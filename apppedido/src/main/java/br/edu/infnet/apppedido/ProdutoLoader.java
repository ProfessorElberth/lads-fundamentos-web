package br.edu.infnet.apppedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.service.BebidaService;
import br.edu.infnet.apppedido.model.service.ComidaService;

@Component
@Order(3)
public class ProdutoLoader implements ApplicationRunner {
	
	@Autowired
	private BebidaService bebidaService;
	@Autowired
	private ComidaService comidaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Bebida b1 = new Bebida("Chopinho", 10, true);
		b1.setGelada(true);
		b1.setMarca("Morales");
		b1.setMedida(500);
		b1.setUsuario(usuario);
		
		bebidaService.incluir(b1);

		Comida c1 = new Comida("Sopa", 5, false);
		c1.setIngrediente("Um monte de coisa");
		c1.setPorcao(1);
		c1.setVegano(true);
		c1.setUsuario(usuario);
		
		comidaService.incluir(c1);
	}
}