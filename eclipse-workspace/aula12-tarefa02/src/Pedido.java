
public class Pedido {
	private long numero;
	private String data;
	private Produto produto[];
	private Cliente cliente;
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Produto[] getProduto() {
		return produto;
	}
	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
