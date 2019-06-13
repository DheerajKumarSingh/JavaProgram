package ds.linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseLinkedList reverseLinkedList=new ReverseLinkedList();
		reverseLinkedList.insertLast(1);
		reverseLinkedList.insertLast(3);
		reverseLinkedList.insertLast(23);
		reverseLinkedList.insertLast(1);
		reverseLinkedList.insertLast(21);
		reverseLinkedList.traverseData();
        reverseLinkedList.reverseData();
        
        reverseLinkedList.traverseData();
	}
	
	private void reverseData() {
		
		Node prevNode=null;
		Node currentNode=head;
		Node nextNode=null;
		while(currentNode !=null) {
		System.out.print("data is :"+currentNode.data+"\n");
		
			nextNode=currentNode.next;
			//
			currentNode.next=prevNode;
			
			prevNode=currentNode;
			currentNode=nextNode;
		}
	
		// swap both
		
		
		
		
		
		
	}

	Node head;
	Node tail;
	
	void insertLast(int data) {
		
		Node newNode=new Node();
		newNode.data=data;
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			
			Node temp=tail;
			while(temp.next!=null) {
				temp=temp.next;
			}
			
			temp.next=newNode;
			tail=newNode;
		}
		
		}
	void traverseData()
	{
		Node temp=head;
		while(temp!=null) {
			System.out.print("inserted list data : "+temp.data+"\n");
			temp=temp.next;
		}
		
	}
	
	
class Node{
	
	Node next;
	int data;
}

}
