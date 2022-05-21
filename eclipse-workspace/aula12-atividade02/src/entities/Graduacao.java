package entities;

public class Graduacao extends Estudante {
private double prova;
private double trabalho;

	@Override
	public double calculaMedia() {
		double prova = this.prova*0.6+this.trabalho*0.4;
		return prova;
	}

	public double getProva() {
		return prova;
	}

	public void setProva(double prova) {
		this.prova = prova;
	}

	public double getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}
}
