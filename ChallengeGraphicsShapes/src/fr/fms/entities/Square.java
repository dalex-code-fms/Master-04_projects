package fr.fms.entities;

public class Square extends Shape {
	private int size;
	
	public Square(int size, int x, int y) {
		super(x, y);
		this.setSize(size);
	}
	
	public Square(int size, Point center) {
		super(center);
		this.setSize(size);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size < 0) size = 1;
		this.size = size;
	}
	
	public double area() {
		return this.size * this.size;
	}
	
	public double perimeter() {
		return 4 * size;
	}
	
	public String toString() {
		return String.format("Square size : %d %s", size, super.toString());
	}
}