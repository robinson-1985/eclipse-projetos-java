package entities;

public class Eletronico extends Produto {
	private double custo;
	private int unidades;
	
	@Override
	public double calculaPreco() {
		double custo = this.getCusto() * this.getUnidades();
		return custo;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	

	
	

}
