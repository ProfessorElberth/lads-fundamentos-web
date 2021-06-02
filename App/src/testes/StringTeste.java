package testes;

public class StringTeste {

	public static void main(String[] args) {

//		Crie dois vetores: 
//		a) um de String com tamanho tr�s chamado "texto"; 
		String[] texto = new String[3];
//		b) outro de char preenchido com os caracteres do texto "Java-Developer"
		char[] javadev = {'J', 'a', 'v', 'a', ' ', 'D', 'e', 'v', 'e', 'l', 'o', 'p', 'e', 'r'};

//		Na primeira posi��o do vetor "texto" guarde um objeto utilizando o construtor padr�o de String. 		
		texto[0] = new String();
//		Na segunda posi��o utilize o construtor que receba o texto "Elberth Moraes".
		texto[1] = new String("Elberth Moraes");
//		Na terceira posi��o use o construtor que receba o vetor de char.
		texto[2] = new String(javadev);
		
//		Utilize diferentes estruturas de repeti��o para exibir o conte�do do vetor "texto".		
		System.out.println("FOREACH");
		for(String t : texto) {
			System.out.println("- " + t);
		}
		int i;
		
		System.out.println("FOR");
		for (i = 0; i < texto.length; i++) {
			System.out.println("- " + texto[i]);
		}
		
		System.out.println("WHILE");
		i = 0;
		while (i < texto.length) {
			System.out.println("- " + texto[i]);
			i++;			
		}
		
		System.out.println("DOWHILE");
		i = 0;
		do {
			System.out.println("- " + texto[i]);
			i++;			
		} while (i < texto.length);

//		Crie uma vari�vel chamada "nome" e fa�a ela receber a segunda posi��o do vetor "texto".
		String nome = texto[1];
		
//		Exiba na tela "Iguais" se a vari�vel for igual a posi��o do vetor; caso contr�rio, exiba "Diferentes". Use o comando "==" e um if...
		if (texto[1] == nome) {
			System.out.println("Iguais!!!");
		} else {
			System.out.println("Diferentes!!!");
		}
		
//		... e depois transforme num tern�rio.
		System.out.println(texto[1] == nome ? "Iguais!!!" : "Diferentes!!!");
		
//		Fa�a um syso da vari�vel "nome" e da posi��o do vetor. Perceberam...
		System.out.println(nome);
		System.out.println(texto[1]);
		
//		Agora mude o operador "==" para "equals" e revejam o resultado.
		if (texto[1].equals(nome)) {
			System.out.println("Iguais!!!");
		} else {
			System.out.println("Diferentes!!!");
		}
		
//		Utilize o m�todo "charAt" para exibir a primeira letra do seu sobrenome.
		System.out.println(nome.charAt(0));

//		Crie outra vari�vel chamada "nomeUp". Esta vari�vel deve receber o conte�do da vari�vel "nome", por�m transformado em letras mai�sculas.
		String nomeUp = nome.toUpperCase();
		
//		Utilize o m�todo "toUpperCase()" para transformar uma string em caixa alta (tamb�m tempos o m�todo toLowerCase para o oposto).
		String nomeLow = nome.toLowerCase();

//		Compare a vari�vel "nome" com a vari�vel "nomeUp" e exiba igual ou diferente. Usem o equals...
		System.out.println("nomeUp: " + nomeUp);
		System.out.println("nome: " + nome);
		System.out.println("nomeLow: " + nomeLow);

		if (nomeUp.equals(nomeLow)) {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}	
		
//		...e depois pensem na solu��o do equalsIgnoreCase.
		if (nomeUp.equalsIgnoreCase(nomeLow)) {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}	

//		Crie duas vari�veis: "oElberth" recebendo o seu nome com a letra "o" no final, e "aElberth" recebendo o seu nome com a letra "a" no final.
		String aElberth = nome+"a";
		String oElberth = nome+"o";
		
//		Exiba o resultado do m�todo "compareTo()" entre as duas vari�veis e perceba a ocorr�ncia do n�mero 14.	
		System.out.println("Diferente: " + aElberth.compareTo(oElberth));
		
//		Mude as �ltimas letras e veja as mudan�as. Utilize novas palavras.
		aElberth = nome+"a";
		oElberth = nome+"a";
		System.out.println("Igual: " + aElberth.compareTo(oElberth));
		
		String elberth = "elberth";
		String elcerth = "elbcrth";		
		System.out.println("Diferente: " + elberth.compareTo(elcerth));		

//		Vamos utilizar os m�todos "startsWith" e "endsWith" para verificar se o seu nome come�a e termina escrito de maneira correta.		
		System.out.println(nome);
		System.out.println("Come�a com Elb? " + nome.startsWith("Elb"));
		System.out.println("Termina com rth? " +nome.endsWith("rth"));
		
//		Vamos utilizar os m�todos "indexOf" e "lastIndexOf" para verificar a posi��o de uma letra no seu nome.
		System.out.println(nome.indexOf("erth"));
		System.out.println(nome.lastIndexOf("e"));
		
		//TODO Vamos utilizar o m�todo "substring" para recuperar tr�s letras do seu nome: informe o in�cio e o fim. Pode testar tamb�m informando at� o in�cio.
		
		//TODO Vamos utilizar o m�todo "concat" (e os demais m�todos aprendidos) para juntar a palavra "Professor" antes do nome; fa�a tamb�m para pegar o sobrenome e concatenar com a primeira letra do nome, assim: EMoraes.
		
		//TODO Coloque um espaco antes/depois do nome e um espaco antes/depois do sobrenome. Trabalhe na concatena��o e exiba o resultado. Agora utilize o m�todo "trim" para retirar os espa�os dos extremos.
	}
}