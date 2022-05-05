
public class Principal {
Veiculo v;
Motorista m;
Estacionamento e;

	public void entraDados() {
		v = new Veiculo();
		v.setCor("Azul cobalto");
		
		m = new Motorista();
		m.setNome("José de Almeida Sampaio");
		m.setCnh(123);
		
		e = new Estacionamento();
		e.setNome("Estacione Bem");
		e.setEndereco("Avenida Benjamin Constant, 321. Vila Nova - Jaú");
		
	}
	
	public void mostraDados() {
		System.out.println("Nome do Estacionamento: " + e.getNome());
		System.out.println("Endereço              : " + e.getEndereco());
		
		System.out.println("Nome do Veículo       : " + v.getCor());
		
		System.out.println("Nome do Motorista      :" + m.getNome());
		System.out.println("Número da CNH          :" + m.getCnh());
		
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
}
