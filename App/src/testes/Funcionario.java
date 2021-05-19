package testes;

import auxiliar.Constante;

public class Funcionario {

	String nome;
	int idade;
	float salario;
	float bonus;
	float desconto;

	public Funcionario() {
		nome = "Fantasma";
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
	
	public Funcionario(String nome, int idade, float salario, float bonus, float desconto) {
		this(nome, idade);
		this.salario = salario;
		this.bonus = bonus;
		this.desconto = desconto;
	}
	
	private float calcularSalario() {
		return salario + bonus - desconto;
	}
	
	private String getSituacao(float salarioLiquido) {
		return salarioLiquido > Constante.SALARIO ? "rico" : "pobre";
	}
	
	void exibir() {
		float sl = calcularSalario();
		System.out.println("Funcionário: " + this + " = R$" + sl + " [" + getSituacao(sl) + "]");
	}

	@Override
	public String toString() {
		return "Sou o funcionário " + nome + " e tenho " + idade + " anos";
	}
}