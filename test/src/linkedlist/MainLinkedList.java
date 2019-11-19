package linkedlist;

public class MainLinkedList {

	public MainLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	singlyLinkedListCall();
		
		//doubleLinkedListCall();
		
		circularLinkedList();

	}

	private static void circularLinkedList() {
		// TODO Auto-generated method stub
		
		CircularLinkedList circularLinkedList=new CircularLinkedList();
		circularLinkedList.insertAtEndNode(10);
		circularLinkedList.insertAtEndNode(20);
		circularLinkedList.insertAtEndNode(30);
		circularLinkedList.display();
		circularLinkedList.deleteNodeEnd();
		circularLinkedList.display();
		
		circularLinkedList.insertAtBegNode(200);
		circularLinkedList.display();
		
		circularLinkedList.deleteLastNodeAtBegining();
		circularLinkedList.display();
		circularLinkedList.addNodeAfter(10, 400);
		circularLinkedList.display();
		
		circularLinkedList.deleteNodeAfter(10);
		circularLinkedList.display();
		
	}

	private static void doubleLinkedListCall() {
		// TODO Auto-generated method stub
		
		DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
		doubleLinkedList.insertNewNode(10);
		doubleLinkedList.insertNewNode(20);
		doubleLinkedList.insertNewNode(30);
		doubleLinkedList.insertNewNode(40);
		doubleLinkedList.displayNode();
		doubleLinkedList.deleteEndNode();
		doubleLinkedList.displayNode();
		doubleLinkedList.insertFirst(100);
		doubleLinkedList.displayNode();
		
		doubleLinkedList.deletedFirst();
		doubleLinkedList.displayNode();
		
		doubleLinkedList.insertAfter(10, 200);
		doubleLinkedList.displayNode();
		
		doubleLinkedList.deleteAfter(200);
		doubleLinkedList.displayNode();
		
	}

	private static void singlyLinkedListCall() {
		// TODO Auto-generated method stub
		
		SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
		singlyLinkedList.insertLastNode(10);
		singlyLinkedList.insertLastNode(20);
		singlyLinkedList.insertLastNode(30);
		singlyLinkedList.insertLastNode(40);
		singlyLinkedList.displayNode();
		
		singlyLinkedList.deleteLastNode();
		singlyLinkedList.displayNode();
		singlyLinkedList.insertFirst(50);
		singlyLinkedList.displayNode();
		singlyLinkedList.deleteFirst();
		singlyLinkedList.displayNode();
		
		singlyLinkedList.insertDataAfter(20, 100);
		singlyLinkedList.displayNode();
		singlyLinkedList.deleteDataAfter(20);
		singlyLinkedList.displayNode();
		
		
	}

}
