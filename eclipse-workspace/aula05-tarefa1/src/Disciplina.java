
public class Disciplina {
	
	private String nome;
	private Disciplina disciplina;
	private Pratica pratica;
	private Teorica teorica;
	
	public Pratica getPratica() {
		return pratica;
	}

	public void setPratica(Pratica pratica) {
		this.pratica = pratica;
	}

	public Teorica getTeorica() {
		return teorica;
	}

	public void setTeorica(Teorica teorica) {
		this.teorica = teorica;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
}
