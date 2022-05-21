
public class Vendedor extends Funcionario{
private double comissao;

	public double calculaSalario() {
		double salario = this.getSalarioBase() + this.getComissao();
		return salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
