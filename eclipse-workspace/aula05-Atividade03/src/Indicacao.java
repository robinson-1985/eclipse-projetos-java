public class Indicacao {
	private String data;
	private double brinde;
	private Cliente cliente[];
	private Funcionario funcionario;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getBrinde() {
		return brinde;
	}
	public void setBrinde(double brinde) {
		this.brinde = brinde;
	}
	public Cliente[] getCliente() {
		return cliente;
	}
	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
