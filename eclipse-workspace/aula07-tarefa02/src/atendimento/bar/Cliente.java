package atendimento.bar;

import atendimento.Celular;
import atendimento.Pessoa;

public class Cliente extends Pessoa {
	private String rg;
	private Celular celular;

	public Celular getCelular() {
		return celular;
	}

	public void setCelular(Celular celular) {
		this.celular = celular;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
