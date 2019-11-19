package test.logical;



public class OddEvenRunnable implements Runnable {
	
	
	public static int number=1;
	int remainder;
	
	static Object lock=new Object();

	public OddEvenRunnable(int remainder) {
		this.remainder=remainder;
	}

	@Override
	public void run() {
		
		while (number<20) {
			
			synchronized(lock) {
				while (number%2==remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("\n"+Thread.currentThread().getName()+" :"+number);
				number++;
				lock.notifyAll();
			}
		}
		}
}
