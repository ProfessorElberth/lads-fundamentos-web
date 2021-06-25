package br.edu.infnet.apppedido.model.domain;

import br.edu.infnet.apppedido.model.exceptions.MedidaZeradaOuNegativaException;

public class Bebida extends Produto {
	
	private String marca;
	private boolean gelada;
	private float medida;

	public Bebida(String descricao, float valor, boolean artesanal) {
		super(descricao, valor, artesanal);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.marca);
		sb.append(";");
		sb.append(this.gelada ? "S" : "N");
		sb.append(";");
		sb.append(this.medida);

		return sb.toString();
	}

	@Override
	public float calcularValorBruto() throws MedidaZeradaOuNegativaException {
		
		if(this.medida <= 0) {
			throw new MedidaZeradaOuNegativaException("[Bebida] A medida informada está inválida: " + this.medida);
		}
		
		float valorMarca = 0;
		if("chope".equalsIgnoreCase(this.marca)) {
			valorMarca = 10;
		}
		
		float valorGelada = 10;
		if(this.gelada) {
			valorGelada = 50;
		}
		
		float valorMedida = this.medida * 0.05f;
		
		return this.getValor() + valorMarca + valorGelada + valorMedida;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {		
		this.marca = marca;			
	}

	public boolean isGelada() {
		return gelada;
	}

	public void setGelada(boolean gelada) {
		this.gelada = gelada;
	}

	public float getMedida() {
		return medida;
	}

	public void setMedida(float medida) {
		this.medida = medida;
	}
}