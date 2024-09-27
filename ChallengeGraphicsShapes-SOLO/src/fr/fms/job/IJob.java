package fr.fms.job;

import java.awt.Graphics;

import fr.fms.entities.Shape;

public interface IJob {
	public void addShape(Shape shape);
	public void drawShape(Graphics g);
}
