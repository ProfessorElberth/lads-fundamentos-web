package br.edu.infnet.apppedido.model.tests;

import br.edu.infnet.apppedido.model.domain.Pedido;

public class PedidoTeste {

	public static void main(String[] args) {
		
		Pedido p1 = new Pedido("Pedido do Elberth");
		System.out.println("Pedido: " + p1);
	}
}