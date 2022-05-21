package entities;

public class Engenheiro extends Profissional {
	private double preco;
	private double metragem;

	public double calculaPagamento() {
		double preco = this.getPreco() * this.getMetragem();
		return preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getMetragem() {
		return metragem;
	}

	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}
}
