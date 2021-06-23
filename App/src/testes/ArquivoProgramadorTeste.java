package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import dominio.Programador;

public class ArquivoProgramadorTeste {
	
	private static Programador[] programadores;
	
	private static void imprimirSalariosAcimaMedia(float media) {
		for(Programador prog : programadores) {
			if(prog != null) {
				
				float salarioCalculado = prog.calcularSalario(); 
				
				if(salarioCalculado > media) {
					System.out.println("- " + prog.getNome() + " | " + salarioCalculado);
				}
			}
		}
	}
	
	private static void imprimirFullStackAbaixoMedia(float media) {
		for(Programador prog : programadores) {
			if(prog != null) {
				
				if(prog.calcularSalario() < media && prog.isFullStack()) {
					System.out.println("- " + prog.getNome() + " | " + prog.getLinguagem());
				}
			}
		}
	}
	
	private static void imprimirJavaAcima30Anos() {
		for(Programador prog : programadores) {
			if(prog != null) {
				
				if("java".equalsIgnoreCase(prog.getLinguagem()) && prog.getIdade() > 30) {
					System.out.println("- " + prog.getNome() + " | " + prog.getIdade());
				}
			}
		}
	}

	public static void main(String[] args) {
		try {				
			String arquivo = "c:/dev/programadores.txt";
			
			programadores = new Programador[9];
			
			try {
				FileReader file = new FileReader(arquivo);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
				
				int qtde = 0;
				float somaSalarial = 0;
				
				while (linha != null) {
					String[] campos = linha.split(";");
					
					Programador programador = new Programador();
					programador.setNome(campos[0]);
					programador.setIdade(Integer.valueOf(campos[1]));
					programador.setSalario(Float.valueOf(campos[2]));
					programador.setFullStack("S".equalsIgnoreCase(campos[3]));
					programador.setLinguagem(campos[4]);
					programador.imprimir();

					linha = leitura.readLine();
					
					programadores[qtde] = programador;
					
					qtde++;
					somaSalarial = somaSalarial + programador.calcularSalario();
				}
				leitura.close();
				file.close();
				
				float mediaSalarial = somaSalarial / qtde;
				
				System.out.println("------------------");
				System.out.println("Quantidade: " + qtde);
				System.out.println("Soma salarial: " + somaSalarial);
				System.out.println("Média salarial: " + mediaSalarial);
				
				System.out.println("------------------");

				System.out.println("Os programadores com salários acima da média:");
				imprimirSalariosAcimaMedia(mediaSalarial);
				
				System.out.println("------------------");
				
				System.out.println("Os programadores fullstack com salários abaixo da média:");
				imprimirFullStackAbaixoMedia(mediaSalarial);
				
				System.out.println("------------------");

				System.out.println("Os programadores java que tenham mais de 30 anos:");
				imprimirJavaAcima30Anos();
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} finally {
			System.out.println("Terminou!!!");
		}
	}
}
