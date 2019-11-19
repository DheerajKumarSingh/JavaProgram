package queue;

public class QueueUsingLinkedList {
	
	Node front;
	Node rear;
	int customSize=0;
	
	QueueUsingLinkedList()
	{
		front=null;
		rear=null;
	}
	
	public void enqueue(int data) {
		
		// make new node 
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		 if (isEmpty()) // if first node adding then rear & front is same
		 {
		 this.front = this.rear=newNode;
		 }
		 else		  // add add value on rear and increase value of rear
		 {
			 Node tempNode = rear;
			 rear.next=newNode;
			 newNode=tempNode;
			 rear=rear.next;
		 }
		 customSize++;
		 System.out.println(data+ " added to the queue");
	}
	
	public int dequeue() {
		 int data = front.data; // take old value 
		 front = front.next;
		 if (isEmpty()) 
		 {
		 rear = null;
		 }
		 customSize--;
		 System.out.println(data+ " removed from the queue");
		 return data;
	}
	
	private boolean isEmpty() {
		return (customSize==0);
	}
	
	public class Node{
		Node next;
		int data;
	}

}
