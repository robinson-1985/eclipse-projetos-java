package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;
	
	// De preferência utilizar sempre essa solução
	public Lista(int capacidade) {
		this.elementos = (T[])new Object[capacidade]; // solução do livro Java Efetivo.
		this.tamanho = 0;
	}
	
	// Essa é a segunda solução.
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	

	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length){

			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	// 0 1 2 3 4 5 6 = tamanho é 5
	// B C E F G + +
	//

	public boolean adiciona(int posicao, T elemento) {
		if(!(posicao >= 0 && posicao < tamanho )) {
			throw new IllegalArgumentException("Posição inválida!");
		}

		this.aumentaCapacidade();

		// mover todos os elementos:
		for(int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	//*************************************************************
	
	/* Exercício 04 - Melhore a classe Lista e implemente o método obtem(int posicao),
	 onde será possóvel obter o elemento dada uma posição do vetor. Esse método é 
	 semelhante ao método get(int posicao) da classe ArrayList. */
	
	public T obtem(int posicao) {
		return this.busca(posicao);
	}

	public T busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho )) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.elementos[posicao];

	}

	public int busca(T elemento) {
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	// ****************************************************
	// Exercício 2:
	
	public int ultimoIndice(T elemento) {
		
		for(int i=this.tamanho-1; i>=0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	// ******************************************************
	
	/* Exercício 1: Melhore a classe Lista e implemente o método contém, semelhante ao 
	 método contains da classe ArrayList: */
	
	public boolean contem(T elemento) {
		
		/*int pos = busca(elemento);
		if(pos > -1) {
			return true;
		}
		
		return false;   forma mais rebuscada*/
		
		return busca(elemento) > -1; //>=0 forma mais simples
	}

	//*********************************************************
	
	// Método remove:
	// B G D E F -> posição a ser removida é o 1 (G)
	// 0 1 2 3 4 -> tamanho é 5
	// vetor[1] = vetor[2]
	// vetor[2] = vetor[3]
	// vetor[3] = vetor[4]
	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho )) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	/*Exercício 03 - Melhore a classe Lista e implemente o método remove(T elemento),
	 onde será possível remover um elemento da lista passando ele como parâmetro.*/
	
	public void remove(T elemento) {
		int pos = this.busca(elemento);
		if(pos > -1) {
			this.remove(pos);
		}
	}
	
	/* Exercício 05 - Melhore a classe Lista e implemente o método limpar, onde
	 todos os elementos da lista são removidos. Esse método é semelhante ao método 
	 clear da classe ArrayList.*/
	
	public void limpar() {
		
		// opção1
		// this.elementos = (T[]) new Object[this.elementos.length];
		
		// opção2
		// this.tamanho = 0;
		
		// opção3
		for(int i=0; i<this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	//************************************************************
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}

		s.append("]");

		return s.toString();
	}
}
