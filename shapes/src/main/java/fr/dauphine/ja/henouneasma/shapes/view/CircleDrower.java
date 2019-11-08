package fr.dauphine.ja.henouneasma.shapes.view;

import java.awt.*;

import fr.dauphine.ja.henouneasma.shapes.model.Cercle;
;

public class CircleDrower implements Drower{
	public Cercle cercle;
	
	public CircleDrower(Cercle cercle) {
		this.cercle = cercle;
	}
	
	public void draw(Graphics g) {
	       g.drawOval(50,50, 50, 50);
	}

}
