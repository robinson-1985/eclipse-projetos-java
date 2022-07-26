package com.loiane.estruturadados.labs;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer06_Pilha {

public static void main(String[] args) {
	
	/* Escreva um programa para verificar se uma expressão matemática tem os
	   parênteses agrupados de forma correta, isto é:
	   (1) se o número de parênteses à esquerda e à direita são iguais e:
	   (2) se todo parêntese aberto é seguido porteriormente por um fechamento
	   de parêntese.
	   
	   Exemplos:
	   
	   - As expressões ((A+B) ou A+B( violam a condição 1
	   - As expressões )A+B(-Cou(A+B))-(C+D violam a condição 2
	   - A expressão ((A+B)+D) está ok.*/
		
		imprimeResultado("A + B");
		imprimeResultado("A + B + (C - D)");
		imprimeResultado("{[()]}[](){()}");
		imprimeResultado("{[(]}[](){()}");
		imprimeResultado("A + B + C - D)");
		imprimeResultado("[)A");
	}
	
	public static void imprimeResultado(String expressao){
		System.out.println(expressao + " está balanceado? " + 
				verificaSimbolosBalanceados(expressao));
	}
	
	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	public static boolean verificaSimbolosBalanceados(String expressao){
		
		Pilha<Character> pilha = new Pilha<Character>();
		int index = 0;
		char simbolo, topo;
		
		while (index < expressao.length()){
			simbolo = expressao.charAt(index);
			
			if (ABRE.indexOf(simbolo) > -1){
				pilha.empilha(simbolo);
				
			} else if (FECHA.indexOf(simbolo) > -1){
				
				if (pilha.estaVazia()){
					return false;
				} else {
					topo = pilha.desempilha();
					
					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
						return false;
					}
				}
			}
			
			index++;
		}
		
		return pilha.estaVazia();
	}

}
