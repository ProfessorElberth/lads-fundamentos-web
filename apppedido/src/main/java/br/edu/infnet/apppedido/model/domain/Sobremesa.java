package br.edu.infnet.apppedido.model.domain;

public class Sobremesa extends Produto {

	private boolean individual;
	
	public Sobremesa(String descricao, float valor) {
		super(descricao, valor);
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.individual ? "S" : "N");
		sb.append(";");
		sb.append(this.calcularValorBruto());

		return sb.toString();
	}

	@Override
	public float calcularValorBruto() {
		return 30;
	}

	public boolean isIndividual() {
		return individual;
	}

	public void setIndividual(boolean individual) {
		this.individual = individual;
	}
}