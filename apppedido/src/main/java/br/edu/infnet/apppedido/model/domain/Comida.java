package br.edu.infnet.apppedido.model.domain;

public class Comida extends Produto {

	private int porcao;
	
	public Comida(String descricao, float valor) {
		super(descricao, valor);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.porcao);
		sb.append(";");
		sb.append(this.calcularValorBruto());

		return sb.toString();
	}

	@Override
	public float calcularValorBruto() {
		return 20;
	}

	public int getPorcao() {
		return porcao;
	}
	public void setPorcao(int porcao) {
		this.porcao = porcao;
	}
}
