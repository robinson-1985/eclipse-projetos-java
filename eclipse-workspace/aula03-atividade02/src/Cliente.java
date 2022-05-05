
public class Cliente extends Pessoa{
	
	private double saldo;
	private long conta;
	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setConta(long conta) {
		this.conta = conta;
	}

	public long getConta() {
		return conta;
	}
	
}
