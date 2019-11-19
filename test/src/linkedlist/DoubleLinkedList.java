package linkedlist;

public class DoubleLinkedList {
	
   Node head;
	
	public DoubleLinkedList() {
		// TODO Auto-generated constructor stub
		head=null;
	}

	
	/*************************************/
	
	void insertNewNode(int data) {
		Node newNode=createNode(data);
		if(head==null) {
			head=newNode;
		}
		else {
			// traverse upto last node then inserted
			Node currentNode=head;
			
			while(currentNode.next!=null) {
				currentNode=currentNode.next;
			}
			currentNode.next=newNode;
			newNode.prev=currentNode;
		}
	}
	
	void deleteEndNode() {
		
		Node deletedNode=head;
		while(deletedNode.next.next!=null) {
			deletedNode=deletedNode.next;
		}
		System.out.println("deleted nodes :"+deletedNode.next.data);
		deletedNode.next=null;
		
	}
	
	/**************************************/
	
	
	void insertFirst(int data) {
		
		Node newNode=createNode(data);
		Node temp=head;
		head=newNode;
		newNode.next=temp;
		
		System.out.println("first index item inserted"+data);
		
	}
	
   void deletedFirst() {
	   System.out.println("first index deleted"+head.data);
	   head=head.next;
	   head.prev=null;
   }
   
   /*******************************************/
   
   
   void insertAfter(int data,int newData) {
	   
	   Node currentNode=head;
	   while(currentNode.data!=data) {
		   currentNode=currentNode.next;
	   }
	   
	   System.out.println("currentNode"+currentNode.data);
	 
	   Node newNode=createNode(newData);
	   
	   Node temp=currentNode.next; // copy prev node here
	   
	   currentNode.next=newNode;
	   newNode.prev=currentNode;
	   newNode.next=temp;
	   System.out.println("new item inserted after"+data +" is"+newData);	   
	   
   }
   
   void deleteAfter(int data) {
	   
	   Node currentNode=head;
	   while(currentNode.data!=data) {
		   currentNode=currentNode.next;
	   }
	   currentNode.next=currentNode.next.next;
	   currentNode.next.prev=currentNode;
	   System.out.println("deleted item  after"+data );
	   
	   
	   
   }
	
	
	void displayNode() {
		Node temp=head;
		while(temp!=null) {
			System.out.println("item data is :"+temp.data);
			temp=temp.next;
		}
	}
	
	Node createNode(int data) {
		Node node=new Node();
		node.data=data;
		node.prev=null;
		node.next=null;
		return node;
	}
	
	static class Node{
		Node next;
		Node prev;
		int data;
	}
}
