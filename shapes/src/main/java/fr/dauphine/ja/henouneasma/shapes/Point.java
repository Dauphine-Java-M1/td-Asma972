package fr.dauphine.ja.henouneasma.shapes.shapes;

import java.util.*;


public class Point {
		
		private int x,y; // champs privé  
	    private static  int nbPoints; // ce champs n'interfére pas à la création d'un point 
	    
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
			this.nbPoints += 1;
		}
		
		public Point() {
			
		}
		
		public Point(Point p) {
			this.x = p.x;
			this.y = p.y;
			
		}
	    
		public void setX(int p) {
			x = p;
		}
	
		public void setY(int p) {
			y = p;
		}
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public boolean  isSameAs(Point p) {
			if ((this.x == p.x) && (this.y ==p.y))  return true ;
			return false;
		}
		
		public boolean equals(Object o) {
			
			if ((this.x== this.getX(o)) && (this.y==this.getY(o))) 
			    return true;
		    return false;

		} 
		
	    public static void main( String[] args )
	    {
	    	//ecercice 2
	    	Point p1=new Point(1,2);
	    	Point p2=p1;
	    	Point p3=new Point(1,2);
	    	System.out.println(p1==p2);
	    	System.out.println(p1==p3);
	    	//exercice 1
	    	
	    	Point p=new Point(5,4);
	     	Point d = new Point(p);
	    	System.out.println("("+p.x+","+p.y+")");
	    	System.out.println("("+d.x+","+d.y+")");
	    	System.out.println("Le nombre de points créér jusqu'a maintenant :" + nbPoints);
	   
	    }

}
