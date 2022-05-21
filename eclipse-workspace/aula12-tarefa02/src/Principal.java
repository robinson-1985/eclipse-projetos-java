
public class Principal {
Cliente c;
Pedido p;
Produto p1, p2, p3;

	public void entraDados() {
		 c = new Cliente();
		 c.setNome("José da Silva");
		 c.setEndereco("Rua das Magnólias, 718. Residencial das Primaveras");
		
		p1 = new Produto();
		p1.setNome("Detergente em pó");
		p1.setPreco(15.00);
		
		p2 = new Produto();
		p2.setNome("Amaciante de roupas");
		p2.setPreco(8.99);
		
		p3 = new Produto();
		p3.setNome("Desinfetante");
		p3.setPreco(11.00);
		
		Produto vetor[] = new Produto[3];
		vetor[0] = p1;
		vetor[1] = p2;
		vetor[2] = p3;
		
		p = new Pedido();
		p.setCliente(c);
		p.setNumero(10);
		p.setData("10/05/2022");
		p.setCliente(c);
		p.setProduto(vetor);
	}

	public void mostraDados() {
		System.out.println("Dados do Pedido");
		System.out.println("---------------------");
		System.out.println("	Número do pedido  : " + p.getNumero());
		System.out.println("       Data           : " + p.getData());
		System.out.println("     Cliente          : " + p.getCliente().getNome());
		System.out.println("     Endereço         : " + p.getCliente().getEndereco());
		System.out.println("      Produtos  : ");
			for(int i=0; i<3;i++) {
				System.out.println(" Nome do Produto  : " + p.getProduto()[i].getNome());
				System.out.println("	Preço R$      : " + p.getProduto()[i].getPreco());
		}
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
}
