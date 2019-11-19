package ds.linkedlist;

public class DoubleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
		doubleLinkedList.insertFirst(1);
		doubleLinkedList.insertFirst(2);
		doubleLinkedList.insertFirst(9);
		doubleLinkedList.insertFirst(4);
	//	doubleLinkedList.insertLast(199);
		//doubleLinkedList.deleteFirst();
		doubleLinkedList.deleteAfter(9);
		doubleLinkedList.traverse();
	}
	
	
	void deleteAfter(int data) {
		
		Node node=new Node();
		node.data=data;
		
		Node temp=head;
		
		while(temp.next!=null) {
			if(temp.data==node.data) {
				break;
			}
			temp=temp.next;
		}
		
		if(temp.next!=null)
		temp.next.next.prev=temp;
		temp.next=temp.next.next;
		
	}
	
	void deleteLast() {
		tail=tail.prev;
		tail.next=null;
	}
	
	void deleteFirst(){
		if(head==null) {
			return;
		}
		head=head.next;
		head.prev=null;
	}
	
	void insertLast(int data) {
		Node newNode=new Node();
		newNode.data=data;
		if(tail!=null) {
		tail.next=newNode;
		}
		tail=newNode;
		if(null==head) {
			head=newNode;
		}
	}
	
	
	
	
	Node head;
	Node tail;
	
	void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=head;
		newNode.prev=null;
		
		if(head!=null)
		{
			head.prev=newNode;
		}
	
		head=newNode;
		
		if(tail==null) {
			tail=newNode;
		}
	}
	
	
	
	void traverse()
	{
		Node temp=head;
		while(temp.next!=null) {
			System.out.print("inserted data"+temp.data+"\n");
			temp=temp.next;
		}
	}
	
	
	
	
	
	
	class Node
	{
		
		Node prev;
		Node next;
		int data;
		
	}

}
