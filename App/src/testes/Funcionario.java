package testes;

public class Funcionario {

	String nome;
	int idade;
	float salario;
	float bonus;
	float desconto;
	
	@Override
	public String toString() {
		return "Sou o funcionário " + nome + " e tenho " + idade + " anos";
	}
}