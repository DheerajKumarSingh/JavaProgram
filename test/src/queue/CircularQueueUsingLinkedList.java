package queue;
public class CircularQueueUsingLinkedList {
	
	Node front,rear;
	public CircularQueueUsingLinkedList() {
		
		front=rear=null;
	}
	
	
	public void enqueue(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		
		if(front==null) {// for first element
			front=rear=newNode;
		}
		Node temp=rear;
		rear.next=newNode;
		newNode=temp;
		
		rear=rear.next;
		rear.next=front;
		System.out.println("::inserted item::"+data);
	}
	
	
	public void dequeue() {
		
		Node temp=front;
		// check if circular queue is empty
		if(front==null) {
			System.out.println("::: System is empty here :::");
			return;
		}
		// circular queue having single queue only
		else if(front==rear) {
			front=rear=null;
		}
		
		else {
			front=front.next;
			rear.next=front;
		}
		System.out.println("::deleted item::"+temp.data);
	}
	
	public void display() {
		System.out.println("data in circular queue is:");
		Node node=front;
		do {
			System.out.println(""+node.data);
			node=node.next;
		}
		while (front!=node); 
	}
	
	static class Node{
		int data;
		Node next;
	}

}
