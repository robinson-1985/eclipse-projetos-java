package compras;

import crm.Pessoa;

public class Fornecedor extends Pessoa{
	private String gerente;

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
}
