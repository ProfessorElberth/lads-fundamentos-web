package br.edu.infnet.apppedido.model.domain;

public class Bebida extends Produto {
	
	private String marca;

	public Bebida(String descricao, float valor) {
		super(descricao, valor);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.marca);
		sb.append(";");
		sb.append(this.calcularValorBruto());

		return sb.toString();
	}

	@Override
	public float calcularValorBruto() {
		return 10;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {		
		this.marca = marca;			
	}
}