package fr.dauphine.ja.henouneasma.shapes.model;

import java.util.*;


public class Ligne implements Shape{
        
        private Point tableau[];
        private  int  maxPoints;
        private static int n=0;
        LinkedList <Point> list;

        public Ligne(/*int maxPoints*/){
        	LinkedList <Point> list = new LinkedList<Point>() ; 
             // tableau = new Point[maxPoints] ;
                            
        }     
       
      
        
        public int pointCapacity(Ligne l) {
        	return l.maxPoints;
        }
        
        public int nbPoints(Ligne l) {
        	return l.n;
        }
        
        public boolean contains (Point p) {
        	Objects.requireNonNull(p,"Le point ne peut pas etre null");
        	for (Point p2 : tableau) 
        		if(p.equals(p2)) return true; 
        	return false;
        }
     // main 
	    public static void main( String[] args )
	    {
	    	// exercice 2.3
	    	LinkedList <Point> list = new LinkedList<Point>() ; 
	    	Point p1=new Point(1,2);
	    	list.push(p1);	  
	    	System.out.println(list.contains(p1));   	
	    }
	    public void addPoints(Point p) {
	    	list.push(p);
	    	
	    	
	    }

	  

	



}
		
