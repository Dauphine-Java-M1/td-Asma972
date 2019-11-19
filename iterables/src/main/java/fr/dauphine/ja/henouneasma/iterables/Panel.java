package fr.dauphine.ja.henouneasma.iterables;

import java.util.ArrayList;
import java.util.Iterator;

public class Panel {
    // le panel doit etre une  implemente  une list en passant par abstractList on reimplemente que getsize et
    
    //ArrayList<Integer> liste = new ArrayList<Integer>();
    public static Iterator<Integer> panel1(int i, int j){
        return new Iterator<Integer>() {
            public int pos=i;
            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                return (pos<=j);
            }

            @Override
            public Integer next() {
                // TODO Auto-generated method stub
                return pos;
            }
        };
    }
    
    
    public static void main(String []args){
        Iterator<Integer> it=panel1(1,5);
        for(;it.hasNext();)
            System.out.println(it.next()); // affiche 1 2 3 4 5
    }
}
