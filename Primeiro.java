public class Primeiro{

	public static void main(String[] args)	{		
	
		if(args.length == 6){
			String nome = args[0];						
			String sobrenome = args[1];					
			int idade = Integer.valueOf(args[2]);		
			float salario = Float.valueOf(args[3]);					
			int qtdeMeses = Integer.valueOf(args[5]);
			boolean ehJava = "S".equalsIgnoreCase(args[4]) ? true : false;
			
			int anoNascimento = 2021 - idade;
			float salarioTotal = salario * qtdeMeses;

			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Idade: " + idade);
			System.out.println("Nascimento: " + anoNascimento);
			System.out.println("Salario: " + salario);
			System.out.println("Java? " + ehJava);
			System.out.println("Salario Total: " + salarioTotal);
		} else {		
			System.out.println("Problemas na quantidade de parametros.");
		}
	}	
	
}