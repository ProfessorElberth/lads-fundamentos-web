package br.edu.infnet.apppedido.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import br.edu.infnet.apppedido.model.exceptions.ComidaSemIngredienteException;
import br.edu.infnet.apppedido.model.exceptions.MedidaZeradaOuNegativaException;
import br.edu.infnet.apppedido.model.exceptions.PorcaoZeradaException;
import br.edu.infnet.apppedido.model.exceptions.SobremesaSemAcompanhamentoException;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private float valor;
	private boolean artesanal;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	@ManyToMany(mappedBy = "produtos")
	private List<Pedido> pedidos;
	
	public Produto() {
		
	}
	
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public boolean isArtesanal() {
		return artesanal;
	}
	public void setArtesanal(boolean artesanal) {
		this.artesanal = artesanal;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}