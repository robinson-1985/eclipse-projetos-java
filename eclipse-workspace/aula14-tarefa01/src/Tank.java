
public class Tank implements Movimenta{
	private int id;
	private int power;
	
	@Override
	public int getXPosition() {
		return 0;
	}

	@Override
	public int getYPosition() {
		
		return 0;
	}

	@Override
	public void turnLeft() {
		
	}

	@Override
	public void turnRight() {
		
	}

	@Override
	public void turnBack() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
}
