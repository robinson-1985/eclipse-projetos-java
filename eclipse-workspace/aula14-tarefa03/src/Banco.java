import java.util.ArrayList;

public interface Banco {
	public int driver=123456;
	
	public abstract boolean create(String dados);
	public abstract ArrayList<String> realAll();

}
