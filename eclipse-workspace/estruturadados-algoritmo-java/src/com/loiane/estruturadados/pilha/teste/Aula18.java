package com.loiane.estruturadados.pilha.teste;

import java.util.Stack;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(1); // push = empilha
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty()); // Vazio
		System.out.println(stack.size()); //Tamanho
		System.out.println(stack); //Método toString
		
		System.out.println(stack.peek()); //espiar-verificar
		
		System.out.println(stack.pop()); //desempilha
		
		System.out.println(stack); //Método toString
		
		
	}

}
