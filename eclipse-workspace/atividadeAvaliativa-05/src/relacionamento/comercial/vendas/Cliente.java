package relacionamento.comercial.vendas;

import cadastros.internet.Email;

public class Cliente {
	private long numero;
	private double total;
	private Email email[];
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Email[] getEmail() {
		return email;
	}
	public void setEmail(Email[] email) {
		this.email = email;
	}
}
