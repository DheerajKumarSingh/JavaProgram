package queue;

public class QueueUsingArray {
	
	int front; // manage remove item
	int rear; // manage add item
	int[] arr;
	int currentSize=0;
	
 public QueueUsingArray(int capacity) {
		// TODO Auto-generated constructor stub
		arr=new int[capacity];
		front=-1;
		rear=-1;
	}
 
 // only operation with rear
 public int enqueue(int data) {
	 if(!isFullSize()) {
		rear++;
		arr[rear]=data;
		currentSize ++;
		// manage item if we adding first element suppose we enqueue multiple
		// element then we dequeue the element so we have to set rear=0 
		if(rear==arr.length-1) {
			rear=0;
		}
		System.out.println("enqueue element::"+arr[rear]);
	    return arr[rear];
	 }
	 return -1;
	 
 }
 
 // only operation with front
 public int dequeue() {
	 if(!isEmpty()) {
		 front++;
		 // check if last element dequeue then we have to set front=0 so
		 if(front==arr.length-1) {
			 front=0;
		 }
		 currentSize --;
		 System.out.println("dequeue element::"+arr[front]);
		 return arr[front];
	 }
	 return -1;
 }

private boolean isEmpty() {
	// TODO Auto-generated method stub
	return currentSize==0;
}

private boolean isFullSize() {
	// TODO Auto-generated method stub
	return (currentSize==arr.length-1);
}

}
