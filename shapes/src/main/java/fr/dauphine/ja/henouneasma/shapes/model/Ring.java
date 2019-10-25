package fr.dauphine.ja.henouneasma.shapes.model;

public class Ring extends Cercle{
	
	private int  rayonInterne;
	
	public Ring(Point p, int r, int rayonInterne) {
		super(r,p);
		if(rayonInterne<r) {
			this.rayonInterne 	= rayonInterne;
		}
	}
	
	public int getRayonInterne() {
		return rayonInterne;
	}
	public Cercle getCercle() {
		Cercle c= new Cercle(super.getRayon(),super.getCentre());
		return c ;
	}

	
	public void setRayonInterne(int r) {
		this.rayonInterne = r ;
	}

	
	@Override
	
	public boolean equals(Object o) {
		if(!(o instanceof Ring)) return false;
		Ring r = (Ring) o;
		return (o.equals(r.getCercle())) && (rayon == r.getRayon()) && (rayonInterne == r.getRayonInterne() );
	}
	
	@Override
	public String toString() {
		String res="un ring est un cercle :"+getCercle()+", un rayon "+super.rayon+", un rayon inetrne :"+rayonInterne;
		return res;
	}
	
	//public boolean contains(Point p) {
		//return (p.contains(this.getCercle()));
	//}
	
	
	public static void main( String[] args )
    {
		Point p = new Point(1,1); 
		Ring r = new Ring(p, 1, 5);
		System.out.println(r);
	}
}
