package LinkedList.java;

public class SinglyLinkedList {
	Node head;
	SinglyLinkedList(){
		head = null;
	}
	 void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	 void insertAtEnd(int data) {
		 Node newNode = new Node(data);
		 if(head== null) {
			 head = newNode;
			 return;
		 }
		 Node temp = head;
		 while(temp.next!=null) {
			 temp =temp.next;
		 }
		 temp.next = newNode;
	 }
	 void deleteFromBeginning(){
		 if(head==null) {
		 System.out.println("List is empty");
		 return;
	 }
		 head = head.next; 
		 
	 }
     void deleteFromBeginning() {
    	 if(head==null) {
    		 System.out.println("List is empty");
    		 return;
    	 }
    	 if(head.next==null) {
    		 head =null;
    		 return;
    	 }
    	 Node temp = head;
    	 while(temp.next.next!=null) {
    		 temp =temp.next;
    	 }
    	 temp.next =null;
     }
     boolean search(int key) {
    	 Node temp = head;
    	 while(temp !=null) {
    		 if(temp.data ==key) {
    			 return true;
    		 }
    		 temp =temp.next;
    		 
    	 }
    	 return false;
     }
     void display() {
    	 Node temp = head;
    	 while (temp!=null) {
    		 System.out.print(temp.data + "-");
    		 temp =temp.next;
    	 }
    	 System.out.println("null");
     }
	
     }




