import java.util.ArrayList;

public class Internauta extends Usuario implements Sessao, Login, Rede, Banco, Seguranca{
	private String email;
	private Internauta indicacao;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Internauta getIndicacao() {
		return indicacao;
	}
	public void setIndicacao(Internauta indicacao) {
		this.indicacao = indicacao;
	}
	public Internauta(String email, Internauta indicacao) {
		super();
		this.email = email;
		this.indicacao = indicacao;
	}
	@Override
	public void gravaCookie(String dados) {
			
	}
	@Override
	public String leCookie() {
		return null;
	}
	@Override
	public boolean create(String dados) {
		return false;
	}
	@Override
	public ArrayList<String> realAll() {
		return null;
	}
	@Override
	public boolean envia(String mensagem) {
		return true;
	}
	@Override
	public String recebe() {
		return null;
	}
	@Override
	public boolean entrar() {
		return true;
	}
	@Override
	public void sair() {
		
	}
	@Override
	public void grava(String dados) {
		
	}
	@Override
	public String le() {
		return null;
	}
}
