package ds.linkedlist;
public class SingleLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkList singleLinkList=new SingleLinkList();
		singleLinkList.insert(1);	
		singleLinkList.insert(5);	
		singleLinkList.insert(11);	
		singleLinkList.insert(3);
		
		//singleLinkList.deleteFront();
	//	singleLinkList.insertFirst(99);
		singleLinkList.traveseNode();
		/*
		 * Node node=new Node(); node.data=5; singleLinkList.deleteAfter(node);
		 */
		singleLinkList.insertLast(198);
		singleLinkList.traveseNode();
	}
	
	
	
	void insertLast(int data) {
		
		Node newNode=new Node();
		newNode.data=192;
		
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	
	
	void deleteAfter(Node after) {
		Node temp=head;
		while(temp!=null && temp.next!=null) {
			temp=temp.next;
		    if(temp.data==after.data) {
		     break;
		    }
		}
		if(temp.next!=null) {
			temp.next=temp.next.next;
		}
	}
	
	void insertFirst(int data)
	{
		Node newNode=new Node();
		newNode.data=data;
		
		Node temp=head;
		head=newNode;
		newNode.next=temp;
	}
		
	
	
	void deleteFront() {
		if(head==null) {
			return;
		}
		Node temp=head;
		head=temp.next;
		if(head==null) {
		temp=null;
		tail=null;
		}
	}
	
	Node head;
	Node tail;
	void insert(int data){
		Node newNode=new Node();
		newNode.data=data;
		if(null==head) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	void traveseNode()
	{
		Node temp=head;
		while(true) {
			if(temp==null) {
				break;
			}
			System.out.print(" inserted data:"+temp.data+"\n");
			temp=temp.next;
		}
	}
}


class Node{
	
	int data;
	Node next;
	
	void displayNode()
	{
		System.out.print("{ "+data+" }");
	}
}
