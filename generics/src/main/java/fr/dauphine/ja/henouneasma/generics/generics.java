package fr.dauphine.ja.henouneasma.generics;

import java.util.List;

import javax.sound.midi.Sequence;

import java.util.ArrayList;
import java.util.Arrays;

public class generics  {
	
	// on compare avec la premiére valeur du tableau integers qui de type integer []	
	public static int myMax2(int i0,Integer...integers) {
		int max =i0;
		for(int i :integers) {
			if(i >max)
				max =i;
		}
		return max;
	}
	// on définit d'abord le type de retour ensuite on le retourne <T> 
	// on veut qu'on compare que les obj qui sont comparable et qui implement comparableTo
	// on modifie la définition de T qui doit etre comparble avec lui m^me 
	// si l'obj this est plus grand on retourn 1 sinon -1 si egaux 0
	public static <T extends Comparable<T>>  T myMax(T i, T...tab){
		T max =i;
		for(T o :tab) {
			if(max.compareTo(o)<0) {
				max =o;
			}
		}
		return max;
	}

	
	private static  void print(List<?> list) {
		for(Object o:list)
		System.out.println(o);
	}
	
	private static void  longueur(List<? extends CharSequence> list) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(CharSequence o:list) {
			l.add(o.length());
		}
		print(l);
	}
	
	
	
	
	
	public static void main(String []args){
		System.out.println(myMax(42,1664)); //1664
		System.out.println(myMax(2014,86,13)); //2014
		System.out.println(myMax(8.6,16.64)); //16.64
		System.out.println(myMax("baa", "aba")); //aba
		//exercice 2
		List<String> list=Arrays.asList("foo", "toto","toto2");
		//List<?> list2=Arrays.asList(2,3,4,"toto");
		print(list);
		longueur(list);
		//print(list);// Q1 list de string ne sont pas des sous-types de objects 
	}
	
}


//wildcard // thread
