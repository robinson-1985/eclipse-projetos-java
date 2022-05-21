
public class NotaFiscal extends Documento{
	private double icms;
	private double valor;

	@Override
	public double calculaTotal() {
		double valor =  this.getValor() + this.getIcms()*this.getValor();
		return valor;
	}

	public double getIcms() {
		return icms;
	}

	public void setIcms(double icms) {
		this.icms = icms;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
