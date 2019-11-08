package fr.dauphine.ja.henouneasma.shapes.model;

import fr.dauphine.ja.henouneasma.shapes.view.CircleDrower;
import fr.dauphine.ja.henouneasma.shapes.view.Drower;

public class Cercle extends Shape {
	protected int rayon;
	protected Point centre;
	protected static double pi=3.14;
	private static Drower d1;

	
	public Cercle(int rayon, Point p) {
		super(d1);
		this.rayon = rayon; //Rayon du cercle
		this.centre = new Point(p); //les coordonnée du centre
		d1 = new CircleDrower();
	}
	
	public int getRayon() {
		return rayon;
	}
	
	public Point getCentre() {
		return centre;
	}
	
	@Override
	//redéfinition de la méthode toString
	
	public String toString() {
		String res = " rayon= " +this.rayon+" le centre : ("+centre.getX()+","+centre.getY()+") et sa surface est :"+this.surface() ;
		return res;
	}
	// translater un cerlce
	public void translate(int dx,int dy) {
		this.centre.translate(dx,dy);
		this.rayon=0;// pour le moment je ne sais pas comment faire ça 
		
	}
	
	@Override
	// redéfinition de equals
	public boolean equals(Object o) {
		if(!(o instanceof Cercle)) return false;
		Cercle c =(Cercle) o ;
	    return (this.centre.equals(c.getCentre()))&&(this.rayon==c.getRayon());	
	}
	
	public double surface() {
		return Math.PI*rayon*rayon;		
	}
	
	public boolean contains(Point p) {
		if(((java.lang.Math.sqrt(this.centre.getX()))-(java.lang.Math.sqrt(this.centre.getY()))<=rayon))
			return true ;
		return false;
	}
	
	public boolean contains(Point p,Cercle[] tableau) {
		
		for(Cercle c : tableau)
			 if(c.contains(p))
				 return true;
		return false;
	}
	



}
