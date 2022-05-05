
public class Aluno {
	private long ra;
	private String nome;
	private Disciplina disciplina[];
	private Curso curso;
	
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
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
