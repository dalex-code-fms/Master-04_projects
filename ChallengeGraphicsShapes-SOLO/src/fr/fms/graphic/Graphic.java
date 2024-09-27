package fr.fms.graphic;

/**
 * Programme permettant l'affichage de plusieurs formes géométriques
 * 
 * @author El babili - 2023
 * 
 */

import fr.fms.entities.*;
import fr.fms.job.IJobImpl;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Graphic extends JFrame {
	private static final long serialVersionUID = 1L;
	private static IJobImpl job;
	
	public Graphic() {
		super("Voici nos formes géométriques !");			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 250);		
		setLocationRelativeTo(null);	
		setVisible(true);			
	}
	
	@Override	//le repère commence en haut à gauche (0,0)
	public void paint(Graphics g) {	
		super.paint(g);
		
		job.drawShape(g);
		/*g.fillOval(50, 50, 35, 35);	// x , y , largeur , hauteur (diamètre)
		g.drawOval(150, 50, 45, 70);
		g.drawRect(50, 150, 50, 50);
		g.fillRect(150, 150, 70, 50);		
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setPaint(new GradientPaint(0, 0, Color.GREEN, 50, 50, Color.RED,true));
		g2d.fillRect(250, 50, 70, 50);		
		
		g2d.fillOval(250,150,55,55);*/
		
		System.out.println("coucou");
	}
	
	public static void main(String[] args) {
		job = new IJobImpl();
		job.addShape(new Rectangle(5, 5, 50, 100));
		job.addShape(new Circle(50, 100, 40, 40));
		job.addShape(new Rectangle(150, 20, 50, 50));
		job.addShape(new Circle(200, 200, 100, 50));
		
		new Graphic();
	}
}
