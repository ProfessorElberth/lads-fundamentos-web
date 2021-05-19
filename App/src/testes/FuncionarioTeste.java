package testes;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario func0 = new Funcionario(42, 100);		
		func0.bonus = 20;
		func0.desconto = 10;		
		func0.exibir();

		Funcionario func1 = new Funcionario();		
		func1.idade = 42;
		func1.salario = 100;
		func1.bonus = 20;
		func1.desconto = 10;		
		func1.exibir();
	
		Funcionario func2 = new Funcionario("maria", 20);		
		func2.salario = 200;
		func2.bonus = 40;
		func2.desconto = 20;		
		func2.exibir();

		Funcionario func3 = new Funcionario("joao", 50, 300, 75, 10);		
		func3.exibir();
		
		System.out.println("Término!!!");
	}
}