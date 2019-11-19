package linkedlist;

import linkedlist.SinglyLinkedList.Node;

public class ReverseLinkedList {

	public ReverseLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		

	}
	
	
	
	public static class Node{
		Node next;
		int data;
	}
	
	

	Node createNode(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		return node;
	}


}
