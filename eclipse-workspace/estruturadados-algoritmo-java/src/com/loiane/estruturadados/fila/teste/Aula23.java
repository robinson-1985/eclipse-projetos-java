package com.loiane.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<>();
		
		fila.add(1); // enfileirar(enqueue)
		fila.add(2);
		
		System.out.println(fila);
		
		System.out.println(fila.peek()); //espiar
		
		System.out.println(fila.remove()); //desenfileirar - desenqueue
		
		System.out.println(fila);
		
	}

}
