
public class Terrestre extends Veiculo  {
	private double km;
	private double litros;
	
	@Override
	public double calculaConsumo() {
		double litros = this.getLitros() / this.getKm();
		return litros;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}
}
