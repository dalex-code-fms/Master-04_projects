package fr.fms.job;

import java.util.ArrayList;

import fr.fms.entities.Shape;
import fr.fms.graphic.Graphic;

public class JobImpl implements Job {
	private ArrayList<Shape> shapes;
	private Graphic graphic;
	
	public JobImpl(Graphic graphic) {
		shapes = new ArrayList<>();
		this.graphic = graphic;
	}
	
	public void addShape(Shape shape) {
		shapes.add(shape);
	}
	
	public void drawShape() {
		
	}
}
