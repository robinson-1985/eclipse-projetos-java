package atendimento.bar;

import estoque.Bebidas;
import estoque.Comidas;
import salao.Mesa;

public class Pedido {
	private String data;
	private Cliente cliente;
	private Garcom garcom;
	private Mesa mesa;
	private Bebidas bebidas[];
	private Comidas comidas[];
	
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Garcom getGarcom() {
		return garcom;
	}
	public void setGarcom(Garcom garcom) {
		this.garcom = garcom;
	}
	public Bebidas[] getBebidas() {
		return bebidas;
	}
	public void setBebidas(Bebidas[] bebidas) {
		this.bebidas = bebidas;
	}
	public Comidas[] getComidas() {
		return comidas;
	}
	public void setComidas(Comidas[] comidas) {
		this.comidas = comidas;
	}
}
