package crm.relacionamento;

import comercio.vendas.Produto;

public class Pessoa {
	private String nome;
	private Produto produto[];
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Produto[] getProduto() {
		return produto;
	}
	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}
}
