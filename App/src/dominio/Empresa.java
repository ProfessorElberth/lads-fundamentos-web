package dominio;

public class Empresa {

	private String nome;
	private String sobrenome;
	private String ultimoNome;
	
	public void imprimir() {
		System.out.println(this.getNome());
	}

	public StringBuilder getNome() {
		
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
}