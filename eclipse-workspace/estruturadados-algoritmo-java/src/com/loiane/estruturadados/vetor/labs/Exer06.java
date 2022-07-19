package com.loiane.estruturadados.vetor.labs;

import java.util.Scanner;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;


public class Exer06 {

	public static void main(String[] args) {
		/* Exercício 06 - Utilize a classe Lista ou vetor e classe Contato (criada durantes as
		 aulas) e desenvolva os seguintes ites:
		 1. Crie um vetor com capacidade para 20 contatos;
		 2. Insira 30 contatos no vetor (isso é possível ser feito através de um loop);
		 Crie um exemplo para utilizar cada método da classe Lista. */
		
		// criação das variáveis 
		Scanner scan = new Scanner(System.in);
		
		// criar vetor com 20 de capacidade
		Lista<Contato> lista = new Lista<Contato>(20);
		
		// criar e adicionar 30 contatos
		// criarContatosDinamicamente(30, lista);
		
		// criar um menu para que o usuário escolha a opção
		int opcao = 1;
		
		while (opcao != 0) {
		
			opcao = obterOpcaoMenu(scan);
			
			
		
		}
		
		System.out.println("Usuário digitou 0. Programa terminado.");
	}
	
	private static int obterOpcaoMenu(Scanner scan) {
		
		boolean entradaValida = false;
		int opcao = 0;
		String entrada;
		
		while(!entradaValida) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição específica");
			System.out.println("3: Obtém contato de uma posição específica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta último índice do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: excluir por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica o tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");
			
			try {
				

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if(opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					System.out.println("Entrada inválida. Digite novamente.");
					// throw new Exception(); -segunda alternativa
				}
				
			} catch (Exception e) {
				
				System.out.println("Entrada inválida. Digite novamente.");
				
			}
			
			
			
		}
		
		return opcao;
	}
	
	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
		
		Contato contato;
		
		for (int i=1; i<=quantidade; i++) {
			
			contato = new Contato();
			contato.setNome("Contato " +  i);
			contato.setTelefone("111111111" + i);
			contato.setEmail("contato" + i + "@email.com");
			
			lista.adiciona(contato);
		}
	}

}
