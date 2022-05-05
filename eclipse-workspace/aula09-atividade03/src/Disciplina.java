
public class Disciplina {
	private String nome;
	private long carga;
	private Bibliografia bibliografia;
	private Aluno aluno[];
	private Professor professor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCarga() {
		return carga;
	}
	public void setCarga(long carga) {
		this.carga = carga;
	}
	public Bibliografia getBibliografia() {
		return bibliografia;
	}
	public void setBibliografia(Bibliografia bibliografia) {
		this.bibliografia = bibliografia;
	}
	public Aluno[] getAluno() {
		return aluno;
	}
	public void setAluno(Aluno[] aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
