package br.edu.infnet.apppedido.model.domain;

public class Solicitante {

	private String nome;
	private String email;
	
	public Solicitante(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.email);

		return sb.toString();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}