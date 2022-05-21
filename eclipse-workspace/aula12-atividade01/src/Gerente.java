
public class Gerente extends Funcionario{
private double adicional;

	public double calculaSalario() {
		double salario = this.getSalarioBase() + this.getAdicional();
		return salario;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
}
