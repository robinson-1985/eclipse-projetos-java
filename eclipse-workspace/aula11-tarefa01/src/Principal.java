
public class Principal {
Email e;
Aluno a;
Curso c;

	public void entraDados() {
		e = new Email();
		e.setUsuario("adalberto@cer.com.br");
		e.setProvedor("Net.com");
		
		c = new Curso();
		c.setNome("Java do básico ao avançado!");
		c.setPreco(1500.00);
		
		a = new Aluno();
		a.setNome("Bruno dos Santos");
		a.setSalario(5000.00);
	}
	
	public void mostraDados() {
		System.out.println("Dados do Aluno");
		System.out.println("Nome         : " + a.getNome());
		System.out.println("Salario      : " + a.getSalario());
		
		System.out.println("Curso        : " + c.getNome());
		System.out.println("Preço        : " + c.getPreco());
		
		
		System.out.println("Curso        : " + e.getUsuario());
		System.out.println("Curso        : " + e.getProvedor());
		
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
}
