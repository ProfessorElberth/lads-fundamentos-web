package br.edu.infnet.apppedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.service.BebidaService;

@Component
public class ProdutoLoader implements ApplicationRunner {
	
	@Autowired
	private BebidaService bebidaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Bebida b1 = new Bebida("Chopinho", 10, true);
		b1.setGelada(true);
		b1.setMarca("Morales");
		b1.setMedida(500);
		
		bebidaService.incluir(b1);
		
		Bebida b2 = new Bebida("Cafezinho", 50, false);
		b2.setGelada(false);
		b2.setMarca("Morales Cooooof");
		b2.setMedida(100);
		
		bebidaService.incluir(b2);

		for(Bebida b : bebidaService.obterLista()) {
			System.out.println(b);
		}
		
		bebidaService.excluir(1);

		for(Bebida b : bebidaService.obterLista()) {
			System.out.println(b);
		}
		
		Bebida b3 = bebidaService.obterPorId(2);
		
		System.out.println(b3.getDescricao());
	}
}