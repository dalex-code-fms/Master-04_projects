package fr.fms.entities;

public class Position {
	private int x;
	private int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x < 0) x = 1;
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y < 0) y = 1;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("Poisition: [x=%d , y=%d]", x, y);
	}
	
}
