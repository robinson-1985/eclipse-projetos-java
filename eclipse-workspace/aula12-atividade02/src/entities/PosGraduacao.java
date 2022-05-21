package entities;

public class PosGraduacao extends Estudante{
private double artigo;
private double seminario;
private double projeto;

	@Override
	public double calculaMedia() {
		double artigo = this.artigo*0.3 + this.projeto*0.4;
		return artigo;
	}

	public double getArtigo() {
		return artigo;
	}

	public void setArtigo(double artigo) {
		this.artigo = artigo;
	}

	public double getSeminario() {
		return seminario;
	}

	public void setSeminario(double seminario) {
		this.seminario = seminario;
	}

	public double getProjeto() {
		return projeto;
	}

	public void setProjeto(double projeto) {
		this.projeto = projeto;
	}
	
	


	
}
