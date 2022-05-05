package secretaria;

public class Aluno {
	private long ra;
	private String nome;
	private Disciplina disciplina[];
	
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
	public Disciplina[] getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina[] disciplina) {
		this.disciplina = disciplina;
	}
	
	

}
