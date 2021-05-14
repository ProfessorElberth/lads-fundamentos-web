package testes;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "rafael";
		funcionario.idade = 42;
		funcionario.salario = 100;
		funcionario.bonus = 20;
		funcionario.desconto = 10;
		
		System.out.println(funcionario);
	}
}