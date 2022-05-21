
public class Aquatico extends Veiculo {
	private double horas;
	private double litros;
	
	@Override
	public double calculaConsumo() {
		double litros = this.getLitros() / this.getHoras();
		return litros;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}
}
