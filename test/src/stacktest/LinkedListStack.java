package stacktest;

public class LinkedListStack {
	
	Node head;
	public LinkedListStack() {
		// TODO Auto-generated constructor stub
		head=null;
	}
	
	 class Node{
		Node next;
		int value;
	}
	
	
	public void push(int data) {	
		Node oldHead=head;
		Node node=new Node();
		node.value=data;
		
		head=node;
		head.next=oldHead;
		System.out.print("\n push value :"+data);
		
	}
	
	
	public void pull() {
		//  
		int value=head.value;
		head=head.next;
		System.out.print("\npop out value :"+value);
		
	}
}
