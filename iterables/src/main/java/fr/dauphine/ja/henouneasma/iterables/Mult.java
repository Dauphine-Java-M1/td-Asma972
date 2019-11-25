package fr.dauphine.ja.henouneasma.iterables;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mult {
	
	
	
    public static List<Integer> mult( final Integer entier, final List<Integer> list) {
		// TODO Auto-generated method stub
		return new AbstractList<Integer>() {

			private Iterator<Integer> it = list.iterator(); 
			@Override
			public Integer get(int index) {
				// TODO Auto-generated method stub
				return entier*it.next();
			}

			@Override
			public int size() {
				return list.size();
			}
				
		};
}
	 
	 // Premiere question 
	// private  static ArrayList<Integer>  mult(int entier, ArrayList<Integer> list) {
	//	 int prod;
	//	 ArrayList<Integer> listRetourner = new ArrayList<Integer>(); 
	//	 Iterator<Integer> it = listRetourner.iterator();
	//	 Iterator<Integer> iter = list.iterator(); 
	//	 for(;iter.hasNext();) {
	//		prod =iter.next()*entier;
	//		listRetourner.add(prod);
	//	 }
	
	// deuxieme question 
		 
		 
		 
		 
		// return listRetourner;
	 //}
	 
	 public static void main(String []args){
	    	// Panel 1
	    	ArrayList<Integer> list = new ArrayList<Integer>();
	    	list.add(5);
	    	list.add(4);
	    	list.add(3);
	    	list.add(2);
	    	list.add(1);
	    	int entier =5;
	    	System.out.println("Voici la list : "+list);
	    	System.out.print("La list après multiplication :"+mult(5,list));
	    	
	    	
	  }
	    
	    
	 
}
