package fr.dauphine.ja.henouneasma.shapes.model;
import java.util.ArrayList;

public class World {
	
	public ArrayList<Shape>  shapes;
	
	public World() {
		
		ArrayList<Shape> shapes = new ArrayList<Shape>(); 
		shapes.add(new Cercle(40,new Point(130,60)));
		shapes.add(new Cercle (130,new Point(200,140)));
		shapes.add(new Point(200,140));
		
	}
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}

}
