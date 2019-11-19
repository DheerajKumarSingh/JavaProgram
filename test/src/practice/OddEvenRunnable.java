package practice;

public class OddEvenRunnable implements Runnable {
	
	int reminder;
	static int number=1;
	public static  Object objectLock=new Object();

	public OddEvenRunnable(int reminder) {
		this.reminder=reminder;
	}
	
	@Override
	public void run() {
		// task to execute two thread in different ways
		while (number<=20) {
			
		synchronized (objectLock) {
			while (number%2==reminder) {
				try {
					objectLock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.print("\n"+Thread.currentThread().getName()+" Number :"+number);
			number++;
			objectLock.notifyAll();
		}
		}
	}
}
