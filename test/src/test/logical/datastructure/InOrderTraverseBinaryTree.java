package test.logical.datastructure;

import java.util.Stack;

import test.logical.datastructure.BinaryTree1.NoteTree;

class InOrderTraverseBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree1 binaryTree1=new BinaryTree1();
		
		BinaryTree1.NoteTree root=new NoteTree("4");
		binaryTree1.root=root;
		
		root.left=new NoteTree("2");
		root.left.left=new NoteTree("1");
		
		root.right=new NoteTree("5");
		root.right.right=new NoteTree("6");
		
		
	
	/*	tree data in above code is 
		4
	  /  \
     2    5
    / \    \
   1   3    6 
    
    */
		
		//inOrderTraverseRecursive(root);
		inOrderTraverse(root);
		
	}

	private static void inOrderTraverse(NoteTree root) {
		// TODO Auto-generated method stub
		
		if(null==root) {
			return;
		}
		
		Stack<NoteTree> stack=new Stack<NoteTree>();
		NoteTree currentNode=root;
		
		while(!stack.isEmpty() || currentNode!=null )
		{
			
			if(null!=currentNode) {
				stack.push(currentNode);
				currentNode=currentNode.left;
			}
			else {
				NoteTree localNode=stack.pop();
				System.out.print(""+localNode.data);
				currentNode=localNode.right;
			}
		}
	}

	private static void inOrderTraverseRecursive(NoteTree root) {
		if(root==null) {
			return;
		}
		inOrderTraverseRecursive(root.left);
		System.out.print(""+root.data);
		inOrderTraverseRecursive(root.right);
	
	}
	
	


}



 class BinaryTree1{
	 BinaryTree1()
	 {}
	 
	 NoteTree root;
	
 static class NoteTree{
		
		NoteTree left,right;
		String data;
		
		NoteTree(String data)
		{
			this.data=data;
			left=right=null;
		}
		
		boolean isLeafNode()
		{
			return left==null?right==null:false;
		}
		
		
	}
	
}
