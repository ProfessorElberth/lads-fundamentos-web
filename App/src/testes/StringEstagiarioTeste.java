package testes;

import java.util.Arrays;

import dominio.Estagiario;

public class StringEstagiarioTeste {

	public static void main(String[] args) {
		
//		Crie uma outra classe de teste chamada "StringEstagiarioTeste!". Essa classe vai receber via args a seguinte String: "elberth;42;1000;200;infnet".
//		Instanciar um estagiário e preencher com os campos da string.
		
		String[] estagiario = args[0].split(";");
		System.out.println(Arrays.asList(estagiario));

		Estagiario estag = new Estagiario();
		
		estag.setId(1);
		
		estag.setNome(estagiario[0]);
		
		estag.setIdade(Integer.valueOf(estagiario[1]));
		
		estag.setSalario(Float.valueOf(estagiario[2]));

		estag.setInstituicao(estagiario[4]);

		estag.setDesconto(Float.valueOf(estagiario[3]));
		
		estag.imprimir();
	}
}
