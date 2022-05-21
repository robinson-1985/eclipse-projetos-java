
public class AirCreaft implements Movimenta{
	private String prefix;
	private int speed;
	private int fuel;
	
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

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
}
