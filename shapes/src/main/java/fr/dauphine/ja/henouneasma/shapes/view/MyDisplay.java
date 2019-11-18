package fr.dauphine.ja.henouneasma.shapes.view;
import javax.swing.*;

import fr.dauphine.ja.henouneasma.shapes.controller.MouseController;
import fr.dauphine.ja.henouneasma.shapes.model.Cercle;
import fr.dauphine.ja.henouneasma.shapes.model.Point;
import fr.dauphine.ja.henouneasma.shapes.model.World;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.henouneasma.shapes.model.Shape;

public class MyDisplay extends JPanel{
	
	World monde; 
	public MyDisplay(World monde){
		this.monde = monde;
	}
	
	
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillRect(1, 1, this.getWidth(), this.getHeight());
		g.setColor(Color.white);
		for (Shape s : monde.getShapes()) {
			s.d.draw(g);
		}
	}
	
	public static void main(String []args){
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		World monde = new World();
		MyDisplay d = new MyDisplay(monde);
		MouseController m = new MouseController(monde, frame);
		frame.add(d);
		frame.addMouseMotionListener(m);
		frame.setSize(new Dimension(500, 500));
		frame.setVisible(true);
	}
}
