package pessoas;

import recursos.Arma;

public class Soldado extends Bot{
	public String tropa;
	public Arma arma;
	
	public String getTropa() {
		return tropa;
	}
	public void setTropa(String tropa) {
		this.tropa = tropa;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	@Override
	public double calculaVida() {
		double soldado = (1/this.getSaude())+(1/this.getForca())*12;
		return soldado;
	}
}
