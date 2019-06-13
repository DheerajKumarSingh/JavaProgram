package test.logical.datastructure;

import java.util.Stack;

import test.logical.datastructure.BinaryTree.TreeNode;

 class BinaryTreeWithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BinaryTree binaryTree=new BinaryTree();
		BinaryTree.TreeNode treeNode=new BinaryTree.TreeNode("1");
		
		binaryTree.root=treeNode;
		binaryTree.root.left=new BinaryTree.TreeNode("2");
		binaryTree.root.right=new BinaryTree.TreeNode("5");
				
		binaryTree.root.left.left=new BinaryTree.TreeNode("3");
		binaryTree.root.left.right=new BinaryTree.TreeNode("4");
		binaryTree.root.right.right=new BinaryTree.TreeNode("6");
		
		
		preOrderTraverse(treeNode);
		binaryTree.preOrderTraverseWithoutRecursion();
	
	
		/*	
		
		1
	  /  \
	2      5
  /  \       \
3	  4	       6
		
		*/
		
		
		// we have tree structure above now move for Pre-Order traverse here
		
		
		
	}

	private static void preOrderTraverse(TreeNode node) {
		// TODO Auto-generated method stub
		if(node==null) {
			return;
		}
		System.out.printf("%s ", node.data);
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
		
	}

	
}

//declare binary tree model 

 class BinaryTree
	{
		BinaryTree()
		{}
		
	 public static class TreeNode{
		  
		  TreeNode left,right;
		  String data;
		  
		  TreeNode(String value)
		  {
			  this.data=value;
			  left=right=null;
		  }
		  
		  boolean isLeafNode()
		  {
			return left==null ?right==null:false;
		  }
	  }
	 
	 TreeNode root;
	 
	/*
	 * there is tricky part in the middle of the algorithm, where you have to push
	 * right sub-tree before the left subtree, which is different from the recursive
	 * algorithm
	 * why we do is because when we want to visit the tree in order of node-left-right,
	 *  we push right node first and left node afterward,
	 *   so that in the next iteration when we pop() from Stack we get the left sub-tree.
	 */
	 
	 void preOrderTraverseWithoutRecursion()
		{
		 if(root==null) {
			 return;
		 }
			Stack<TreeNode> nodes=new Stack<TreeNode>();
			nodes.push(root);
			
			while(!nodes.isEmpty())
			{
				TreeNode current=nodes.pop();
				System.out.print(""+current.data);
				
				 if(current.right!=null) {
					 nodes.push(current.right);
				 }
				 if(current.left!=null) {
					 nodes.push(current.left);
				 }
			}
			
		}
	 
	 
	 
		
	}