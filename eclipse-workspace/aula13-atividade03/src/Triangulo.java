
public class Triangulo implements Calculos{
	private double altura;
	private double base;
	
	@Override
	public double calculaArea() {
		double area = this.base*this.altura/2;
		return area;
	}
	@Override
	public double calculaPerimetro() {
		double perimetro = this.altura*2*base;
		return perimetro;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
}
