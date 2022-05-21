
public class Quadrado implements Calculos {
	private double lado;
	

	@Override
	public double calculaArea() {
		double area = this.getLado()*this.getLado();
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = this.getLado()*4;
		return perimetro;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
}
