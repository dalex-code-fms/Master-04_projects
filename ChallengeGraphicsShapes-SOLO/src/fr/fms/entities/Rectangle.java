package fr.fms.entities;

import java.awt.Graphics;
import java.util.Random;

public class Rectangle extends Shape{
	private int width;
	private int height;

	public Rectangle(int width, int x, int y) {
		super(x, y);
		setWidth(width);
		height = width;
	}
	
	public Rectangle(int width, int height, int x, int y) {
		super(x, y);
		setWidth(width);
		setHeight(height);
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width <= 0) width = 1;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height <= 0) height = 1;
		this.height = height;
	}
	
	/*public double area() {
		return this.width * this.height;
	}
	
	public double perimeter() {
		if (width == height) {
			return 4 * width;			
		} else {
			return 2 * (this.width + this.height);	
		}
	}*/
	
	@Override
	public void draw(Graphics g) {
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(2);
		
		if (randomNumber == 1) {
			g.fillRect(getX(), getY(), width, height);
		} else {
			g.drawRect(getX(), getY(), width, height);
		}
	}
	
	@Override
	public String toString() {
		if (width == height) {
			return String.format("Square : width = %d height = %d %s]", width, width, super.toString());
		} else {
			return String.format("Rectangle : width = %d height = %d %s]", width, height, super.toString());			
		}
	}
}
