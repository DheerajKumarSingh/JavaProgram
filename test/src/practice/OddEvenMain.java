package practice;

public class OddEvenMain {

	public OddEvenMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OddEvenRunnable oddEvenRunnable=new OddEvenRunnable(1);
		OddEvenRunnable oddEvenRunnable2=new OddEvenRunnable(0);
		
		Thread thead1=new Thread(oddEvenRunnable);
		Thread thread2=new Thread(oddEvenRunnable2);
		
		thead1.start();
		thread2.start();

	}

}
