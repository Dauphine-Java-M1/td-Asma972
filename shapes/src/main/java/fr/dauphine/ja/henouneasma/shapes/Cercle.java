package fr.dauphine.ja.henouneasma.shapes;

public class Cercle {
	private int rayon;
	private Point centre;
	
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
		String res = " rayon= " +this.rayon+" le centre : ("+centre.getX()+","+centre.getY()+")";
		return res;
	}
	// translater un cerlce
	public void translate(int dx,int dy) {
		
	}
	
	@Override
	// redéfinition de equals
	public boolean equals(Circle A){
		if (centre.getX() = A.getCentre().getX()){
			if (centre.getY() = A.getCentre().getY(){
				if (rayon = A.getRayon() ){
					return true;
				}
			}
		}
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
	}

}
