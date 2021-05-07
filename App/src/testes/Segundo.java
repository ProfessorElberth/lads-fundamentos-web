package testes;

import java.util.Scanner;

public class Segundo{

	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;
	
	private static final int QTDE = 5;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		nomes = new String[QTDE];
		idades = new int[QTDE];
		salarios = new float[QTDE];
		
		String opcao = null;
		
		int index = 0;
		
		do {
			System.out.println("[1] Cadastrar");
			System.out.println("[2] Consultar um");
			System.out.println("[3] Consultar todos");
			System.out.println("[4] Sair");
			
			System.out.print("Informe a opcao desejada: ");
			opcao = in.next();
			
			switch (opcao) {
			case "1":
				System.out.println("Informe o seu nome: ");
				nomes[index] = in.next();
				
				System.out.println("Informe a sua idade: ");
				idades[index] = in.nextInt();
				
				System.out.println("Informe o seu salario: ");
				salarios[index] = in.nextFloat();

				index++;
				
				break;

			case "2":
				System.out.print("Informe a posicao: ");
				int pos = in.nextInt();
				
				imprimir(pos);
				break;

			case "3":
				imprimir();
				
				break;

			case "4":
				System.out.println("Finalizou!!!");
				break;
				
			default:
				System.out.println("Opcao invalida!!!");
				break;
			}

		} while (!opcao.equals("4"));
		
		in.close();		
	}	
	
	private static void imprimir() {
		System.out.println("Listagem de inscritos:");
		for(String nome : nomes) {
			if(nome != null) {
				System.out.println("Nome: " + nome);
			}
		}
	}
	
	private static void imprimir(int posicao){
		System.out.printf("%d - %s - %d - R$%.2f\n", 
				posicao + 1, 
				nomes[posicao], 
				idades[posicao],
				salarios[posicao]
			);
	}	
}