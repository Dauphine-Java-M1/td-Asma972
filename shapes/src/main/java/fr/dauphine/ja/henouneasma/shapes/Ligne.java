package fr.dauphine.ja.henouneasma.shapes;

import java.util.*;


public class Ligne {
        
        private Point tableau[];
        private  int  maxPoints;
        private static int n=0;

        public Ligne(int maxPoints){
              tableau = new Point[maxPoints] ;
                            
        }     
        
        public void add(Point p) {
        	
        	if(n<=maxPoints) {
	        	tableau[n]= new Point(p);
	        	n++;
        	}
        }
        
        public int pointCapacity(Ligne l) {
        	return l.maxPoints;
        }
        
        public int nbPoints(Ligne l) {
        	return l.n;
        }
        
        public boolean contains (Point p) {
        	
        	for (Point p2 : tableau) 
        		if(p.equals(p2)) return true; 
        	return false;
        	
        }
     // main 
	    public static void main( String[] args )
	    {
	    	// exercice 2.3
	    	Point p1=new Point(1,2);
	    	Ligne l = new Ligne(2);
	    	l.add(p1);
	    	System.out.println(l.contains(null));   	
	    }

}
		
