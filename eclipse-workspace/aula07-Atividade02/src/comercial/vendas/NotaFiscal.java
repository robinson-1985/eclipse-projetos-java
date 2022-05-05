package comercial.vendas;

import comercial.loja.Peca;
import pessoal.crm.Cliente;
import pessoal.crm.Vendedor;

public class NotaFiscal {
	private long id;
	private String data;
	private double total;
	private Peca peca[];
	private Cliente cliente;
	private Vendedor vendedor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Peca[] getPeca() {
		return peca;
	}
	public void setPeca(Peca[] peca) {
		this.peca = peca;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
}
