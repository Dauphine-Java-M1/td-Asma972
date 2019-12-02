package fr.dauphine.ja.henouneasma.generics;

import java.util.ArrayList;

public class generics<T> implements Comparable<T> {
	
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
	
	public static void main(String []args){
		System.out.println(myMax(42,1664)); //1664
		System.out.println(myMax(2014,86,13)); //2014
		System.out.println(myMax(8.6,16.64)); //16.64
		System.out.println(myMax("baa", "aba")); //aba
	}
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
