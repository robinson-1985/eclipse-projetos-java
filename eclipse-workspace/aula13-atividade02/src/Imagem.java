
public class Imagem implements Impressao {
	private String formato;
	private long tamanho;

	@Override
	public void limpaBuffer() {
		
	}

	@Override
	public boolean enviaFila() {
		
		return true;
	}

	@Override
	public boolean obtemStatus() {
		
		return true;
	}

	@Override
	public int linhaAtual() {
		
		return 0;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public long getTamanho() {
		return tamanho;
	}

	public void setTamanho(long tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
