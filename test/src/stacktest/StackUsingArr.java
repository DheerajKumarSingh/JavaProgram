package stacktest;

public class StackUsingArr {
	
	
   int size;
   int[] arr;
   int top;
   
  public StackUsingArr(int size) {
		// TODO Auto-generated constructor stub
		 this.size=size;
		 arr=new int[size];
		 top=-1;
	}
	
	public void push( int data) {
		if(!isFull()) {
			top++;
			arr[top]=data;
			System.out.print("\n oush in item: "+arr[top]);
		}
	}

	public int pull() {	
		if(!checkEmpty()) {
			int topfinal=top;
			top--;	
			System.out.print("\n pull out item: "+arr[topfinal]);
			return arr[topfinal]	;
		}
		return -1;
	}
	
	boolean checkEmpty() {
		
		return arr.length==0?true:false;
	}
	
	boolean isFull() {
		if(arr.length-1==size)
			return true;
		else return false;
	}
	
	
	
	
}
