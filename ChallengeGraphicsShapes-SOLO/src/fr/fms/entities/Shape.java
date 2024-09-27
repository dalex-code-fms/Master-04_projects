package fr.fms.entities;

import java.awt.Graphics;

public abstract class Shape {
	private Position center;
	
	public Shape(int x, int y) {
		this.center = new Position(x, y);
	}
	
	public int getX() {
		return center.getX();
	}

	public int getY() {
		return center.getY()
;	}

	/*public abstract double area();
	
	public abstract double perimeter();*/
	
	public abstract void draw(Graphics g);
	
	@Override
	public String toString() {
		return String.format("Shape : [center = %s ]", center);
	}
}
