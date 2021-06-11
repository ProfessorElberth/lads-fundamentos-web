package testes;

import dominio.Empresa;
import exceptions.FaturamentoNegativoException;
import exceptions.NomeIncompletoException;

public class EmpresaTeste {

	public static void main(String[] args) {
		
		try {

			try {
				Empresa emp1 = new Empresa();		
				emp1.setNome("pedro ÁLVARES cabral");
				emp1.setFaturamento(1000);
				emp1.imprimir();
	
			} catch (NomeIncompletoException | FaturamentoNegativoException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				Empresa emp2 = new Empresa();		
				emp2.setNome("pedro cabral");
				emp2.setFaturamento(-100);
				emp2.imprimir();
			} catch (NomeIncompletoException | FaturamentoNegativoException e) {
				System.out.println(e.getMessage());
			}
		
			try {
				Empresa emp3 = new Empresa();
				emp3.setFaturamento(3000);
				emp3.imprimir();
			} catch (NomeIncompletoException | FaturamentoNegativoException e) {
				System.out.println(e.getMessage());
			}
			
		} finally {
			System.out.println("Finalizamos esta parte!!!");
		}
	}
}