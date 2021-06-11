package dominio;

public class Estagiario extends Funcionario {

	private float desconto;
	private String instituicao;

	
	@Override
	public String toString() {
		return String.format("%.2f - %s", desconto, instituicao);
	}
	
	@Override
	public void exibirFormaCalculo() {
		System.out.println("= salário - desconto");
		System.out.println("= " + getSalario() + " - " + desconto);
		System.out.println("= " + calcularSalario());
	}
	
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