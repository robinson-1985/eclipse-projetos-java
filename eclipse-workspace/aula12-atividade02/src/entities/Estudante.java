package entities;

public abstract class Estudante {
	
	private long ra;
	private String nome;
	
	public abstract double calculaMedia(); 
		
	public long getRa() {
		return ra;
	}

	public void setRa(long ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
