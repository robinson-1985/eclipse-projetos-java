package entities;

public class Aluguel extends Imovel{
	private int meses;
	private double valor;
	
	@Override
	public double calculaValor() {
		double valor = this.getMeses() * this.getValor();
		return valor;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
