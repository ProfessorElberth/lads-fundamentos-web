package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import dominio.Estagiario;
import exceptions.EstagiarioInexistenteException;

public class ArquivoTeste {

	public static void main(String[] args) {
		try {
			String dir = "c:/dev/";
			String arq = "alunos.txt";
	
			try {
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				FileReader file = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
				
				float maiorSalarioLiquido = 0;
				Estagiario maiorEstagiario = null;
				int qtde = 0;
				float somaSalarial = 0;
				
				while(linha != null) {
					
					String[] campos = linha.split(";");

					switch (campos[0].toUpperCase()) {
					case "E":
						Estagiario estag = new Estagiario();
						estag.setNome(campos[1]);
						estag.setIdade(Integer.valueOf(campos[2]));
						estag.setSalario(Float.valueOf(campos[3]));
						estag.setDesconto(Float.valueOf(campos[4]));
						estag.setInstituicao(campos[5]);
	
						float salario = estag.calcularSalario();
						
						if(salario > maiorSalarioLiquido) {
							maiorSalarioLiquido = salario;
							maiorEstagiario = estag;
						}
						
						estag.imprimir();
						
						escrita.write(estag.getNome()+";"+salario+"\r\n");
						
						qtde++;
						somaSalarial = somaSalarial + salario;
						
						break;

					default:
						break;
					}

					linha = leitura.readLine();
				}
				escrita.write(qtde+";"+somaSalarial+"\r\n");
				
				file.close();
				leitura.close();
				escrita.close();
				fileW.close();
				
				if(maiorEstagiario == null) {
					throw new EstagiarioInexistenteException("Impossível definir o maior salário!!!");
				}
				
				System.out.println("Nome do estagiário com o maior salário: " + maiorEstagiario.getNome());

			} catch (IOException | EstagiarioInexistenteException e) {
				System.out.println(e.getMessage());
			}

		} finally {
			System.out.println("Processamento finalizado!!!");
		}
	}
}