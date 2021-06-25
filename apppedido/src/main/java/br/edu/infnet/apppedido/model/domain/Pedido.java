package br.edu.infnet.apppedido.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {

	private String descricao;
	private LocalDateTime data;
	private Solicitante solicitante;
	
	public Pedido() {
		data = LocalDateTime.now();
	}
	
	public Pedido(String descricao) {
		this();
		this.descricao = descricao;
	}
	
	public String obterPedido() {
		return String.format("Pedido realizado em %s para o solicitante %s.", 
					this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")),
					this.solicitante.getNome()
				);
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		return String.format("%s;%s;%s", 
				this.descricao, 
				this.data.format(formato),
				this.solicitante
			);
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getData() {
		return data;
	}
	public Solicitante getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
}