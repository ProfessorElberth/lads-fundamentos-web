package br.edu.infnet.apppedido;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Pedido;
import br.edu.infnet.apppedido.model.domain.Produto;
import br.edu.infnet.apppedido.model.domain.Solicitante;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.service.PedidoService;

@Component
@Order(4)
public class PedidoLoader implements ApplicationRunner {
	
	@Autowired
	private PedidoService pedidoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Solicitante solicitante = new Solicitante();
		solicitante.setId(1);

		Bebida b1 = new Bebida();
		b1.setId(1);

		Comida c1 = new Comida();
		c1.setId(2);
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(b1);
		produtos.add(c1);
		
		Pedido pedido = new Pedido();
		pedido.setDescricao("Meu pedido especial");
		pedido.setProdutos(produtos);
		pedido.setSolicitante(solicitante);
		pedido.setUsuario(usuario);
		
		pedidoService.incluir(pedido);
	}
}