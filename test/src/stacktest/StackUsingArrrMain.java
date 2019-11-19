package stacktest;

public class StackUsingArrrMain {

	public StackUsingArrrMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingArr sUsingArr=new StackUsingArr(10);
		sUsingArr.push(30);
		sUsingArr.push(20);
		sUsingArr.push(40);
		sUsingArr.push(10);
		sUsingArr.push(50);

		System.out.print("\n ******** ");
		
		sUsingArr.pull();
		sUsingArr.pull();
		sUsingArr.pull();
		sUsingArr.pull();
	}

}
