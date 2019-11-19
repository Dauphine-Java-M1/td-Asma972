package fr.dauphine.ja.henouneasma.iterables;

import java.util.List;
import java.util.AbstractList;
import java.util.Iterator;

public class Panel {
	
    // le panel doit etre une  implemente  une list en passant par abstractList on reimplemente que getsize et
    
    

	private static Iterator<Integer> panel1(final int i, final int j) {
		return new Iterator<Integer>() {
			private int pos=i;

			public boolean hasNext() {
				// TODO Auto-generated method stub
				return pos<=j;
			}

			public Integer next() {
				// TODO Auto-generated method stub
				return pos++;
			}};
		
}
    
    private static Iterable<Integer> panel2(final int i, final int j){
		return new Iterable <Integer>(){

			public Iterator<Integer> iterator() {
				// TODO Auto-generated method stub
				 return new Iterator <Integer>() {
					 private int pos=i;

					public boolean hasNext() {
						// TODO Auto-generated method stub
						 return pos<=j;
					}

					public Integer next() {
						// TODO Auto-generated method stub
						return pos++;
					}
				};
			}
			
		};
    	
    }
    
    public static List<Integer> panel(final int i, final int j) {
		// TODO Auto-generated method stub
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int index) {
				// TODO Auto-generated method stub
				return i+index;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return j-i+1;
			}
		};
}
    
    public static void main(String []args){
    	// Panel 1
    	Iterator<Integer> it=panel1(1,5);
    	
		for(;it.hasNext();) 
			System.out.println(it.next()); 
		System.out.println();
		
		// Panel 2
		
		for(int i:panel2(1,5))
			System.out.println(i);
		
		// Panel 
		
		System.out.println();
		List<Integer> l = panel(3,6);
		for(int i:l) {
			System.out.println(i);
		}
    }
    
    
}
