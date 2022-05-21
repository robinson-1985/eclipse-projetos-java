
package aplication;

import entities.Aluguel;
import entities.Venda;

public class Principal {
	Aluguel a;
	Venda v;
	
	public void entraDados() {
		a = new Aluguel();
		a.setValor(1500);
		a.setMeses(12);
		a.setEndereco("Rua das Magnólias, 520. Jardim Esperança - São Paulo");
		
		v = new Venda();
		v.setCusto(300000);
		v.setM2(150);
		v.setEndereco("Rua das Magnólias, 520. Jardim Esperança - São Paulo");
		v.setMetragem(220);
	}
	
	
	public void mostraDados() {
		System.out.println("Dados do Imóvel");
		System.out.println("---------------------");
		System.out.println("	Endereço           : " + a.getEndereco());
		System.out.println(" Valor de aluguel mensal   : " + a.getValor());
		System.out.println(" Contrato mínimo em meses  : " + a.getMeses());
		System.out.println("     Valor de venda        : " + v.getCusto());
		System.out.println(" Metragem do imóvel        : " + v.getM2());
		System.out.println(" Valor em m² do terreno    : " + v.getMetragem());
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
}
