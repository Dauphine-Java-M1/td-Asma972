package fr.dauphine.ja.henouneasma.threads.threads;

import java.util.ArrayList;


public class MySafeList extends ArrayList<Double>{
	
	

	@Override
	public  boolean add(Double element) {
		// TODO Auto-generated method stub
			return super.add( element);
	}
	@Override
	public  Double get(int index) {
		// TODO Auto-generated method stub
		return super.get(index);
	}


	@Override
	public   int size() {
		// TODO Auto-generated method stub
		return super.size();
	}



	public static Runnable t(final int m, final MySafeList list) {
		return new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				for(int i=1; i<m;i++) {
					
					list.add((double)i);
					
				}
			}
		};
		
		
		
			}
	
	public static boolean stressTest(int n, int m ) {
		MySafeList list = new MySafeList();
		try {
			for(int i=1;i<=n;i++) {
				Thread th = new Thread(t(m,list));
				th.start();
			}
			if(list.size()!=n*m)
				return false;
		}catch(Exception e) {
			return false;
		}


		return true;
	}
	
	public static void randomList (MySafeList v1, MySafeList v2, int n) {
		
		double rand;
		
		for(int i=1;i<=n;i++) {
			rand= Math.random();
			v1.add(rand);
		}
		for(int i=1;i<=n;i++) {
			rand= Math.random();
			v2.add(rand);
		}
	}
	
	public static Double scalar(MySafeList v1, MySafeList v2) {
		Double prod=0.0;
		for(int i=0;i<v1.size();i++) {
				prod+= v1.get(i)*v2.get(i) ; 
			
		}
		return prod;
	}

	
	public static void main(String []args) {
		
		System.out.println(stressTest(2, 5));
		
	}
	

}
