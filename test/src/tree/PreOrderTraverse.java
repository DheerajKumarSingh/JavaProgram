package tree;

import java.util.Stack;

public class PreOrderTraverse {
	
	public static void preOrderTraverse(Node node) {
		
		if(node!=null) {
			System.out.print(" "+node.data);
			preOrderTraverse(node.leftNode);
			preOrderTraverse(node.rightNode);
		}
	}

	public static void main(String[] args) {
		
		Node rootNode =new Node();
		rootNode.data=40;
		
		Node node20=new Node();
		node20.data=20;
		
		Node node10=new Node();
		node10.data=10;
		
		Node node30=new Node();
		node30.data=30;
		
		Node node60=new Node();
		node60.data=60;
		
		Node node50=new Node();
		node50.data=50;
		
		Node node70=new Node();
		node70.data=70;
		
 /*************** insert node here *************/
 
		rootNode.leftNode=node20;
		rootNode.rightNode=node60;
 
		node20.leftNode=node10;
		node20.rightNode=node30;
 
		node60.leftNode=node50;
		node60.rightNode=node70;
		

		
		
//   so the tree is here for the same 
		
//	   40
//     / \
//	  20   60
//	  / \   / \  
//	 10  30 50  70
//	  	
//  	
		
		//preorderIter(rootNode);
		System.out.println(":::::::: pre order traverse here ::::::::");
		preorderIter(rootNode);

	}
	


 
public static void preorderIter(Node root) {
   
         if(root == null)
             return;
  
         Stack<Node> stack = new Stack<Node>();
         stack.push(root);
  
         while(!stack.empty()){
        	 
        	 System.out.println("::size f stack node "+stack.size());
           
        	 Node n = stack.pop();
             System.out.println(n.data);
  
             if(n.rightNode != null){
            	 System.out.println("::right node "+n.rightNode.data);
                 stack.push(n.rightNode);
             }
             
             if(n.leftNode != null){
            	 System.out.println("::left node "+n.leftNode.data);
                 stack.push(n.leftNode);
             }
         }
     }
 
	
	public static class Node{
		Node leftNode;
		Node rightNode;
		Node root;
		int data;
		

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return data;
		}
	}
}
