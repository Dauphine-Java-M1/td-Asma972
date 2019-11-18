package fr.dauphine.ja.henouneasma.shapes.view;

import fr.dauphine.ja.henouneasma.shapes.model.Shape;
import fr.dauphine.ja.henouneasma.shapes.model.World;

public class View {
	World  w;
	public View() {
	}
	void draw(){
		
		for(Shape s : w.getShapes()) {
			s.getDrower();
		}
	}
}
