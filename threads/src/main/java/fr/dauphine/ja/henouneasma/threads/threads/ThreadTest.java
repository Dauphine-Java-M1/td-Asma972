package fr.dauphine.ja.henouneasma.threads.threads;

public class ThreadTest{

	

	
	public static void main(String []args) {
		
			function(4);
		
	}

	private static Runnable function(final int id) {
		// TODO Auto-generated method stub
		return new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10000;i++)
					System.out.println("Je suis le thread "+id);
			}
		};
	}

}
