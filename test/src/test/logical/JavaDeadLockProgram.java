package test.logical;

public class JavaDeadLockProgram {
	
	
	public static void main(String args[]) {
		DeadlocMain d=new DeadlocMain();
		Runnable runnable1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				d.method1();
				d.method2();
				
			}
		};
		
Runnable runnable2=new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				d.method1();
				d.method2();
				
			}
		};
		
		Runnable runnable3=new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				d.method1();
				d.method2();
				
			}
		};
		Runnable runnable4=new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				d.method1();
				d.method2();
				
			}
		};
		Runnable runnable5=new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				d.method1();
				d.method2();
				
			}
		};
		
		Thread thread1=new Thread(runnable1);
		Thread thread2=new Thread(runnable2);
		Thread thread3=new Thread(runnable3);
		Thread thread4=new Thread(runnable4);
		Thread thread5=new Thread(runnable5);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		

}

	


}