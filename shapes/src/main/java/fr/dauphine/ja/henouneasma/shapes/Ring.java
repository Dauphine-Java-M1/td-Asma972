package fr.dauphine.ja.henouneasma.shapes;

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
		String res="un ring est un cercle :"+cercle+", un rayon "+rayon+", un rayon inetrne :"+rayonInterne;
		return res;
	}
	
	public boolean contains(Point p) {
		return (p.contains(this.cercle));
	}
	
	
	public static void main( String[] args )
    {
		Point p = new Point(1,1); 
		Cercle c = new Cercle(1,p);
		Ring r = new Ring(c,2,1);
		System.out.println(r);
	}
}
