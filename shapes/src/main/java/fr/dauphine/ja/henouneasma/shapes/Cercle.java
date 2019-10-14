package fr.dauphine.ja.henouneasma.shapes;

public class Cercle {
	private int rayon;
	private Point centre;
	
	public Cercle(int rayon, Point p) {
		this.rayon = rayon;
		this.centre = new Point(p);
		
	}
	
	public int getRayon() {
		return rayon;
	}
	
	public Point getCentre() {
		return centre;
	}
	@Override
	
	public String toString() {
	  return (this.getRayon);
	}
	
	  public static void main( String[] args )
	  {
			Cercle c = new Cercle(1, new Point(1,2));
			c.getCenter().translate(1,1);
			System.out.println(c);
	  }

}
