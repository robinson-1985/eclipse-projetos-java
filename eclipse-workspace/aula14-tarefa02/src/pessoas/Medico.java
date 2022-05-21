package pessoas;

public class Medico extends Bot{
	public String companhia;

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	@Override
	public double calculaVida() {
		double medico = (this.getSaude()*this.getForca())*0.12;
		return medico;
	}
}
