package br.edu.infnet.apppedido.model.domain;

import br.edu.infnet.apppedido.model.exceptions.ComidaSemIngredienteException;
import br.edu.infnet.apppedido.model.exceptions.MedidaZeradaOuNegativaException;
import br.edu.infnet.apppedido.model.exceptions.PorcaoZeradaException;
import br.edu.infnet.apppedido.model.exceptions.SobremesaSemAcompanhamentoException;

public abstract class Produto {

	private String descricao;
	private float valor;
	private boolean artesanal;
	
	public Produto(String descricao, float valor, boolean artesanal) {
		this.descricao = descricao;
		this.valor = valor;
		this.artesanal = artesanal;
	}
	
	public String obterProduto() throws MedidaZeradaOuNegativaException, PorcaoZeradaException, ComidaSemIngredienteException, SobremesaSemAcompanhamentoException {

		StringBuilder sb = new StringBuilder();
		sb.append(this.descricao);
		sb.append(";");
		sb.append(this.calcularValorBruto());
		sb.append("\r\n");
		
		return sb.toString();
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.descricao);
		sb.append(";");
		sb.append(this.valor);
		sb.append(";");
		sb.append(this.artesanal ? "S" : "N");
		
		return sb.toString();
	}
	
	public abstract float calcularValorBruto() throws MedidaZeradaOuNegativaException, PorcaoZeradaException, ComidaSemIngredienteException, SobremesaSemAcompanhamentoException;
	
	public String getDescricao() {
		return descricao;
	}
	public float getValor() {
		return valor;
	}

	public boolean isArtesanal() {
		return artesanal;
	}
}