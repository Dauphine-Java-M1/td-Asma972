package fr.dauphine.ja.henouneasma.shapes.model;

import java.util.ArrayList;

public class World {
	
	public ArrayList<Shape>  shapes;
	
	public World() {
		ArrayList<Shape> shapes = new ArrayList<Shape>(); 
		shapes.add(new Cercle(40,(new Point(2,7))));
		shapes.add(new Cercle(30,(new Point(9,3))));
	}
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}
}
