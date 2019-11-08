package fr.dauphine.ja.henouneasma.shapes.model;

import java.util.ArrayList;

import fr.dauphine.ja.henouneasma.shapes.view.Drower;

public abstract class Shape {
	public Drower d;
	Shape(Drower d){
		this.d = d;
	}
}
