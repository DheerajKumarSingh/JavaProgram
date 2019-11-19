package queue;

public class QueueMainTest {

	public QueueMainTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//queueUsingArray();
		//queueUsingList();
		// circularQueueUsingLinkedList();
		
		// circularQueueUsingArray();
	}

	private static void circularQueueUsingArray() {
		// TODO Auto-generated method stub
		
		CircularQueueUsingArray circularQueueUsingArray=new CircularQueueUsingArray(5);
		circularQueueUsingArray.enqueue(5);
		circularQueueUsingArray.enqueue(10);
		circularQueueUsingArray.enqueue(15);
		circularQueueUsingArray.dequeue();
		circularQueueUsingArray.enqueue(20);
		circularQueueUsingArray.dequeue();
		
		
		
	}

	private static void circularQueueUsingLinkedList() {
		// TODO Auto-generated method stub
		
		
		CircularQueueUsingLinkedList circularQueueUsingLinkedList=
				new CircularQueueUsingLinkedList();
		
		circularQueueUsingLinkedList.enqueue(10);
		circularQueueUsingLinkedList.enqueue(20);
		circularQueueUsingLinkedList.dequeue();
		circularQueueUsingLinkedList.enqueue(30);
		circularQueueUsingLinkedList.enqueue(40);
		circularQueueUsingLinkedList.enqueue(50);
		circularQueueUsingLinkedList.enqueue(60);
		circularQueueUsingLinkedList.dequeue();
		circularQueueUsingLinkedList.display();
		circularQueueUsingLinkedList.dequeue();
		circularQueueUsingLinkedList.display();
		
		
	}

	private static void queueUsingList() {
		// TODO Auto-generated method stub
		QueueUsingLinkedList queue=new QueueUsingLinkedList();
		queue.enqueue(10);
		queue.dequeue();
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.dequeue();
		queue.enqueue(70);
		queue.dequeue();
		queue.dequeue();
		
		
	}

	private static void queueUsingArray() {
		// TODO Auto-generated method stub
		
		QueueUsingArray queue=new QueueUsingArray(5);
		queue.enqueue(30);
		queue.dequeue();
		queue.enqueue(10);
		queue.enqueue(70);
		queue.enqueue(50);
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
	}

}
