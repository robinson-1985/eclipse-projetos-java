
public class Duplicata extends Documento{
	private double valor;
	private int atraso;
	private double multa;
	
	@Override
	public double calculaTotal() {
		double valor = (this.valor + this.atraso) * this.multa;
		return valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getAtraso() {
		return atraso;
	}

	public void setAtraso(int atraso) {
		this.atraso = atraso;
	}

	public double getMulta() {
		return multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}
}
