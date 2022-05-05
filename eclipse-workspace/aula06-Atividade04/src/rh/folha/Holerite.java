package rh.folha;

import rh.pessoal.Funcionario;

public class Holerite {
	private long ctps;
	private String nome;
	private double salario;
	private Funcionario funcionario[];
	
	public long getCtps() {
		return ctps;
	}
	public void setCtps(long ctps) {
		this.ctps = ctps;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Funcionario[] getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionario = funcionario;
	}
}
