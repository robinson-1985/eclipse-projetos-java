
public class Destroyer implements Movimenta{
	private String name;
	private double weapons;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeapons() {
		return weapons;
	}

	public void setWeapons(double weapons) {
		this.weapons = weapons;
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
