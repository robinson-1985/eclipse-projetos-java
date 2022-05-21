
public interface Rede {
	public String server="util.ecom.com";
	
	public abstract boolean envia(String mensagem);
	public abstract String recebe();
}
