package core.java.inner.classess.annonymous;

public class AnnonymousThreadDemo {

	public static void main(String[] args) {
		
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("Annonymous class extending class.");
			}
		};
		
		t.start();
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Annonymous class implementing interface.");
				
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Annonymous passed as argument to method");
			}
		});
		
		t2.start();
	}
}
