package fr.dauphine.ja.henouneasma.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsTrois {

	public static <T extends List<T>>  ArrayList<Integer>  listLength(List<? extends CharSequence> l) {
		ArrayList<Integer> length=new ArrayList();
		for(CharSequence o : l) {
			length.add(o.length());
		}
		return length;
		}
	private static List<?  > fusion(List<?> l1, List<?> l2) {
		// TODO Auto-generated method stub
		if(l1.size()==l2.size()) {
			for(int i=0; i<l1.size();i++) {
				for(int j=0;j<=l2.size();j++){
					
				}
			}
		}
		
		return null;
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

	}

	
}
