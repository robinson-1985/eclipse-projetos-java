
public abstract class Veiculo {
	private double valor;
	private int ano;
	
	public abstract double calculaConsumo();

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
