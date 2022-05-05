
public class Principal {
Vendedor v;
Gerente g;

	public void entraDados() {
		v = new Vendedor();
		v.setNome("Margarete Thao");
		v.setCtps("23456897822");
		v.setSalario(1600.00);
		v.setComissao(100.00);
		
		g = new Gerente();
		g.setNome("Judith Sterlinger");
		g.setSalario(4000.00);
		g.setAdicional(40.00);
		
}
	
	public void mostraDados() {
		System.out.println("Funcionário               : ");
		System.out.println("Nome                      : " + v.getNome());
		System.out.println("CTPS                      : " + v.getCtps());
		System.out.println("Salario                   : " + v.getSalario());
		System.out.println("Comissão por porcentagem  : " + v.getComissao());
		
		System.out.println("Gerente               : ");
		System.out.println("Nome                 : " + g.getNome());
		System.out.println("Salario              : " + g.getSalario());
		System.out.println("Adicional percentual : " + g.getAdicional());
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}

}
