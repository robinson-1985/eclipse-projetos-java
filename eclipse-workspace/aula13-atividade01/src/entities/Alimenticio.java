package entities;

public class Alimenticio extends Produto {
	private double valor;
	private double peso;

	@Override
	public double calculaPreco() {
		double valor = this.getValor() * this.getPeso();
		return valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
