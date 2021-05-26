package dominio;

public class Administrativo extends Funcionario {

	private float bonus;
	private float desconto;

	public Administrativo() {
		this.setNome("Administrador Fantasma");
	}
	
	public Administrativo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	protected float calcularSalario() {
		return getSalario() + bonus - desconto;
	}	

	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
}