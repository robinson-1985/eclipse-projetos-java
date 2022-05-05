
public class Aluno {
	private long ra;
	private String nome;
	private Email email[];
	private Endereco endereco[];
	
	public long getRa() {
		return ra;
	}
	public void setRa(long ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Email[] getEmail() {
		return email;
	}
	public void setEmail(Email[] email) {
		this.email = email;
	}
	public Endereco[] getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco[] endereco) {
		this.endereco = endereco;
	}
	
}
