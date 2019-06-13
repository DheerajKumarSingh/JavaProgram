package test.logical.datastructure;

import java.util.Stack;

import test.logical.datastructure.BinaryTree2.TreeNode;

public class PostOrderTraverseBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree2 tree = new BinaryTree2();
		TreeNode root = new TreeNode("45");
		tree.root = root;
		tree.root.left = new TreeNode("25");
		tree.root.left.left = new TreeNode("15");
		tree.root.left.left.left = new TreeNode("5");

		tree.root.left.right = new TreeNode("35");
		tree.root.right = new TreeNode("55");
		tree.root.right.right = new TreeNode("65");
		tree.root.right.right.left = new TreeNode("77");
		tree.root.right.right.right = new TreeNode("88");

		
		
		/*
		      45
		     /   \ 
		   25     55
	   	 /   \     \
		15    35     65
		/    /  \ 
	   5    77   88
	   
	   
	   */
		
		postOrderTraverseRecursive(root);
		
	//	postOrderTraverse(root);
		

	}

	private static void postOrderTraverse(TreeNode root) {
		// TODO Auto-generated method stub
		
		Stack<TreeNode> nodes = new Stack<TreeNode>();
		nodes.push(root);

		while (!nodes.isEmpty()) {
			
		TreeNode current = nodes.peek();

		if (current.isLeafNode()) {
		TreeNode node = nodes.pop();
		System.out.printf("%s ", node.data);
		} else {

		if(current.right != null){
		nodes.push(current.right);
		current.right = null;
		}

		if(current.left != null){
		nodes.push(current.left);
		current.left = null;
		}
		}

		
		}

		
	}

	private static void postOrderTraverseRecursive(TreeNode root) {
		// TODO Auto-generated method stub
		
		if(root==null) {
			return ;
		}
		
		postOrderTraverse(root.left);
		postOrderTraverse(root.right);
		
		System.out.println(""+root.data);
		
	}

}


class BinaryTree2 {
	
	BinaryTree2()
	{
		
	}
	
   static class TreeNode{
	   TreeNode left,right;
	   String data;
	   TreeNode(String data)
	   {
		   this.data=data;
		   left=right=null;
	   }
	   
	   boolean isLeafNode(){
		   return left==null? right==null:false;
	   }
   }
   
   TreeNode root;
}




