package fr.dauphine.ja.henouneasma.shapes.controller;



import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import fr.dauphine.ja.henouneasma.shapes.model.Cercle;
import fr.dauphine.ja.henouneasma.shapes.model.Point;
import fr.dauphine.ja.henouneasma.shapes.model.World;
import fr.dauphine.ja.henouneasma.shapes.view.MyDisplay;

public class MouseController implements MouseMotionListener {

	public World monde;
	public JFrame frame;
	
	public MouseController(World monde, JFrame frame) {
		// TODO Auto-generated constructor stub
		this.monde = monde;
		this.frame = frame;
	}
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseMouve(MouseEvent e) {
		
		Point p = new Point(e.getX(),e.getY());
		Cercle c = new Cercle(30,p);
		monde.getShapes().clear();
		monde.getShapes().add(c);
				
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
