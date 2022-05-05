package porto;

import java.awt.Container;
import rh.Marinheiro;

public class Distrito {
	private String nome;
	private int ano;
	private Container container;
	private Marinheiro marinheiro[];
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Container getContainer() {
		return container;
	}
	public void setContainer(Container container) {
		this.container = container;
	}
	public Marinheiro[] getMarinheiro() {
		return marinheiro;
	}
	public void setMarinheiro(Marinheiro[] marinheiro) {
		this.marinheiro = marinheiro;
	}
}
