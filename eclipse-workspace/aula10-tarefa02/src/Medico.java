public class Medico extends Pessoa{
	private long crm;
	
	private Consultorio consultorio;
	public long getCrm() {
		return crm;
	}
	public void setCrm(long crm) {
		this.crm = crm;
	}
	public Consultorio getConsultorio() {
		return consultorio;
	}
	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}
}
