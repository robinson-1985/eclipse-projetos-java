
public abstract class Usuario {
	private String username;
	private String password;
	
	public abstract void gravaCookie(String dados);
	public abstract String leCookie();
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
