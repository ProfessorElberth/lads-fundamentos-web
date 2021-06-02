package dominio;

public class Programador extends Funcionario {
	
	private boolean fullStack;
	private String linguagem;
	
	public Programador() {
		this.setIdade(10);
	}
	
	public Programador(String nome, int idade) {
		super(nome, idade);
	}
	
	public Programador(String nome, int idade, float salario, boolean fullStack, String linguagem) {
		this(nome, idade);
		this.setSalario(salario);
		this.fullStack = fullStack;
		this.linguagem = linguagem;
	}
	
	private float calcularSalarioFullStack() {
		return fullStack ? 1500 : 500;
	}
	
	private float calcularSalarioLinguagem() {
		return "java".equalsIgnoreCase(linguagem) ? 2000 : 750;
	}
	
	@Override
	public float calcularSalario(){		
		return getSalario() + calcularSalarioFullStack() + calcularSalarioLinguagem();
	}

	@Override
	public void exibirFormaCalculo() {
		System.out.println("salário fullstack = 1500 (se fullstack sim)");
		System.out.println("salário fullstack = 500  (se fullstack não)");
		System.out.println("salário linguagem = 2000 (se linguagem java sim)");
		System.out.println("salário linguagem = 750  (se linguagem java não)");
		
		System.out.println("= salário + salário fullstack + salário linguagem");
		System.out.println("= " + getSalario() + " + " + calcularSalarioFullStack() + " - " + calcularSalarioLinguagem());
		System.out.println("= " + calcularSalario());
	}
	
	@Override
	public String getSituacao(float salarioLiquido) {
		if(salarioLiquido > 10000) {
			return "rico";
		} else if(salarioLiquido < 2500) {
			return "pobre";
		} else {
			return "classe média";
		}
	}

	@Override
	public String toString() {
		return String.format("%s - %s", fullStack, linguagem); 
	}
	
//	@Override
//	public void imprimir() {
//		float sl = calcularSalario();
//		System.out.println("O programador " + this.getNome() + " desenvolve em " + this.linguagem + 
//				" || " + sl + "("+getSituacao(sl)+")");
//
//	}

	public boolean isFullStack() {
		return fullStack;
	}
	public void setFullStack(boolean fullStack) {
		this.fullStack = fullStack;
	}
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
}