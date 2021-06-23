package br.edu.infnet.apppedido.model.tests;

import br.edu.infnet.apppedido.model.domain.Solicitante;

public class SolicitanteTeste {

	public static void main(String[] args) {
		
		Solicitante s1 = new Solicitante("Elberth Moraes", "elberth.moraes@gmail.com");
		System.out.println("Solicitante: " + s1);
	}
}