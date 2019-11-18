package fr.dauphine.ja.henouneasma.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.henouneasma.shapes.model.Cercle;
;

public class CircleDrower extends Drower{
	public Cercle cercle;
	
	public CircleDrower(Cercle cercle) {
		this.cercle = cercle;
	}
	
	public void draw(Graphics g) {
		g.drawOval(cercle.getCentre().getX(),cercle.getCentre().getY(),cercle.getRayon(), cercle.getRayon());
	}

}
