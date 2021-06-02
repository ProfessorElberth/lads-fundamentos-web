package testes;

import java.util.Scanner;

import dominio.Administrativo;
import dominio.Estagiario;
import dominio.Funcionario;
import dominio.Programador;

public class TPLike{

	private static Funcionario[] funcionarios;
	
	private static int index;	

	private static final int QTDE = 5;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		funcionarios = new Funcionario[QTDE];
		
		String opcao = null;
		
		int posicao = 0;
		
		do {
			System.out.println("[1] Cadastrar administrativo");
			System.out.println("[2] Cadastrar estagiario");
			System.out.println("[3] Cadastrar programador");
			System.out.println("[6] Exibir a forma de cálculo");
			System.out.println("[7] Consultar um");
			System.out.println("[8] Consultar todos");
			System.out.println("[9] Sair");
			
			System.out.print("Informe a opcao desejada: ");
			opcao = in.next();
			
			switch (opcao) {
			case "1": 
				if(index < QTDE) {
					Administrativo adm = new Administrativo();
					
					adm.setId(index);
					
					System.out.println("Informe o seu nome: ");
					adm.setNome(in.next());
					
					System.out.println("Informe a sua idade: ");
					adm.setIdade(in.nextInt());
					
					System.out.println("Informe o seu salario: ");
					adm.setSalario(in.nextFloat());
	
					System.out.println("Informe o seu bonus: ");
					adm.setBonus(in.nextFloat());

					System.out.println("Informe o seu desconto: ");
					adm.setDesconto(in.nextFloat());

					funcionarios[index] = adm;
					
					System.out.println("Administrativo cadastrado com sucesso: ");
					funcionarios[index].imprimir();
					
					index++;
				} else {
					System.out.println("Não existe mais vaga para o cadastramento!!!");
				}
				
				break;

			case "2": 
				if(index < QTDE) {
					Estagiario estag = new Estagiario();
					
					estag.setId(index);
					
					System.out.println("Informe o seu nome: ");
					estag.setNome(in.next());
					
					System.out.println("Informe a sua idade: ");
					estag.setIdade(in.nextInt());
					
					System.out.println("Informe o seu salario: ");
					estag.setSalario(in.nextFloat());
	
					System.out.println("Informe a sua instituicao: ");
					estag.setInstituicao(in.next());

					System.out.println("Informe o seu desconto: ");
					estag.setDesconto(in.nextFloat());

					funcionarios[index] = estag;
					
					System.out.println("Estagiário cadastrado com sucesso: ");
					funcionarios[index].imprimir();
					
					index++;
				} else {
					System.out.println("Não existe mais vaga para o cadastramento!!!");
				}
				
				break;
			
			case "3": 
				if(index < QTDE) {
					Programador prog = new Programador();
					
					prog.setId(index);
					
					System.out.println("Informe o seu nome: ");
					prog.setNome(in.next());
					
					System.out.println("Informe a sua idade: ");
					prog.setIdade(in.nextInt());
					
					System.out.println("Informe o seu salario: ");
					prog.setSalario(in.nextFloat());
	
					System.out.println("Informe a sua linguagem: ");
					prog.setLinguagem(in.next());

					System.out.println("Informe se é fullstack: ");
					prog.setFullStack(in.nextBoolean());

					funcionarios[index] = prog;
					
					System.out.println("Programador cadastrado com sucesso: ");
					funcionarios[index].imprimir();
					
					index++;
				} else {
					System.out.println("Não existe mais vaga para o cadastramento!!!");
				}
				
				break;

			case "6":
				System.out.print("Informe a posicao: ");
				posicao = in.nextInt();
				
				if(posicao >= 0 && posicao < index) {
					funcionarios[posicao].exibirFormaCalculo();
				} else {
					System.out.println("Funcionário inexistente!!!");
				}
				
				break;
				
			case "7":
				System.out.print("Informe a posicao: ");
				posicao = in.nextInt();
				
				if(posicao >= 0 && posicao < index) {
					funcionarios[posicao].imprimir();
				} else {
					System.out.println("Funcionário inexistente!!!");
				}
				
				break;

			case "8":
				imprimir();
				
				break;

			case "9":
				System.out.println("Finalizou!!!");
				break;
				
			default:
				System.out.println("Opcao invalida!!!");
				break;
			}

		} while (!opcao.equals("9"));
		
		exibirRelatorio();
		
		in.close();		
	}
	
	private static float calcularMediaSalarial() {
		float soma = 0;
		
		for(int i = 0; i < index; i++) {
			soma = soma + funcionarios[i].calcularSalario();
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
			funcionarios[i].imprimir();
		}
	}
}