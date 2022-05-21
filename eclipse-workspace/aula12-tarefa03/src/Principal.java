
public class Principal {
Orcamento o;
Peca p1, p2, p3;
Servico s1, s2, s3;

	public void entraDados() {
			p1 = new Peca();
			p1.setNome("Retentor");
			p1.setPreco(200);
			
			p2 = new Peca();
			p2.setNome("Buchas da balança");
			p2.setPreco(58);
			
			p3 = new Peca();
			p3.setNome("Virabrequin");
			p3.setPreco(320);
			
			Peca vetorx[] = new Peca[3];
			vetorx[0] = p1;
			vetorx[1] = p2;
			vetorx[2] = p3;
			
			s1 = new Servico();
			s1.setNome("Reparo");
			s1.setPreco("100");
			
			s2 = new Servico();
			s2.setNome("Troca");
			s2.setPreco("90");
			
			s3 = new Servico();
			s3.setNome("Fresagem");
			s3.setPreco("150");
			
			Servico vetory[] = new Servico[3];
			vetory[0] = s1;
			vetory[1] = s2;
			vetory[2] = s3;
			
			o = new Orcamento();
			o.setNumero(01);
			o.setData("12/05/22");
			o.setServico(vetory);
			o.setPeca(vetorx);
			
	}

	public void mostraDados() {
		System.out.println("Dados do Orçamento");
		System.out.println("---------------------");
		System.out.println(" Número   : " + o.getNumero());
		System.out.println("  Data    : " + o.getData());
		System.out.println("   Peça   : ");
		for(int i=0; i<3; i++) {
			System.out.println("Nome      : " + o.getPeca()[i].getNome() );
			System.out.println("Valor     : R$ " + o.getPeca()[i].getPreco());
		}
		System.out.println("  Serviços: ");
		for(int i=0; i<3; i++) {
			System.out.println("Serviços : " + o.getServico()[i].getNome());
			System.out.println("Valor R$ : " + o.getServico()[i].getPreco());
		}
	}

	public static void main(String[] args) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}

}
