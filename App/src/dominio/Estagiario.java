package dominio;

public class Estagiario extends Funcionario {

	private float desconto;
	private String instituicao;
	
	@Override
	public float calcularSalario() {
		
		return getSalario() - desconto;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
}