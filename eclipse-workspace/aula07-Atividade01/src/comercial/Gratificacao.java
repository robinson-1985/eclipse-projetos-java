package comercial;

import transportadora.frete.Carga;

public class Gratificacao extends Funcionario{
	private double comissao;
	private Carga carga;
	
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public Carga getCarga() {
		return carga;
	}
	public void setCarga(Carga carga) {
		this.carga = carga;
	}
}
