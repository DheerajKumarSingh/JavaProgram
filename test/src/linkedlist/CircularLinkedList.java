package linkedlist;

public class CircularLinkedList {
	
	Node head;
	
	public CircularLinkedList() {
		head=null;
    }
	
	void display() {
		System.out.println(" ************************* ");
		Node temp=head;
		do{
			 System.out.println("data item: "+temp.data);
			 temp=temp.next;
		}
		while(temp!=head);
	}
	
	
	/*************************************************/
	
	void insertAtEndNode(int data)
	{
		Node newNode=createNewNode(data);
		if(head==null) {
			head=newNode;
			newNode.next=head;
		}
		else {
			// find last node in circularLinkedList
			Node lastNode=head;
			while(lastNode.next!=head) {
				lastNode=lastNode.next;
			 }
		    Node temp=lastNode.next;
			lastNode.next=newNode;
			newNode.next=temp;
		}
		System.out.println("data inserted : "+data);
	}
	
	// deleted at end
	
	void deleteNodeEnd() {
		// reach just prev node of deleted node
		Node temp=head;
		while(temp.next.next!=head) {
			temp=temp.next;    }
		System.out.println("last deleted node"+temp.next.data);
		temp.next=head;
	}
	
	/***********************************************/
	
	void insertAtBegNode(int data) {
		
		Node newNode=createNewNode(data);
		
		// last node found to filled lastnode next to head releation here
		Node lastNode=head;
		while (lastNode.next!=head) {
			lastNode=lastNode.next;
		}
		System.out.println("lastNode "+lastNode.data);
		
		Node temp=head;
		head=newNode;
		newNode.next=temp;
		lastNode.next=newNode;
		 System.out.println("new item inserted at beg "+data);
	}
	
	
	void deleteLastNodeAtBegining() {
		Node temp=head;
		Node lastNode=head;
		while (lastNode.next!=head) {
			lastNode=lastNode.next;
		}
		System.out.println(" bigin node deleted :"+temp.data);
		head=head.next;
		lastNode.next=head;
	}
	
	/*******************************************/
	
	void addNodeAfter(int data, int newData) {
		
		System.out.print("add new  node after"+data+"is:"+newData);
		
		Node newNode=createNewNode(newData);
		
		Node currentNode=head;
		
		while(currentNode.data!=data) {
			currentNode=currentNode.next;
		}
		Node temp=currentNode.next;
		currentNode.next=newNode;
		newNode.next=temp;	
	}
	
	
	void deleteNodeAfter(int data) {
	  Node currentNode=head;	
		while(currentNode.data!=data) {
			currentNode=currentNode.next;
		}
		System.out.print("after delete item is"+currentNode.next.data);
		currentNode.next=currentNode.next.next;
	}
	
	Node createNewNode(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		return newNode;
	}
	
	
	static class Node{
		Node next;
		int data;
	}
}
