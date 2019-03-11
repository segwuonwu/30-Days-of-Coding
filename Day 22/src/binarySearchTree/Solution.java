package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class Solution {
	
	public static void levelOrder(Node root){
      //Write your code here
      Queue<Node> q = new LinkedList<Node>();
     
      if(root != null){
          q.add(root);
      }
      while(!q.isEmpty()) {
    	  Node removeNode = q.poll();
    	  System.out.print(removeNode.data + " ");
    	  
    	  if(removeNode.left != null) {
    		  q.add(removeNode.left);
    	  }
    	  if(removeNode.right != null) {
    		  q.add(removeNode.right);
    	  }
      }
    }
	
	public static int getHeight(Node root){
      //Write your code here
      if(root == null){
          return -1;
      }
      int leftDepth = getHeight(root.left)+1;
      int rightDepth = getHeight(root.right)+1;

      return (leftDepth > rightDepth ? leftDepth : rightDepth);
    }

	 public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println("The height of the tree is: "+ height);
        levelOrder(root);
        sc.close();
    }

}
