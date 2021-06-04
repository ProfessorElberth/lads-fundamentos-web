package testes;

import dominio.Empresa;

public class EmpresaTeste {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		empresa.setNome("pedro ÁLVARES cabral");
		
		empresa.imprimir();
	}
}