package testes;

import java.util.Scanner;

public class Segundo{

	private static String nome;
	private static int idade;
	private static float salario;
	
	public static void main(String[] args){
		
		float numero = Float.valueOf(args[0]);
		
		System.out.println(numero % 2 == 0 ? "Par" : "Impar");
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < numero;i++){
			System.out.println("Informe o seu nome: ");
			nome = in.next();
			
			System.out.println("Informe a sua idade: ");
			idade = in.nextInt();
			
			System.out.println("Informe o seu salario: ");
			salario = in.nextFloat();
			
			imprimir(i);
		}
		
		in.close();
	}	
	
	private static void imprimir(int posicao){
		System.out.printf("%d - %s - %d - R$%.2f\n", posicao + 1, nome, idade, salario);
	}
	
}