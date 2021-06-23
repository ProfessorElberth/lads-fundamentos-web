package br.edu.infnet.apppedido.model.domain;

public abstract class Produto {

	private String descricao;
	private float valor;
	
	public Produto(String descricao, float valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.descricao);
		sb.append(";");
		sb.append(this.valor);
		
		return sb.toString();
	}
	
	public abstract float calcularValorBruto();
	
	public String getDescricao() {
		return descricao;
	}
	public float getValor() {
		return valor;
	}
}