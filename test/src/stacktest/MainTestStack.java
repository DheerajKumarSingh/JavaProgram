package stacktest;

public class MainTestStack {

	public MainTestStack() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListStack linkedListStack=new LinkedListStack();
		linkedListStack.push(10);
		linkedListStack.push(20);
		linkedListStack.push(30);
		linkedListStack.push(40);
		linkedListStack.push(50);
		
		System.out.print("\n*************pop out data*****************");
		
		linkedListStack.pull();
		linkedListStack.pull();

	}

}
