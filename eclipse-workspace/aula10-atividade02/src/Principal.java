
public class Principal {
Funcionario f;
Endereco e;
Empresa emp;
	
	public void entraDados() {
		e = new Endereco();
		e.setRua("Rua das Flores");
		e.setNumero(928);
		
		emp = new Empresa();
		emp.setNome("Farmacia Brasil Ltda");
		
		f = new Funcionario();
		
		f.setNome("Carlos Eduardo dos Santos");
		f.setSalario(4900.00);
		f.setEndereco(e);
		f.setEmpresa(emp);
	}
	
	public void mostraDados() {
		System.out.println("Dados de Funcionario");
		System.out.println("Nome          : " + f.getNome());
		System.out.println("Salario       : " + f.getSalario());
		System.out.println("Nome Empresa  : " + f.getEmpresa().getNome());
		System.out.println("Endereco Rua  : " + f.getEndereco().getRua());
		System.out.println("Endereco Num. : " + f.getEndereco().getNumero());
		
	}

	public static void main(String[] args) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();

	}
}
