package fr.dauphine.ja.henouneasma.iterables;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Mult {
	
	
	// abract
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
	 
    
    // méthode avec abstractSquentialList 
    
    public static List<Integer> mult2( final Integer entier, final List<Integer> list) {
    	return new AbstractSequentialList<Integer>(){
    		

			@Override
			public ListIterator listIterator(final int arg0) {
				// TODO Auto-generated method stub
				 return new ListIterator<Integer>() {
					 private ListIterator<Integer> myList= list.listIterator(arg0);

					@Override
					public void add(Integer e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return myList.hasNext();
					}

					@Override
					public boolean hasPrevious() {
						// TODO Auto-generated method stub
						return myList.hasPrevious() ;
					}

					@Override
					public Integer next() {
						// TODO Auto-generated method stub
						return entier*myList.next();
					}

					@Override
					public int nextIndex() {
						// TODO Auto-generated method stub
						return myList.nextIndex()*entier;
					}

					@Override
					public Integer previous() {
						// TODO Auto-generated method stub
						return myList.previous();
					}

					@Override
					public int previousIndex() {
						// TODO Auto-generated method stub
						return myList.previousIndex();
					}

					@Override
					public void remove() {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void set(Integer e) {
						// TODO Auto-generated method stub
						
					}
				};
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
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
	    	List<Integer> list = new ArrayList<Integer>();
	    	list.add(5);
	    	list.add(4);
	    	list.add(3);
	    	list.add(2);
	    	list.add(1);
	    	int entier =5;
	    	
	    	System.out.println("Voici la list : "+list);
	    	System.out.println("La list après multiplication :"+mult(5,list));
	    	System.out.println("La list après multiplication :"+mult2(5,list));
	    	
	    	ArrayList<Integer> al = new ArrayList<Integer>();
	    	
	    	for (int i = 0; i < 1000000; i++) {
	    	    	al.add(i);
	    	 }
	    	long t0 = System.nanoTime();
	    	List<Integer> ret = Mult.mult(2, al);
	    	long sum=0;
	    	    	
	    	for(int val : ret) {
	    		sum+=val/2;
	    	}
	    	    	
	    	System.out.println((System.nanoTime() - t0));
	    	LinkedList<Integer> ll = new LinkedList<Integer>();
	    	for (int i = 0; i < 1000000; i++) {
	    	    ll.add(i);
	    	}
	    	t0 = System.nanoTime();
	    	sum=0;
	    	ret = Mult.mult(2, ll);
	    	
	    	for(int val : ret) {
	    		sum+=val/2;
	    	}
	    	System.out.println((System.nanoTime() - t0));
	    	
	  }
	    
	    
	 
}
