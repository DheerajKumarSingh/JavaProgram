package tree;
import java.util.Stack;

public class InOrderTraverse {

	public InOrderTraverse() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void inorderTraverseRecursive(Node node) {		
		
		if(node==null)
		return;
		
		inorderTraverseRecursive(node.left);
		System.out.println(node.data);
		inorderTraverseRecursive(node.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root=new Node();
		root.data=4;
		
		Node node1=new Node();
		node1.data=1;
		
		Node node2=new Node();
		node2.data=2;
		
		Node node3=new Node();
		node3.data=3;
		
		Node node4=new Node();
		node4.data=4;
		
		Node node5=new Node();
		node5.data=5;
		
		Node node6=new Node();
		node6.data=6;
		
		root.left=node2;
		root.right=node5;
		
		node2.left=node1;
		node2.right=node3;
		
		node5.right=node6;
		
		
	//	inorderTraverseRecursive(root);
		inOrderTraverseIterative(root);

	}
	
	
	public static void inOrderTraverseIterative(Node node) {
		
		Stack<Node> stack=new Stack<Node>();
		Node currentNode=node;
		
		while(!stack.empty() || currentNode!=null) {
			if(currentNode !=null) {
				stack.push(currentNode);
				currentNode=currentNode.left;
			}
			else {
				Node mNode= stack.pop();
				System.out.println(mNode.data);
				currentNode=mNode.right;
			}
			System.out.println("::current Node::"+currentNode);
			
		}		
	}
	
	public  static class Node{
		Node left;
		Node right;
		int data;
	}

}
