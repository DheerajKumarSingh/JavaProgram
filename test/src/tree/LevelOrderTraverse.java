package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraverse {
	
	
	
	public static void levelOrderTraverser(Node root) {
		
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Node node=queue.poll();
			System.out.println(node.data);
			if(node.left!=null) {
				queue.add(node.left);
			}
			if(node.right!=null) {
				queue.add(node.right);
			}
		}
		
		
		
	}

	

	public static void main(String[] args) {
		
		Node root =new Node();
		root.data=40;
		
		Node node10=new Node();
		node10.data=10;
		
		Node node20=new Node();
		node20.data=20;

		Node node30=new Node();
		node30.data=30;
		
		Node node40=new Node();
		node40.data=40;
		
		Node node50=new Node();
		node50.data=50;
		
		Node node60=new Node();
		node60.data=60;
		
		Node node70=new Node();
		node70.data=70;
		
		root.left=node20;
		root.right=node60;
		
		node20.left=node10;
		node20.right=node30;
		
		node60.left=node50;
		node60.right=node70;
		
		levelOrderTraverser(root);
	}
	
	public static class Node{
		Node left;
		Node right;
		int data;
	}

}
