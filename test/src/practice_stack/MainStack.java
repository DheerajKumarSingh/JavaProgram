package practice_stack;

public class MainStack {

	public MainStack() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		stackUsingArrayCall();
		
		stackUsingLinkedList();
		
	}

	private static void stackUsingLinkedList() {
		// TODO Auto-generated method stub
		
		
	}

	private static void stackUsingArrayCall() {
		// TODO Auto-generated method stub
		StackUsingArr1 stackUsingArr=new StackUsingArr1(10);
		stackUsingArr.Push(20);
		stackUsingArr.Push(30);
		stackUsingArr.Push(90);
		stackUsingArr.Push(40);
		stackUsingArr.Push(50);
		
		System.out.println("  ===================   ");
		

		stackUsingArr.pull();
		stackUsingArr.pull();
	}

}
