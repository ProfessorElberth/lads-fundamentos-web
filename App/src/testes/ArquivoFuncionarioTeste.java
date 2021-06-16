package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import exceptions.ArquivoCorrompidoException;

public class ArquivoFuncionarioTeste {

	public static void main(String[] args) {
		try {
			try {
				FileReader file = new FileReader("c:/dev/out_alunos.txt");
				BufferedReader leitura = new BufferedReader(file);

				String linha = leitura.readLine();
				
				String[] mensagens = new String[9];
				
				int qtde = 0;
				float somaSalarial = 0;				
				int qtdeTotal = 0;
				float salarioTotal = 0;
				
				while(linha != null) {
					String[] campos = linha.split(";");

					try {
						qtdeTotal = Integer.valueOf(campos[0]);
						salarioTotal = Float.valueOf(campos[1]);

					} catch (NumberFormatException e) {
						String nome = campos[0];
						float salario = Float.valueOf(campos[1]);
						mensagens[qtde] = String.format("O funcionário %s recebe R$%.2f", nome, salario);

						qtde++;
						somaSalarial = somaSalarial + salario;
					}

					linha = leitura.readLine();
				}			
				leitura.close();
				file.close();
				
				if(qtdeTotal != qtde || salarioTotal != somaSalarial) {
					throw new ArquivoCorrompidoException("Arquivo corrompido");
				}
				
				for (int i = 0; i < qtde; i++) {
					System.out.println(mensagens[i]);
				}
				
				System.out.println("#qtde: " + qtdeTotal);
				System.out.println("#somaSalarial: " + salarioTotal);
				System.out.println("#media: " + (salarioTotal / qtdeTotal));

			} catch (IOException | ArquivoCorrompidoException e) {
				System.out.println(e.getMessage());
			}
		} finally {
			System.out.println("Processamento finalizado com sucesso!!!");
		}
	}
}