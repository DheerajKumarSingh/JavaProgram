package practice_stack;

public class StackUsingArr1 {

	int size;
	int[] arr;
	int top;
	public StackUsingArr1(int size) {
		// TODO Auto-generated constructor stub
		arr=new int[size];
		top=-1;
	}
	
	
	 int Push(int data) {
		if(!isStackFull()) {
			top++;
			arr[top]=data;	
			System.out.println(" push out item: "+arr[top]);
			return arr[top];
		}
		return -1;
	}
	
	 int pull() {
		if(!checkarrEmpty()) {
			
			int tempTop=top;
			top--;
			System.out.println(" pull out item: "+arr[tempTop]);
			return arr[tempTop];
		}
		return -1;
	}


	private boolean checkarrEmpty() {
		// TODO Auto-generated method stub
		if(arr.length==0) {
			return true;
		}
		return false;
	}


	private boolean isStackFull() {
		// TODO Auto-generated method stub
		if(arr.length-1==top) {
			return true;
		}
		return false;
	}

}
