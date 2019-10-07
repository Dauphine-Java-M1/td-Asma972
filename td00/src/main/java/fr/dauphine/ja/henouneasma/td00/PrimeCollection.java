package fr.dauphine.ja.henouneasma.td00;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.Random;

public class PrimeCollection 
{	 
		ArrayList<Integer> numbers; 
		
		
	    public PrimeCollection() {
			this.numbers=new ArrayList<Integer>();
		}
		
		public void initRandom (int n, int k) {
			Random r= new Random();
			for(int i=0;i<n;i++) {
				numbers.add(r.nextInt(k+1));
			}
		}
		
		 bool isPrime(int n) {
		    	if(n<1) 
		    		return true;
		    	for(int i=2;i<Math.sqrt(h);i++) {
		    		if(n%i==0) {
		    			return false;
		    		}
		    	}
		    	return true;
		  }
		 
		 
		 public void affichage() {
				for(Integer i : numbers) {
					if(isPrime(i)) System.out.println(i);
				}
			}
		
	    public static void main( String[] args )
	    {
	        PrimeCollection l = new PrimeCollection();
	        l.initRandom(1000,2000);
	        l.affichage();
	    }
}
