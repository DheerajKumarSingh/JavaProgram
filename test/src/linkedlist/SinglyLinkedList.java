package linkedlist;


public class SinglyLinkedList {
	
	Node head;
	
	public SinglyLinkedList() {
		head=null;
	}
	
	/********************************************/
	
	void insertLastNode(int data) {
		Node newNode=createNode(data);
		// check if list is empty 
		if(head==null) {
			head=newNode;
		}
		else {
			// reach to last node then insert
			Node currentNode=head;
			while(currentNode.next!=null) {
				currentNode=currentNode.next;
			}
			currentNode.next=newNode;
		}
		
		System.out.println(" :: inserted node in linkedList :: "+data);
	}
	
	void deleteLastNode() {
		Node deletedNode=head;
		
		while(deletedNode.next.next!=null) {
			deletedNode=deletedNode.next;
		}
		System.out.println(":: last node deleted form linked List :: "+deletedNode.next.data);
		deletedNode.next=null;
	}
	
	/********************************************************/
	
	void insertFirst(int data) {
		
		Node newNode=createNode(data);
		Node temp=head;
		head=newNode;
		newNode.next=temp;
		System.out.println(" :: insert node in linkedList :: "+data);
	}
	
	void deleteFirst() {
		
		int data=head.data;
		head=head.next;
		System.out.println(" :: delete first node in linkedList :: "+data);
	}
	
	
	/****************************************************/
	
	
	void insertDataAfter(int afterData,int insertedData ) {
		
		Node newNode=createNode(insertedData);
		Node currentNode=head;
		
		while(currentNode.data!=afterData) {
			currentNode=currentNode.next;
		}
		
		// inserted item 
        		
		Node temp=currentNode.next;
		currentNode.next=newNode;
		newNode.next=temp;
		System.out.println(" :: inserted item after 20 is:: "+insertedData);
	}
	
	
	void deleteDataAfter(int afterData) {
		
		Node currentNode=head;
		
		while(currentNode.data!=afterData) {
			currentNode=currentNode.next;
		}
		System.out.println(" :: delete item after 20 is:: "+currentNode.next.data);
		currentNode.next=currentNode.next.next;
		
		
	}
	
	/******************************************************/
	
	
		void displayNode() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(" :: item is linked List is :: "+temp.data);
			temp=temp.next;
		}
	}
	
	Node createNode(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		return node;
	}
	
	 class Node{
		Node next;
		int data;
	}

}
