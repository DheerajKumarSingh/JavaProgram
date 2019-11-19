package thread;

public class SeqRunnable implements Runnable {
	
	public SeqRunnable() {
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"is start");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"is finished");
	}
}
