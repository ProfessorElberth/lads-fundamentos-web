package dominio;

import exceptions.FaturamentoNegativoException;
import exceptions.NomeIncompletoException;

public class Empresa {

	private String nome;
	private String sobrenome;
	private String ultimoNome;
	private float faturamento;
	
	public void imprimir() throws NomeIncompletoException {
		System.out.println(this.getNome());
	}

	public StringBuilder getNome() throws NomeIncompletoException {

		if(ultimoNome == null || nome == null || sobrenome == null) {
			throw new NomeIncompletoException("Preenchimento inválido!!!");
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(ultimoNome.toUpperCase().charAt(0));
		sb.append(".");
		sb.append(", ");
		sb.append(nome.toUpperCase());
		sb.append(" ");
		sb.append(sobrenome.toLowerCase());

		return sb;
	}
	public void setNome(String nome) {
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");

		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public float getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(float faturamento) throws FaturamentoNegativoException {
		
		if(faturamento < 0) {
			throw new FaturamentoNegativoException("O faturamento está negativo");
		}
		this.faturamento = faturamento;
	}
}