package thread;

public class OddEvenSequenceThread {

	public OddEvenSequenceThread() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public static void main(String[] args) {
		
	    OddEvenMain oddEvenMain=new OddEvenMain();
	    
	    Thread thread2=new Thread(new OddRunnable(oddEvenMain,10));
		thread2.setName("thread2");
		
		Thread thread1=new Thread(new EvenRunnable(oddEvenMain,10));
		thread1.setName("thread1");
		
		thread2.start();
		thread1.start();
		
		
	}
}
	
	
	  class OddEvenMain {
		
		public boolean oddEven=true;
		
		public void printOddNumber(int number) {
			synchronized(this) {
				while(!oddEven) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			System.out.println(Thread.currentThread().getName()+"odd number is here::"+number);
			oddEven=false;
			notify();
			}
		}
		
		public void printEvenNumber(int number) {
			synchronized(this) {
				while(oddEven) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			System.out.println(Thread.currentThread().getName()+"even number is here::"+number);
			oddEven=true;
			notify();
			}
		}
		
	}

	
	
	class OddRunnable implements Runnable{
		
		OddEvenMain oddEvenMain;
		int index;
		
		OddRunnable(OddEvenMain oddEvenMain,int index){
			this.oddEvenMain=oddEvenMain;
			this.index=index;
		}
		
		@Override
		public void run() {
			for (int i = 1; i <=index; i=i+2) {
				oddEvenMain.printOddNumber(i);
			}
		}
	}
	
	class EvenRunnable implements Runnable{
		OddEvenMain oddEvenMain;
		int index;
		
		EvenRunnable(OddEvenMain oddEvenMain,int index){
			this.oddEvenMain=oddEvenMain;
			this.index=index;
		}
		@Override
		public void run() {
				for (int i = 2; i <=index; i=i+2) {
					oddEvenMain.printEvenNumber(i);
				//System.out.println(Thread.currentThread().getName()+""+i);
			}
		}
	}

