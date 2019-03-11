package removeDuplicates;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
}

class Solution {
	
	public static Node removeDuplicates(Node head) {
        //Write your code here
        Node current = head;
        Node nextNode = head.next;

        while(nextNode != null){
            if(nextNode.data != current.data){
                current.next = nextNode;
                current = nextNode;
            }
            nextNode = nextNode.next;
        }

        current.next = null;
        
        return head;
    }
	
	public static Node insert(Node head, int val) {
		Node p = new Node(val);
		if(head == null) {
			head = p;
		}
		else if(head.next == null) {
			head.next = p;
		}else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = p;
		}
		
		return head;
	}
	
    public static void display(Node head) {
    	Node curr = head;
    	while(curr != null) {
    		System.out.print(curr.data + " ");
    		curr = curr.next;
    	}
    	System.out.println();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T --> 0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

        sc.close();
	}

}
