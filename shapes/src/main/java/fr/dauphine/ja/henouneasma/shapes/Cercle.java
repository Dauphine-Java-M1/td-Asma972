package fr.dauphine.ja.henouneasma.shapes;

public class Cercle {
	protected int rayon;
	protected Point centre;
	protected static double pi=3.14;
	
	public Cercle(int rayon, Point p) {
		this.rayon = rayon; //Rayon du cercle
		this.centre = new Point(p); //les coordonnée du centre
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
	
	
	public static void main( String[] args )
    {
		Cercle c = new Cercle(1, new Point(1,2));
		c.getCentre().translate(1,1);
		Point  p  =	new Point(1,2);
		Cercle c1 = new Cercle(1,p);
		Cercle c2 = new Cercle(2,p);
		c2.translate(1,1);
		System.out.println(c1+","+c2);
		System.out.println(c1.equals(c2));
	}

}
