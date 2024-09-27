package fr.fms.entities;

import java.awt.Graphics;
import java.util.Random;

public class Circle extends Shape{
	private double radius;
	private int width;
	private int height;

	/*public Circle(double radius, int x, int y) {
		super(x, y);
		setRadius(radius);
	}*/
	
	public Circle(int x, int y, int width, int height) {
		super(x, y);
		setWidth(width);
		setHeight(height);
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width < 0) width = 1;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height < 0) height = 1;
		this.height = height;
	}

	/*public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius < 0) radius = 1;
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}*/
	
	@Override
	public void draw(Graphics g) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(2);
		
		if (randomNumber == 1) {
			g.fillOval(getX(), getY(), width, height);
		} else {
			g.drawOval(getX(), getY(), width, height);
		}
	}
	
	@Override
	public String toString() {
		return String.format("Circle : radius = %.1f %s", radius, super.toString());
	}
}
