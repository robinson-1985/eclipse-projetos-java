public class Paciente extends Pessoa {
	private String tratamento;
	private Medico medico;
	private Consultorio cliente[];
	
	public String getTratamento() {
		return tratamento;
	}
	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Consultorio[] getCliente() {
		return cliente;
	}
	public void setCliente(Consultorio[] cliente) {
		this.cliente = cliente;
	}
}
