
public class Principal {
Aluno a;
Curso c;
Disciplina d1, d2, d3;
	
	public void entraDados() {
		d1 = new Disciplina();
		d1.setNome("Introdução à Lógica");
		d1.setNumero(01);
		
		d2 = new Disciplina();
		d2.setNome("Pensamento Computacional");
		d2.setNumero(02);
		
		d3 = new Disciplina();
		d3.setNome("Linguagens e símbolos");
		d3.setNumero(03);
		
		Disciplina vetor[] = new Disciplina[3];
		vetor[0] = d1;
		vetor[1] = d2;
		vetor[2] = d3;
		
		c = new Curso();
		c.setNome("Sistemas de Informação");
		c.setProfessor("Francisco dos Santos");

		a = new Aluno();
		a.setNome("Robinson Dias");;
		a.setRa(0202056);
		a.setDisciplina(vetor);
		a.setCurso(c);
	}		
		

	public void mostraDados() {
		System.out.println("O curso e seus dados");
		System.out.println("---------------------");
		System.out.println("	Nome do curso      : " + a.getCurso().getNome());
		System.out.println("       Aluno           : " + a.getNome());
		System.out.println("    RA Aluno           : " + a.getRa());
		System.out.println("    Disciplinas - " );
		
		for(int i=0; i<3; i++) {
			System.out.println("	Curso          : "+ a.getDisciplina()[i].getNome());
		}
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}

}
