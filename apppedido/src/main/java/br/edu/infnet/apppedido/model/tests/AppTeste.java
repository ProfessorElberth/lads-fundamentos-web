package br.edu.infnet.apppedido.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppTeste {

	public static void main(String[] args) {
		
		try {
			String dir = "c:/dev/";
			String arq = "pedidos.txt";
	
			try {
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				FileReader file = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();

				while(linha != null) {
					
					String[] campos = linha.split(";");

					if(campos.length == 3) {
						System.out.println("Pedido/Solicitante");
					} else {
						switch (campos[0].toUpperCase()) {
						case "B":
							System.out.println("Bebida");
							break;

						case "C":
							System.out.println("Comida");
							break;

						case "S":
							System.out.println("Sobremesa");
							break;
							
						default:
							System.out.println("Entrada inválida!!!");
							break;
						}
					}

					linha = leitura.readLine();
				}

				file.close();
				leitura.close();
				escrita.close();
				fileW.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		} finally {
			System.out.println("Processamento finalizado!!!");
		}		
	}
}