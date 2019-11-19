package thread;

public class ThreadSequenceDemo {

	public ThreadSequenceDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		SeqRunnable myThread=new SeqRunnable();
		Thread thread1=new Thread(myThread);
		
		//myThread.setThread(thread1);
		
		SeqRunnable myThread2=new SeqRunnable();
		Thread thread2=new Thread(myThread2);
		
		 //myThread.setThread(thread2);
		 
		thread1.start();
		thread1.join();
		
		thread2.start();
		thread2.join();
		
	}

}
