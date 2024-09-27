package fr.fms.job;

import java.awt.Graphics;
import java.util.ArrayList;

import fr.fms.entities.Shape;

public class IJobImpl implements IJob{
	private ArrayList<Shape> arrOfShapes;
	
	public IJobImpl() {
		arrOfShapes = new ArrayList<Shape>();
	}
	
	@Override
	public void addShape(Shape shape) {
		arrOfShapes.add(shape);
	}
	
	@Override
	public void drawShape(Graphics g) {
		arrOfShapes.forEach((shape) -> {
			shape.draw(g);
		});
	}
}
