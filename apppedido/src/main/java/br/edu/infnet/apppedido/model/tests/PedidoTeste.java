package br.edu.infnet.apppedido.model.tests;

import br.edu.infnet.apppedido.model.domain.Pedido;
import br.edu.infnet.apppedido.model.domain.Solicitante;

public class PedidoTeste {

	public static void main(String[] args) {
		
		Solicitante solicitanteP1 = new Solicitante("Bruno", "bruno@bruno.com", 20);
		
		Pedido p1 = new Pedido();
		p1.setDescricao("Outro pedido");
		p1.setSolicitante(solicitanteP1);
		System.out.println("Pedido: " + p1);

		Pedido p2 = new Pedido("Pedido do Elberth");
		p2.setSolicitante(null);
		System.out.println("Pedido: " + p2);
	}
}