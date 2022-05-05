package salao;

import atendimento.bar.Cliente;

public class Mesa {
	private long mesa;
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getMesa() {
		return mesa;
	}

	public void setMesa(long mesa) {
		this.mesa = mesa;
	}
}
