
public interface Movimenta {
	public int step=5;
	public int maxSpeed=180;
	
	public abstract int getXPosition();
	public abstract int getYPosition();
	public abstract void turnLeft();
	public abstract void turnRight();
	public abstract void turnBack();
}
