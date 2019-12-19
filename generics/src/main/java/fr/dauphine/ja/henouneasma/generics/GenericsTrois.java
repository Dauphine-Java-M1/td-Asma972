package fr.dauphine.ja.henouneasma.generics;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

public class GenericsTrois {
	
//EX3

	public static <T extends List<T>>  ArrayList<Integer>  listLength(List<? extends CharSequence> l) {
		ArrayList<Integer> length=new ArrayList();
		for(CharSequence o : l) {
			length.add(o.length());
		}
		return length;
		}
	
	
	
//Exo 4

	private static <T> List<T> fusion(List<? extends T> l1, List<? extends T> l2) {
		List<T> listfusion = new LinkedList<T>();
		Iterator<? extends T> it1 = (Iterator<? extends T>) l1.iterator();
		Iterator<? extends T> it2 = (Iterator<? extends T>) l2.iterator();	
		while(it1.hasNext()) {
			listfusion.add(it1.next());
			listfusion.add(it2.next());
		}
		return  listfusion;
	        
	}
	
	
	//EXO 5
	
	public static <T> void swap(List<T> list,int i,int j) {
		if(i>= list.size() ||j>= list.size()){
	     
			 	throw new IndexOutOfBoundsException("i et j ne sont pas des indices de la listes");
	        
		}
	    	T e1 = list.get(i);
	    	T e2 = list.get(j);
	    	list.set(i, e2);
	    	list.set(j, e1);
	    }
	
	public static <T>  void shuffle(List<T> l) {
		
		Random rand= new Random();

		for(int i=0; i<l.size();i++) {
			int tmp=rand.nextInt(l.size());
			swap(l,i,tmp);
		}
		
		System.out.print(l);
	}
	// la complexité de l'algorithme quand il s'agit d'une linkedList c'est en O(n^2) et de l'algorithme shuffle aussi  
	
	public static void main(String[] args) {
		List<? extends CharSequence> l = Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
		List<String> l1= Arrays.asList("C", "rc");
		
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		//List<? extends CharSequence> r1=fusion(l1,l2);
		List<?> r2=fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		
		//List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);
		System.out.println(r4);
		System.out.println(r2);
		swap(l1,0,1);
		System.out.println(l1);
		shuffle(l1);
		
	}

}
