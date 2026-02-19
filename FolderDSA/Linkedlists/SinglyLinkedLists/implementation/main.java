package LinkedList.java;

public class main {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList(); 
			list.display();
			list.insertAtBeginning(9);
			list.insertAtBeginning(8);
			list.insertAtBeginning(5);
			list.insertAtEnd(10);
			list.display();
			list.deleteFromBeginning();
			list.deleteFromBeginning();
			list.display();
			System.out.println("list.search(9)");
			System.out.println("list.search(10)");
	}

}
