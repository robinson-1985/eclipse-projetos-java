
public class Orcamento {
	private long numero;
	private String data;
	private Peca peca[];
	private Servico servico[];
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Peca[] getPeca() {
		return peca;
	}
	public void setPeca(Peca[] peca) {
		this.peca = peca;
	}
	public Servico[] getServico() {
		return servico;
	}
	public void setServico(Servico[] servico) {
		this.servico = servico;
	}
}
