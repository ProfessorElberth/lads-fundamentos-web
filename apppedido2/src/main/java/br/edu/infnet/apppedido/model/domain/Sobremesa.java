package br.edu.infnet.apppedido.model.domain;

import br.edu.infnet.apppedido.model.exceptions.SobremesaSemAcompanhamentoException;

public class Sobremesa extends Produto {

	private boolean individual;
	private String acompanhamento;
	private int tamanho;
	
	public Sobremesa(String descricao, float valor, boolean artesanal) {
		super(descricao, valor, artesanal);
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.individual ? "S" : "N");
		sb.append(";");
		sb.append(this.acompanhamento);
		sb.append(";");
		sb.append(this.tamanho);

		return sb.toString();
	}

	@Override
	public float calcularValorBruto() throws SobremesaSemAcompanhamentoException {

		if(this.acompanhamento.isBlank()) {
			throw new SobremesaSemAcompanhamentoException("[Sobremesa] Nenhum acompanhamento adicionado!");
		}
		
		float valorIndividual = 0;
		if(this.individual) {
			valorIndividual = 20;
		}

		float valorAcompanhamento = this.acompanhamento.split(",").length * 2;

		float valorTamanho = this.tamanho * 0.5f;
		
		return this.getValor() + valorIndividual + valorAcompanhamento + valorTamanho;
	}

	public boolean isIndividual() {
		return individual;
	}

	public void setIndividual(boolean individual) {
		this.individual = individual;
	}

	public String getAcompanhamento() {
		return acompanhamento;
	}

	public void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}