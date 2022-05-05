
public class Estacionamento {
	private String nome;
	private Veiculo cliente[];
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Veiculo[] getCliente() {
		return cliente;
	}
	public void setCliente(Veiculo[] cliente) {
		this.cliente = cliente;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
