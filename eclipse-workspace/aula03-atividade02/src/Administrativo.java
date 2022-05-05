
public class Administrativo extends Funcionario{
	private long horario;
	private String departamento;
	
	public void setHorario(long horario) {
		this.horario = horario;
	}
	
	public long getHorario() {
		return horario;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
}
