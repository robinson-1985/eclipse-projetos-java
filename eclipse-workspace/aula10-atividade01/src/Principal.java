
public class Principal {
Motorista m;
Acessorio a;
	
	public void entraDados() {
		// instanciar (reservar memória)
		m = new Motorista();
		// atribuir valores para CNH e NOME
		m.setCnh(1234567);
		m.setNome("Cleiton de Barros Coutinho");
		
		a = new Acessorio();
		a.setNome("DVD-player");
		a.setPreco(450);
	}
	
	public void mostraDados() {
		System.out.println("___________________");
		System.out.println("CNH: " +  m.getCnh());
		System.out.println("Nome: " + m.getNome());
		System.out.println("___________________");
		
		System.out.println("___________________");
		System.out.println("DVD-player" + a.getNome());
		System.out.println("450" + a.getPreco());
		System.out.println("___________________");
		
	}
	
	public static void main(String args[]) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}

}
