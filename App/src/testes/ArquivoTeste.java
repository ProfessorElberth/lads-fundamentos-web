package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoTeste {

	public static void main(String[] args) {
		try {
			String dir = "c:/dev/";
			String arq = "alunos.txt";
	
			try {
				FileReader file = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(file);
				String linha = leitura.readLine();
				
				while(linha != null) {
					System.out.println(linha);
					
					linha = leitura.readLine();
				}
				file.close();
				leitura.close();
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		} finally {
			System.out.println("Processamento finalizado!!!");
		}
	}
}