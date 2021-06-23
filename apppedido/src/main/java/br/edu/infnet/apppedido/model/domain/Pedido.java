package br.edu.infnet.apppedido.model.domain;

public class Pedido {

	private String descricao;
	
	public Pedido(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format("%s;", this.descricao);
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}