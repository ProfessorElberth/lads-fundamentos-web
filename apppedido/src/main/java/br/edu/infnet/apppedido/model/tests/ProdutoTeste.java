package br.edu.infnet.apppedido.model.tests;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Sobremesa;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Bebida b1 = new Bebida("bebida especial", 100);
		b1.setMarca("chope");
		System.out.println("Bebida: " + b1);

		Bebida b2 = new Bebida("bebida doida", 150);
		System.out.println("Bebida: " + b2);

		Comida c1 = new Comida("comida loka", 200);
		c1.setPorcao(3);
		System.out.println("Comida: " + c1);

		Sobremesa s1 = new Sobremesa("sobremesa delic", 300);
		s1.setIndividual(false);
		System.out.println("Sobremesa: " + s1);
	}
}
