
public class Principal {
Caminhao c;
Motorista m;
Carga c1, c2, c3;

	public void entraDados() {
			m = new Motorista();
			m.setCnh(123455);
			m.setNome("Charlie Brown");
			
			c1 = new Carga();
			c1.setNumero(112);
			c1.setValor(11000);
			
			c2 = new Carga();
			c2.setNumero(113);
			c2.setValor(3900);
			
			c3 = new Carga();
			c3.setNumero(114);
			c3.setValor(6200);
			
			Carga vetor[] = new Carga[3];
			vetor[0] = c1;
			vetor[1] = c2;
			vetor[2] = c3;
			
			c = new Caminhao();
			c.setPlaca("BMO3920");
			c.setMotorista(m);
			c.setCarga(vetor);
	}

	public void mostraDados() {
		System.out.println("Caminhão e seus dados");
		System.out.println("---------------------");
		System.out.println("Placa             : " + c.getPlaca());
		System.out.println("Eixos             : " + c.getEixos());
		System.out.println("   Motorista CNH  : " + c.getMotorista().getCnh());
		System.out.println("   Motorista Nome : " + c.getMotorista().getNome());
		for(int i=0; i<3; i++) {
			System.out.println("	Carga Numero   : "+ c.getCarga()[i].getNumero());
			System.out.println("	Valor R$       : " + c.getCarga()[i].getValor());
		}
		
	}

	public static void main(String[] args) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}

}
