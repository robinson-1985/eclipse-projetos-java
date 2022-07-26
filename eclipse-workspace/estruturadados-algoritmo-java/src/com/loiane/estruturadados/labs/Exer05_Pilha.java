package com.loiane.estruturadados.labs;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer05_Pilha {
	
	/* Escreva um programa que testa se uma sequência de caracteres fornecida pelo 
	   usuário é um palíndromo, ou seja, é uma palavra cuja primeira metade é 
	   simétrica à segunda metade. Veja alguns exemplos:
	   
	   -AABCCBAAA - sim
	   -ADDFDDA - sim
	   -ABFFBB - não*/

	public static void main(String[] args) {

		imprimeResultado("ADA");

		imprimeResultado("ABCD");

		imprimeResultado("ABCCBA");

		imprimeResultado("Maria");
		
		imprimeResultado("OVO");
		
		imprimeResultado("CUSCUZ");
	}

	public static void imprimeResultado(String palavra){
		System.out.println(palavra + " é palindromo? " + testaPalindromo(palavra));
	}

	public static boolean testaPalindromo(String palavra){

		Pilha<Character> pilha = new Pilha<Character>(); 

		for (int i=0; i<palavra.length(); i++){
			pilha.empilha(palavra.charAt(i));
		}

		String palavraInversa = "";
		while (!pilha.estaVazia()){
			palavraInversa += pilha.desempilha();
		}

		if (palavraInversa.equalsIgnoreCase(palavra)){
			return true;
		}

		return false;
	}

}
