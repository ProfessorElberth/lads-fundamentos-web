package testes;

import dominio.Programador;

public class ProgramadorTeste {

	public static void main(String[] args) {
		
		Programador progC = new Programador();
		progC.setFullStack(true);
		progC.setLinguagem("c");
		progC.setSalario(1000);
		System.out.println(progC + " - " + progC.getIdade());
		
		Programador progJava = new Programador("zezinho", 10);
		progJava.setFullStack(false);
		progJava.setLinguagem("java");
		progJava.setSalario(999);		
		System.out.println(progJava);
	
		Programador progJS = new Programador("huguinho", 20, 99, true, "JS");
		progJS.exibir();
	}
}