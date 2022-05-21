package entities;

public class Medico  extends Profissional {
	private double consulta;
	private int dias;

	public double calculaPagamento() {
		double consulta = this.getConsulta() * this.getDias();
		return consulta;
	}

	public double getConsulta() {
		return consulta;
	}

	public void setConsulta(double consulta) {
		this.consulta = consulta;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
}
