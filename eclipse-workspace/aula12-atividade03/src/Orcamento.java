
public class Orcamento extends Documento{
	private int quantidade;
	private double unitario;
	
	@Override
	public double calculaTotal() {
		double quantidade = this.getQuantidade() * this.getUnitario();
		return quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getUnitario() {
		return unitario;
	}

	public void setUnitario(double unitario) {
		this.unitario = unitario;
	}
	
}
