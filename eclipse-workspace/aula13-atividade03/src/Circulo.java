
public class Circulo implements Calculos{
	private double raio;
	private double circunferencia;

	@Override
	public double calculaArea() {
		double area = Calculos.pi*this.raio*this.raio;
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = 2*Calculos.pi*this.raio;
		return perimetro;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}
	
	

}
