package testes;

public class StringTeste {

	public static void main(String[] args) {

//		Crie dois vetores: 
//		a) um de String com tamanho três chamado "texto"; 
		String[] texto = new String[3];
//		b) outro de char preenchido com os caracteres do texto "Java-Developer"
		char[] javadev = {'J', 'a', 'v', 'a', ' ', 'D', 'e', 'v', 'e', 'l', 'o', 'p', 'e', 'r'};

//		Na primeira posição do vetor "texto" guarde um objeto utilizando o construtor padrão de String. 		
		texto[0] = new String();
//		Na segunda posição utilize o construtor que receba o texto "Elberth Moraes".
		texto[1] = new String("Elberth Moraes");
//		Na terceira posição use o construtor que receba o vetor de char.
		texto[2] = new String(javadev);
		
//		Utilize diferentes estruturas de repetição para exibir o conteúdo do vetor "texto".		
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

//		Crie uma variável chamada "nome" e faça ela receber a segunda posição do vetor "texto".
		String nome = texto[1];
		
//		Exiba na tela "Iguais" se a variável for igual a posição do vetor; caso contrário, exiba "Diferentes". Use o comando "==" e um if...
		if (texto[1] == nome) {
			System.out.println("Iguais!!!");
		} else {
			System.out.println("Diferentes!!!");
		}
		
//		... e depois transforme num ternário.
		System.out.println(texto[1] == nome ? "Iguais!!!" : "Diferentes!!!");
		
//		Faça um syso da variável "nome" e da posição do vetor. Perceberam...
		System.out.println(nome);
		System.out.println(texto[1]);
		
//		Agora mude o operador "==" para "equals" e revejam o resultado.
		if (texto[1].equals(nome)) {
			System.out.println("Iguais!!!");
		} else {
			System.out.println("Diferentes!!!");
		}
		
//		Utilize o método "charAt" para exibir a primeira letra do seu sobrenome.
		System.out.println(nome.charAt(0));

//		Crie outra variável chamada "nomeUp". Esta variável deve receber o conteúdo da variável "nome", porém transformado em letras maiúsculas.
		String nomeUp = nome.toUpperCase();
		
//		Utilize o método "toUpperCase()" para transformar uma string em caixa alta (também tempos o método toLowerCase para o oposto).
		String nomeLow = nome.toLowerCase();

//		Compare a variável "nome" com a variável "nomeUp" e exiba igual ou diferente. Usem o equals...
		System.out.println("nomeUp: " + nomeUp);
		System.out.println("nome: " + nome);
		System.out.println("nomeLow: " + nomeLow);

		if (nomeUp.equals(nomeLow)) {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}	
		
//		...e depois pensem na solução do equalsIgnoreCase.
		if (nomeUp.equalsIgnoreCase(nomeLow)) {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}	

//		Crie duas variáveis: "oElberth" recebendo o seu nome com a letra "o" no final, e "aElberth" recebendo o seu nome com a letra "a" no final.
		String aElberth = nome+"a";
		String oElberth = nome+"o";
		
//		Exiba o resultado do método "compareTo()" entre as duas variáveis e perceba a ocorrência do número 14.	
		System.out.println("Diferente: " + aElberth.compareTo(oElberth));
		
//		Mude as últimas letras e veja as mudanças. Utilize novas palavras.
		aElberth = nome+"a";
		oElberth = nome+"a";
		System.out.println("Igual: " + aElberth.compareTo(oElberth));
		
		String elberth = "elberth";
		String elcerth = "elbcrth";		
		System.out.println("Diferente: " + elberth.compareTo(elcerth));		

//		Vamos utilizar os métodos "startsWith" e "endsWith" para verificar se o seu nome começa e termina escrito de maneira correta.		
		System.out.println(nome);
		System.out.println("Começa com Elb? " + nome.startsWith("Elb"));
		System.out.println("Termina com rth? " +nome.endsWith("rth"));
		
//		Vamos utilizar os métodos "indexOf" e "lastIndexOf" para verificar a posição de uma letra no seu nome.
		System.out.println(nome.indexOf("erth"));
		System.out.println(nome.lastIndexOf("e"));
		
		//TODO Vamos utilizar o método "substring" para recuperar três letras do seu nome: informe o início e o fim. Pode testar também informando até o início.
		
		//TODO Vamos utilizar o método "concat" (e os demais métodos aprendidos) para juntar a palavra "Professor" antes do nome; faça também para pegar o sobrenome e concatenar com a primeira letra do nome, assim: EMoraes.
		
		//TODO Coloque um espaco antes/depois do nome e um espaco antes/depois do sobrenome. Trabalhe na concatenação e exiba o resultado. Agora utilize o método "trim" para retirar os espaços dos extremos.
	}
}