package entities;

public class Advogado extends Profissional {
	private double custas;
	private double porcentagem;
	
	public double calculaPagamento() {
		double custas = this.getCustas() * this.getPorcentagem();
		return custas;
	}

	public double getCustas() {
		return custas;
	}

	public void setCustas(double custas) {
		this.custas = custas;
	}

	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
}
