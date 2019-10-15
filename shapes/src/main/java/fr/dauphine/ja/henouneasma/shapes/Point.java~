package fr.dauphine.ja.henouneasma.shapes;

import java.util.*;


public class Point {
		
	    private int x,y; // champs privé  
	    private static  int nbPoints; // ce champs n'interfére pas à la création d'un point 
	    private int maxPoints; //nombres de points pour une ligne brisé 
	    
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
			this.nbPoints += 1;
		}
		
		// constructeur d'un point vide, par défaut 
		public Point() {
			
		}
		
		// ce constructeur permet de créer un point de coordonnée x et y 
		public Point(Point p) {
			this.x = p.x;
			this.y = p.y;
			
		}
	    
	    
	
	    
	    // méthode de classe permettant de changer la valeur de x d'un point
		public void setX(int p) {
			x = p;
		}
	
	    // méthode de classe permettant de changer la valeur de y d'un point
		public void setY(int p) {
			y = p;
		}
		
		// méthode de classe permettant de récupérer la valeur de x d'un point
		public int getX() {
			return x;
		}
		
		// méthode de classe permettant de récupérer la valeur de y d'un point
		public int getY() {
			return y;
		}
		
		// question 2 exercice 2
		public boolean  isSameAs(Point p) {
			if ((this.x == p.x) && (this.y ==p.y))  return true ;
			return false;
		}
		
		// redéfinir la fonction equals 
		@Override 
		
		public boolean equals(Object o) {
			if(!(o instanceof Point))
				return false;
			Point p = (Point) o;
			return (x==p.x)&&(y==p.y);		
		}
		// signature 1 ou on modifie les paramétre du point
		
		public void translate (int dx, int dy ) {
			this.x = dx;
			this.y = dy;
		}
		
		// signature 2 ou on créé un nouveau point
		public Point translate2(int dx,int dy) {
			Point p = new Point(dx, dy);
			return p;
		}
		
		
		
		// main 
	    public static void main( String[] args )
	    {
	    	//ecercice 2
	    	System.out.println("Question 2.1");
	    	Point p1=new Point(1,2);
	    	Point p2=p1;
	    	Point p3=new Point(1,2);
	    	System.out.println(p1==p2);
	    	System.out.println(p1==p3);
	    	
	    	
	    	//exercice 1
	    	System.out.println("Question 1");
	    	Point p=new Point(5,4);
	     	Point d = new Point(p);
	    	System.out.println("("+p.x+","+p.y+")");
	    	System.out.println("("+d.x+","+d.y+")");
	    	System.out.println("Le nombre de points créér jusqu'a maintenant :" + nbPoints);
	    	
	    	// exercice 2.3
	    	System.out.println("Question 2.3");
	    	Point p11=new Point(1,2);
	    	Point p22=p11;
	    	Point p33=new Point(1,2);
	    	ArrayList<Point> list = new ArrayList<Point>();
	    	list.add(p11);
	    	System.out.println(list.indexOf(p22));
	    	System.out.println(list.indexOf(p33));   	
	   
	    }

}
