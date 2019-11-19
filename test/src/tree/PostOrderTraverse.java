package tree;

import java.util.Stack;

public class PostOrderTraverse {
	
	public static void postOrderRecursive(Node node) {
		if(null==node) {
			return ;
		}
		postOrderRecursive(node.left);
		postOrderRecursive(node.right);
		System.out.println(node.data);
	}

	public static void PostOrderTraverse(Node node) {
		// TODO Auto-generated constructor stub
		
		Stack<Node> stack=new Stack<Node>();
		stack.push(node);
		
		while(!stack.empty()) {
			
			Node currentNode=stack.peek();
			
			if(Node.isLeafNode(currentNode)) {
				Node mNode=stack.pop();
				System.out.println(mNode.data);
			}
			else {
				
				if(currentNode.right!=null) {
					stack.push(currentNode.right);
					currentNode.right=null;
				}
				
             if(currentNode.left!=null) {
					stack.push(currentNode.left);
					currentNode.left=null;
				}
			}
			
			
		}
				
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root=new Node();
		root.data=40;
		
		Node node20=new Node();
		node20.data=20;

		Node node60=new Node();
		node60.data=60;
		
		Node node10=new Node();
		node10.data=10;
		
		Node node30=new Node();
		node30.data=30;
		
		Node node50=new Node();
		node50.data=50;
		
		Node node70=new Node();
		node70.data=70;
		
		// prepare tree
		
		root.left=node20;
		root.right=node60;
		
		node20.left=node10;
		node20.right=node30;
		
		node60.left=node50;
		node60.right=node70;
		
		
		//postOrderRecursive(root);
		PostOrderTraverse(root);
		
	}
	

	
 public static class Node{
		Node left,right;
		int data;
		
		
		public static boolean isLeafNode(Node node) {
			
			return node.left==null ?node.right==null:false;
		}
	}
}
