package br.edu.infnet.apppedido.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.core.io.ClassPathResource;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Pedido;
import br.edu.infnet.apppedido.model.domain.Sobremesa;
import br.edu.infnet.apppedido.model.domain.Solicitante;
import br.edu.infnet.apppedido.model.exceptions.ComidaSemIngredienteException;
import br.edu.infnet.apppedido.model.exceptions.MedidaZeradaOuNegativaException;
import br.edu.infnet.apppedido.model.exceptions.PorcaoZeradaException;
import br.edu.infnet.apppedido.model.exceptions.SobremesaSemAcompanhamentoException;

public class AppTeste {

	public static void main(String[] args) {

		String dir = System.getProperty("user.dir");
		String arq = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))+".txt";

		try {		
			try {
				InputStream resource = new ClassPathResource("static/pedidos.txt").getInputStream();

				FileWriter fileW = new FileWriter(dir + arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				BufferedReader leitura = new BufferedReader(new InputStreamReader(resource));

				String linha = leitura.readLine();

				while (linha != null) {

					String[] campos = linha.split(";");

					switch (campos[0].toUpperCase()) {
					case "0":
						Solicitante solicitanteP1 = new Solicitante(campos[2], campos[3], Integer.valueOf(campos[4]));

						Pedido p1 = new Pedido();
						p1.setDescricao(campos[1]);
						p1.setSolicitante(solicitanteP1);

						escrita.write(p1.obterPedido()+"\r\n");
						
						break;

					case "B":
						Bebida b1 = new Bebida(campos[1], Float.valueOf(campos[2]), "S".equalsIgnoreCase(campos[3]));
						b1.setGelada("S".equalsIgnoreCase(campos[4]));
						b1.setMarca(campos[5]);
						b1.setMedida(Float.valueOf(campos[6]));

						escrita.write(b1.obterProduto());

						break;

					case "C":
						Comida c1 = new Comida(campos[1], Float.valueOf(campos[2]), "S".equalsIgnoreCase(campos[3]));
						c1.setIngrediente(campos[4]);
						c1.setPorcao(Integer.valueOf(campos[5]));
						c1.setVegano("S".equalsIgnoreCase(campos[6]));

						escrita.write(c1.obterProduto());

						break;

					case "S":
						Sobremesa s1 = new Sobremesa(campos[1], Float.valueOf(campos[2]),
								"S".equalsIgnoreCase(campos[3]));
						s1.setAcompanhamento(campos[4]);
						s1.setIndividual("S".equalsIgnoreCase(campos[5]));
						s1.setTamanho(Integer.valueOf(campos[6]));

						escrita.write(s1.obterProduto());

						break;

					default:
						System.out.println("Entrada inválida!!!");
						break;
					}

					linha = leitura.readLine();
				}

				leitura.close();
				escrita.close();
				fileW.close();
			} catch (SobremesaSemAcompanhamentoException | ComidaSemIngredienteException | PorcaoZeradaException
					| MedidaZeradaOuNegativaException | IOException e) {
				System.out.println(e.getMessage());
			}

		} finally {
			System.out.println("Processamento finalizado: "+(dir + arq)+"!!!");
		}
	}
}