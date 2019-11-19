package queue;

public class CircularQueueUsingArray {

	
	int capacity;
	int front,rear;
	int customsize=0;
	
	int[] circular_arr;
	
	public CircularQueueUsingArray(int capacity) {
		circular_arr=new int[capacity];
		front=-1;
		rear=-1;
	}
	
	
	public void enqueue(int data) {
		
		
		if(!isFull()) {
		// means our circular queue is empty
			rear++;
	
			rear=(rear+1)%circular_arr.length-1;
			circular_arr[rear]=data;
				
			// in circular queue no need to set last element here
			
			/*
			 * if(rear==circular_arr.length-1) { rear=0; }
			 */
		 customsize++;
		 System.out.println(" : enqueue item is : "+data);
		}		
		
	}
	
	
public void dequeue() {
		
	if(!isEmpty()) {
		front++;
		front=(front+1)%circular_arr.length-1;
		int data=circular_arr[front];
		
		// in circular queue no need to set last element here
		
			/*
			 * if(front==circular_arr.length-1) { front=0; }
			 */
		customsize--;
		System.out.println(" : dequeue item is : "+data);
	}
	}


	/*
	 * void displayData() { int data=front; do{
	 * System.out.println(""+circular_arr[data]); data++; } while (front!=data); }
	 */
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return customsize==0;
	}


	private boolean isFull() {
		// TODO Auto-generated method stub
		return (customsize==circular_arr.length-1);
	}

}
