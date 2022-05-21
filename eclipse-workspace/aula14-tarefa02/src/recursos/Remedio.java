package recursos;

import pessoas.Medico;

public class Remedio {
	private String nome;
	private String formula;
	private double cura;
	private Medico medico;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public double getCura() {
		return cura;
	}
	public void setCura(double cura) {
		this.cura = cura;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
}
