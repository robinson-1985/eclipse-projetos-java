package entities;

public abstract class Produto {
	private long codigo;
	private String nome;
	private Fornecedor fornecedor[];
	
	public abstract double calculaPreco();
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Fornecedor[] getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor[] fornecedor) {
		this.fornecedor = fornecedor;
	}
}
