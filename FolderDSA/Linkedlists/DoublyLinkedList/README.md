DoublyLinkedList
This program implements a Doubly Linked List that allows the following operations:
  Insert at the beginning – adds a new node at the start of the list.
  Insert at the end – adds a new node at the end of the list.
  Delete from beginning – removes the first node of the list.
  Delete from end – removes the last node of the list.
  Display forward – prints all elements of the list from head to tail.
  Each node has data, a pointer to the next node, and a pointer to the previous node.

PSEUDOCODE
BEGIN DOUBLY LINKED LIST
insertAtBeginning
INPUT data
CREATE newNode with data
IF head is not equal to NULL
 SET head_prev to newNode
END IF
SET newNode_next to head
SET head to newNode

insertAtEnd
INPUT data
CREATE newNode with data
IF head is equal to NULL
 SET head to newNode
 STOP
END IF
SET temp to head
WHILE temp_next is not equal NULL
 SET temp to temp_next
END WHILE
SET tempnext to newNode
SET newNode_prev to temp

deleteFromBeginning
IF head to NULL
 STOP
END IF
SET head to head_next
IF head is not equal NULL
 SET head_prev to NULL
END IF

deleteFromEnd
IF head to NULL
 STOP
END IF
IF head_next to NULL
 SET head to NULL
 STOP
END IF
SET temp to head
WHILE temp_next is not equal to NULL
 SET temp to temp_next
END WHILE
SET temp_prev_next to NULL

displayForward
SET temp to head
WHILE temp is not equal to NULL
 OUTPUT temp_data + "<->"
 SET temp to temp_next
END WHILE
OUTPUT "null"

END DOUBLY LINKED LIST
