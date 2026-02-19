package LinkedList.java;

public class CircularLinkedList {
	CNode head;
	CircularLinkedList(){
		this.head = null;
	}
	
	void insertAtBeginning(String data) {
		CNode newNode = new CNode(data);
		if(head == null) {
			newNode.next = newNode;
			head = newNode;
			return;
		}
		CNode temp = head;
		while(temp.next !=head) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.next = head;
		head = newNode;
	}
	
	void insertAtEnd(String data) {
		CNode newNode = new CNode(data);
		if(head == null) {
			newNode.next = newNode;
			head = newNode;
			return;
		}
		CNode temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.next = head;
	}
	
	void deleteFromBeginning() {
		if(head == null)return;
		if(head.next == head) {
			head = null;
			return;
		}
		CNode temp = head;
		while(temp.next !=head) {
		temp = temp.next;
	}
	    temp.next = head.next;
	    head = head.next;
}
	
	void display() {
		if(head == null)return;
		  CNode temp = head;
		do {
			System.out.println(temp.data + "<->");
			temp = temp.next;
		} while(temp !=head);
		System.out.println("Back to head");
		}
	}

