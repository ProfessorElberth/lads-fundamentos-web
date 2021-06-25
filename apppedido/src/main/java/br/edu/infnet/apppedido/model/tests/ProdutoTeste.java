package br.edu.infnet.apppedido.model.tests;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Sobremesa;
import br.edu.infnet.apppedido.model.exceptions.ComidaSemIngredienteException;
import br.edu.infnet.apppedido.model.exceptions.MedidaZeradaOuNegativaException;
import br.edu.infnet.apppedido.model.exceptions.PorcaoZeradaException;
import br.edu.infnet.apppedido.model.exceptions.SobremesaSemAcompanhamentoException;

public class ProdutoTeste {

	public static void main(String[] args) {
		try {
			Bebida b1 = new Bebida("bebida especial", 100, true);
			b1.setGelada(true);
			b1.setMarca("chope");
			b1.setMedida(500);
			System.out.printf("BEBIDA >>> %s", b1.obterProduto());
		} catch (MedidaZeradaOuNegativaException | PorcaoZeradaException | ComidaSemIngredienteException | SobremesaSemAcompanhamentoException e) {
			System.out.println(e.getMessage());
		}

		try {
			Bebida b2 = new Bebida("bebida doida", 150, false);
			b2.setGelada(false);
			b2.setMarca("suco");
			b2.setMedida(1000);
			System.out.printf("BEBIDA >>> %s", b2.obterProduto());
		} catch (MedidaZeradaOuNegativaException | PorcaoZeradaException | ComidaSemIngredienteException | SobremesaSemAcompanhamentoException e) {
			System.out.println(e.getMessage());
		}

		try {
			Bebida b3 = new Bebida("refrigerante", 50, false);
			b3.setGelada(true);
			b3.setMarca("coke");
			b3.setMedida(0);
			System.out.printf("BEBIDA >>> %s", b3.obterProduto());
		} catch (MedidaZeradaOuNegativaException | PorcaoZeradaException | ComidaSemIngredienteException | SobremesaSemAcompanhamentoException e) {
			System.out.println(e.getMessage());
		}

		try {
			Comida c1 = new Comida("comida loka", 200, true);
			c1.setIngrediente("arroz, feijão, bife, batata, farofa");
			c1.setPorcao(3);
			c1.setVegano(false);
			System.out.printf("COMIDA >>> %s", c1.obterProduto());
		} catch (MedidaZeradaOuNegativaException | PorcaoZeradaException | ComidaSemIngredienteException | SobremesaSemAcompanhamentoException e) {
			System.out.println(e.getMessage());
		}

		try {
			Comida c2 = new Comida("lanchinho da hora", 150, false);
			c2.setIngrediente("pão na chapa");
			c2.setPorcao(1);
			c2.setVegano(true);
			System.out.printf("COMIDA >>> %s", c2.obterProduto());
		} catch (MedidaZeradaOuNegativaException | PorcaoZeradaException | ComidaSemIngredienteException | SobremesaSemAcompanhamentoException e) {
			System.out.println(e.getMessage());
		}

		try {
			Comida c3 = new Comida("lanchinho da hora", 150, false);
			c3.setIngrediente("pão na chapa, cafezinho");
			c3.setPorcao(0);
			c3.setVegano(true);
			System.out.printf("COMIDA >>> %s", c3.obterProduto());
		} catch (MedidaZeradaOuNegativaException | PorcaoZeradaException | ComidaSemIngredienteException | SobremesaSemAcompanhamentoException e) {
			System.out.println(e.getMessage());
		}

		try {
			Comida c4 = new Comida("lanchinho da hora", 150, false);
			c4.setIngrediente("");
			c4.setPorcao(10);
			c4.setVegano(true);
			System.out.printf("COMIDA >>> %s", c4.obterProduto());
		} catch (MedidaZeradaOuNegativaException | PorcaoZeradaException | ComidaSemIngredienteException | SobremesaSemAcompanhamentoException e) {
			System.out.println(e.getMessage());
		}

		try {
			Sobremesa s1 = new Sobremesa("sobremesa delic", 300, false);
			s1.setAcompanhamento("mel, chocolate, menta");
			s1.setIndividual(false);
			s1.setTamanho(1500);
			System.out.printf("SOBREMESA >>> %s", s1.obterProduto());
		} catch (MedidaZeradaOuNegativaException | PorcaoZeradaException | ComidaSemIngredienteException | SobremesaSemAcompanhamentoException e) {
			System.out.println(e.getMessage());
		}

		try {
			Sobremesa s2 = new Sobremesa("casquinha", 100, true);
			s2.setAcompanhamento("baunilha");
			s2.setIndividual(true);
			s2.setTamanho(250);
			System.out.printf("SOBREMESA >>> %s", s2.obterProduto());
		} catch (MedidaZeradaOuNegativaException | PorcaoZeradaException | ComidaSemIngredienteException | SobremesaSemAcompanhamentoException e) {
			System.out.println(e.getMessage());
		}

		try {
			Sobremesa s3 = new Sobremesa("bolo", 150, false);
			s3.setAcompanhamento("");
			s3.setIndividual(false);
			s3.setTamanho(500);
			System.out.printf("SOBREMESA >>> %s", s3.obterProduto());
		} catch (MedidaZeradaOuNegativaException | PorcaoZeradaException | ComidaSemIngredienteException | SobremesaSemAcompanhamentoException e) {
			System.out.println(e.getMessage());
		}
	}
}
