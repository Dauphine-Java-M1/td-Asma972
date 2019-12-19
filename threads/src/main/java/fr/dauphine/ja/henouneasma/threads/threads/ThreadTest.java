package fr.dauphine.ja.henouneasma.threads.threads;

public class ThreadTest{
	private static int nbIter=1;
	private static final Object monitor = new Object();

	private static Runnable function(final int id) {
		// TODO Auto-generated method stub
		return new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				while(nbIter<10000) {	
					synchronized(monitor) {
								if(nbIter<=10000) {		
									System.out.println("Je suis le thread "+id+" et j'effectue l'iteration "+ nbIter);
									++nbIter;
								}
					}
				}
			}
		};
	}

	

	
	public static void main(String []args) {
		
			Thread th1= new Thread(function(1));
			Thread th2= new Thread(function(2));
			th1.start();
			th2.start();
	}
}
