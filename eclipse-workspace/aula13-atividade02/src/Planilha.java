
public class Planilha implements Impressao{
	private int linhas;
	private int colunas;

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

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	
	

}
