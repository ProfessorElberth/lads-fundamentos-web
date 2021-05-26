package testes;

import dominio.Administrativo;

public class AdministrativoTeste {

	public static void main(String[] args) {
		
		Administrativo adm1 = new Administrativo();
		adm1.setBonus(1000);
		adm1.setDesconto(100);
		adm1.setIdade(10);
		adm1.setNome("elberth");
		adm1.setSalario(1000);
		adm1.exibir();
		
		Administrativo adm2 = new Administrativo("elberth", 10);
		adm2.setBonus(1000);
		adm2.setDesconto(100);
		adm2.setSalario(1000);
		adm2.exibir();
	}
}