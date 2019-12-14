package fr.dauphine.ja.henouneasma.generics;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericsTrois {

	public static <T extends List<T>>  ArrayList<Integer>  listLength(List<? extends CharSequence> l) {
		ArrayList<Integer> length=new ArrayList();
		for(CharSequence o : l) {
			length.add(o.length());
		}
		return length;
		}
	
	
	
	public static void main(String[] args) {
		List<? extends CharSequence> l = Arrays.asList("colonel", "reyel");

		List<? extends Integer> ll = Arrays.asList(2,3);
		System.out.println(listLength(l));
		List<String> l1= Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		//List<? extends CharSequence> r1=fusion(l1,l2);
		List<?> r2=fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		//List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);
		System.out.println(r4);
		System.out.println(r2);
	}


	private static <E> List<E> fusion(List<? extends E> l1, List<? extends E> l2) {
		// TODO Auto-generated method stub
		
		List<Object> es= new ArrayList<Object>();
		 for( E e: l1){
			 for( E ee: l2){
	            es.add(e);
	            es.add(ee);
	        }
		 }
	        return (List<E>) es;
	        
	}
}
