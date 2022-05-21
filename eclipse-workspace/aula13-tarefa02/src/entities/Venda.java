package entities;

public class Venda extends Imovel {
	private double m2;
	private double custo;
	
	@Override
	public double calculaValor() {
		double custo = this.getM2() * this.getCusto();
		return custo;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
}
