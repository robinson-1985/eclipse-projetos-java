
public interface Impressao {
	public int linhas=180;
	
	public abstract void limpaBuffer();
	public abstract boolean enviaFila();
	public abstract boolean obtemStatus();
	public abstract int linhaAtual();
}
