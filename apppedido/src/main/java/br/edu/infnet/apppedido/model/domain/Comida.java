package br.edu.infnet.apppedido.model.domain;

import javax.persistence.Entity;

import br.edu.infnet.apppedido.model.exceptions.ComidaSemIngredienteException;
import br.edu.infnet.apppedido.model.exceptions.PorcaoZeradaException;

@Entity
public class Comida extends Produto {

	private int porcao;
	private boolean vegano;
	private String ingrediente;
	
	public Comida() {
	}
	
	public Comida(String descricao, float valor, boolean artesanal) {
		super(descricao, valor, artesanal);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.porcao);
		sb.append(";");
		sb.append(this.vegano ? "S" : "N");
		sb.append(";");
		sb.append(this.ingrediente);

		return sb.toString();
	}

	@Override
	public float calcularValorBruto() throws PorcaoZeradaException, ComidaSemIngredienteException {
		
		if(this.porcao == 0) {
			throw new PorcaoZeradaException("[Comida] A porção está zerada: " + this.porcao);
		}
		
		if(this.ingrediente.isBlank()) {
			throw new ComidaSemIngredienteException("[Comida] Nenhum ingrediente adicionado!");
		}
		
		float valorPorcao = this.porcao * 2;
		
		float valorVegano = 100;
		if(this.vegano) {
			valorVegano = 150;
		}
		
		float valorIngrediente = this.ingrediente.split(",").length * 2;

		return this.getValor() + valorPorcao + valorVegano + valorIngrediente;
	}

	public int getPorcao() {
		return porcao;
	}
	public void setPorcao(int porcao) {
		this.porcao = porcao;
	}

	public boolean isVegano() {
		return vegano;
	}

	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
}
