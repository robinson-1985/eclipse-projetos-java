public class Consultorio {
	private String nome;
	private String endereco;
	private Medico locatario[];
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Medico[] getLocatario() {
		return locatario;
	}
	public void setLocatario(Medico[] locatario) {
		this.locatario = locatario;
	}
}
