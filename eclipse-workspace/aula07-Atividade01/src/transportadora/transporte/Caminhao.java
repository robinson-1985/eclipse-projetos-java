package transportadora.transporte;

import comercial.Categoria;
import transportadora.frete.Carga;

public class Caminhao {
	private String placa;
	private String modelo;
	private long chassi;
	private Carga carga[];
	private Categoria categoria;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public long getChassi() {
		return chassi;
	}
	public void setChassi(long chassi) {
		this.chassi = chassi;
	}
	public Carga[] getCarga() {
		return carga;
	}
	public void setCarga(Carga[] carga) {
		this.carga = carga;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
