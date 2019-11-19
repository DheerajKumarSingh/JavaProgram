package thread;


public class ThreeThreadInSequence  {

	public ThreeThreadInSequence() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SequenceThread sequenceThread=new SequenceThread();
		
		Thread thread=new Thread(new SequeceRunnable(sequenceThread,0));
		Thread thread2=new Thread(new SequeceRunnable(sequenceThread,1));
		Thread thread3=new Thread(new SequeceRunnable(sequenceThread,2));
		
		thread.start();
		thread2.start();
		thread3.start();
	}

}


class SequenceThread {
	
	int number=1;
	int numberOfThread=3;
	
	public void printNumber(int result) {
		
		synchronized (this) {
			
			while(number<20) {
				
				while(number%numberOfThread!=result) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName() + " - " + number++);
				this.notifyAll();
			}
		
			
		}
		
		
		
	}
	
}
	
	
	
	 class SequeceRunnable implements Runnable{
		
		SequenceThread sequenceThread;
		int result;
		  static Object sharedObj = new Object();
		public SequeceRunnable(SequenceThread sequenceThread,int result) {
			// TODO Auto-generated constructor stub
			this.sequenceThread=sequenceThread;
			this.result=result;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			 sequenceThread.printNumber(result);
			
		}
		
		
	
}
