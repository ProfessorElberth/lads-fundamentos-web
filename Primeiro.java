public class Primeiro{

	private static String[] parametros;

	private static int idade;
	private static float salario;
	private static String nome;
	private static String sobrenome;
	private static int qtdeMeses;
	private static boolean ehJava;
	
	private static void tratarParametros(){
		nome = parametros[0];
		sobrenome = parametros[1];
		idade = Integer.valueOf(parametros[2]);
		salario = Float.valueOf(parametros[3]);
		qtdeMeses = Integer.valueOf(parametros[5]);
		ehJava = "S".equalsIgnoreCase(parametros[4]) ? true : false;
	}
	
	private static boolean validar(int qtde){		
		return qtde == 6;
	}
	
	private static int definirAnoNascimento(){
		return 2021 - idade;
	}
	
	private static float calcularValorTotal(){
		return qtdeMeses * salario;
	}
	
	private static String obterPerfilPorIdade(){
		return idade < 50 ? "iniciante" : "veterano";
	}
	
	private static String obterPerfilPorSalario(float salarioTotal){
		return salarioTotal > 1000 ? "estavel" : "instavel";
	}

	private static void imprimir(){
		float salarioTotal = calcularValorTotal();			

		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("Idade: " + idade);
		System.out.println("Nascimento: " + definirAnoNascimento());
		System.out.println("Salario: " + salario);
		System.out.println("Java? " + ehJava);
		System.out.println("Salario Total: " + salarioTotal);
		System.out.println("Nivel: " + obterPerfilPorIdade());
		System.out.println("Situacao: " + obterPerfilPorSalario(salarioTotal));
	}

	public static void main(String[] args)	{		

		if(validar(args.length)){
			parametros = args;
			
			tratarParametros();

			imprimir();
		} else {		
			System.out.println("Problemas na quantidade de parametros.");
		}		
	}		
}