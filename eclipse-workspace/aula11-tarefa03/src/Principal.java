
public class Principal {
Aluno a;
Professor p;

	public void entraDados() {
		p = new Professor();
		p.setNome("Augusto Dias");
		p.setTitulacao("Doutor");
		
		a = new Aluno();
		a.setNome("Raul Gazzolla");
		a.setRa(123456);
		
}
	
	public void mostraDados() {
		System.out.println("Nome do professor: " + p.getNome());
		System.out.println("Titulação        : " + p.getTitulacao());
		
		System.out.println("Nome do aluno: " + a.getNome());
		System.out.println("Nome do aluno: " + a.getRa());
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
}
