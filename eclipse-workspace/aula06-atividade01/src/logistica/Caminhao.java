package logistica;

import vendas.Carga;

public class Caminhao {
	private String placa;
	private double valor;
	private Carga carga[];
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Carga[] getCarga() {
		return carga;
	}
	public void setCarga(Carga[] carga) {
		this.carga = carga;
	}
}
