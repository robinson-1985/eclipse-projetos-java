package pessoas;

public class Capelao extends Bot{
	private String religiao;

	public String getReligiao() {
		return religiao;
	}

	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}

	@Override
	public double calculaVida() {
		double religiao = (this.getSaude() / this.getForca())* 1.10;
		return religiao;
	}
}
