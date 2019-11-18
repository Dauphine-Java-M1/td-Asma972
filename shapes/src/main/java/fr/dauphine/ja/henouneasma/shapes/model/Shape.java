package fr.dauphine.ja.henouneasma.shapes.model;

import java.util.ArrayList;

import fr.dauphine.ja.henouneasma.shapes.view.Drower;

public abstract class Shape {
	public Drower d;
	public abstract boolean contains (Point p);
	public abstract void translate(int dx, int dy );
	
}
