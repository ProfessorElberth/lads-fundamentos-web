package dominio;

import auxiliar.Constante;

public abstract class Funcionario {

	private int id;
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
	
	public String obterStringSalarioPorFuncionario() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.calcularSalario());
		sb.append("\r\n");
		
		return sb.toString();
	}
	
	public abstract void exibirFormaCalculo();
	
	public abstract float calcularSalario();
	
	public String getSituacao(float salarioLiquido) {
		return salarioLiquido > Constante.SALARIO ? "rico" : "pobre";
	}
	
	public void imprimir() {
		float salarioLiquido = calcularSalario();
		
		System.out.printf("%d :: %s - %d - R$%.2f - %s = R$%.2f (%s)\n", 
				id, 
				nome, 
				idade,
				salario,
				this.toString(),
				salarioLiquido,
				getSituacao(salarioLiquido)
			);
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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