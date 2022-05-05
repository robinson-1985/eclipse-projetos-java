package pessoal.crm;

import pessoal.marketing.Cadastro;

public class Cliente extends Cadastro{
	private String email;
	private String fone;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
}
