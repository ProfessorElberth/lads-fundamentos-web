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
	
	public abstract float calcularSalario();
	
	public String getSituacao(float salarioLiquido) {
		return salarioLiquido > Constante.SALARIO ? "rico" : "pobre";
	}
	
	public void imprimir() {
		float salarioLiquido = calcularSalario();
		
		System.out.printf("%d :: %s - %d - R$%.2f - R$%.2f - R$%.2f = R$%.2f (%s)\n", 
				0, 
				getNome(), 
				getIdade(),
				getSalario(),
				0f,//getBonus(),
				0f,//getDesconto(),
				salarioLiquido,
				getSituacao(salarioLiquido)
			);
		
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