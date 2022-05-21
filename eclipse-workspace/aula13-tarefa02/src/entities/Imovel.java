package entities;

public abstract class Imovel {
	private String endereco;
	private double metragem;
	
	public abstract double calculaValor();

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getMetragem() {
		return metragem;
	}

	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}
}
