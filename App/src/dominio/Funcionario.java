package dominio;

import auxiliar.Constante;

public abstract class Funcionario {

	private String nome;
	private int idade;
	private float salario;

	public Funcionario() {
		nome = "Fantasma";
		idade = 18;
		salario = 1045;
	}
	
	public Funcionario(int idade, float salario) {
		this();
		this.idade = idade;
		this.salario = salario;
	}
	
	public Funcionario(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}
	
	public Funcionario(String nome, int idade, float salario) {
		this(nome, idade);
		this.salario = salario;
	}
	
	protected abstract float calcularSalario();
	
	private String getSituacao(float salarioLiquido) {
		return salarioLiquido > Constante.SALARIO ? "rico" : "pobre";
	}
	
	public void exibir() {
		float sl = calcularSalario();
		System.out.println("Funcionário: " + this + " = R$" + sl + " [" + getSituacao(sl) + "]");
	}

	@Override
	public String toString() {
		return "Sou o funcionário " + nome + " e tenho " + idade + " anos";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}