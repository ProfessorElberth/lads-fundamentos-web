package testes;

import java.util.Scanner;

public class Segundo{

	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;
	private static float[] bonus;
	private static float[] descontos;
	
	private static int index;	

	private static final int QTDE = 5;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		nomes = new String[QTDE];
		idades = new int[QTDE];
		salarios = new float[QTDE];
		bonus = new float[QTDE];
		descontos = new float[QTDE];
		
		String opcao = null;
		
		do {
			System.out.println("[1] Cadastrar");
			System.out.println("[2] Consultar um");
			System.out.println("[3] Consultar todos");
			System.out.println("[4] Sair");
			
			System.out.print("Informe a opcao desejada: ");
			opcao = in.next();
			
			switch (opcao) {
			case "1": 
				if(index < QTDE) {
					System.out.println("Informe o seu nome: ");
					nomes[index] = in.next();
					
					System.out.println("Informe a sua idade: ");
					idades[index] = in.nextInt();
					
					System.out.println("Informe o seu salario: ");
					salarios[index] = in.nextFloat();
	
					System.out.println("Informe o seu bonus: ");
					bonus[index] = in.nextFloat();

					System.out.println("Informe o seu desconto: ");
					descontos[index] = in.nextFloat();

					System.out.println("Funcionário cadastrado com sucesso: ");
					imprimir(index);
					
					index++;
				} else {
					System.out.println("Não existe mais vaga para o cadastramento!!!");
				}
				
				break;

			case "2":
				System.out.print("Informe a posicao: ");
				int pos = in.nextInt();
				
				if(pos >= 0 && pos < index) {
					imprimir(pos);
				} else {
					System.out.println("Funcionário inexistente!!!");
				}
				
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
		
		exibirRelatorio();
		
		in.close();		
	}
	
	private static float calcularMediaSalarial() {
		float soma = 0;

		for(int i = 0; i < index; i++) {
			soma = soma + calcularSalario(i); 
		}
		
		return soma / index;
	}
	
	private static void exibirRelatorio() {
		int qtde = index;

		System.out.println("Relatório:");
		System.out.println("Quantidade de funcionários: " + qtde);
		System.out.println("Média salarial dos funcionários: " + calcularMediaSalarial());
	}
	
	private static void imprimir() {
		System.out.println("Listagem de inscritos:");
		for(int i = 0; i < index; i++) {
			imprimir(i);
		}
	}
	
	private static void imprimir(int posicao){
		
		float salarioLiquido = calcularSalario(posicao);
		
		System.out.printf("[%d] %s - %d - R$%.2f - R$%.2f - R$%.2f = R$%.2f (%s)\n", 
				posicao + 1, 
				nomes[posicao], 
				idades[posicao],
				salarios[posicao],
				bonus[posicao],
				descontos[posicao],
				salarioLiquido,
				getSituacao(salarioLiquido)
			);
	}
	
	private static float calcularSalario(int idx) {
		return salarios[idx] + bonus[idx] - descontos[idx];
	}
	
	private static String getSituacao(float sl) {
		return sl > 100000 ? "rico" : "pobre";
	}
}