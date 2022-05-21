package aplication;

import entities.Advogado;
import entities.Engenheiro;
import entities.Medico;

public class Principal {
	
	Advogado a;
	Medico m;
	Engenheiro e;
	
	public void entraDados() {
		a = new Advogado();
		a.setNome("José do Patrocínio");
		a.setEndereco("Avenida 2. Centro - Araraquara");
		a.setCustas(30);
		
		m = new Medico();
		m.setNome("Felipe Bergamasco");
		m.setEndereco("Rua da Mesquita, 312. Centro - Jundiaí");
		m.setConsulta(300);
		
		e = new Engenheiro();
		e.setNome("Francisco Rezende");
		e.setEndereco("Avenida Central, 20. Bairro Recanto das Águas - Salto");
		e.setPreco(50);
	}
	
	public void mostraDados() {
		System.out.println("Dados do Escritório de Advocacia");
		System.out.println("--------------------------------");
		System.out.println("Nome do Advogado       : " + a.getNome());
		System.out.println("	Endereço       : " + a.getEndereco());
		System.out.println("Custas em %            : " + a.getCustas());
		
		System.out.println("Dados do Consultório Médico");
		System.out.println("--------------------------------");
		System.out.println("Nome do Médico         : " + m.getNome());
		System.out.println("	Endereço       : " + m.getEndereco());
		System.out.println("Preço da consulta      : " + m.getConsulta());
		
		System.out.println("Dados do Escritório de Engenharia");
		System.out.println("--------------------------------");
		System.out.println("Nome do Engenheiro     : " + e.getNome());
		System.out.println("    Endereço           : " + e.getEndereco());
		System.out.println("Preço por m²           : " + e.getPreco());
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}

}
