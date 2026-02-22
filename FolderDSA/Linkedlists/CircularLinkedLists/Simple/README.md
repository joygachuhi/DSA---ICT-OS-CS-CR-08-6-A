Description
This program implements a Circular Linked List that allows the following operations:
  Insert at the beginning – adds a new node at the start of the list while maintaining the circular structure.
  Insert at the end – adds a new node at the end of the list while maintaining the circular structure.
  Delete from beginning – removes the first node and adjusts the last node to point to the new head.
  Display list – prints all nodes starting from the head and stops when it loops back to the head.
Each node contains data and a pointer next to the next node. The last node points back to the head, forming a circular structure.

PSEUDOCODE
BEGIN CIRCULAR LINKED LIST
InsertAtBeginning
INPUT data
CREATE newNode with data
IF head to NULL
 SET newNode_next to newNode
 SET head to newNode
 STOP
END IF

SET temp to head
WHILE temp_next is not equal to head
 SET temp to temp_next
END WHILE

SET temp_next to newNode
SET newNode_next to head
SET head to newNode

insertAtEnd
INPUT data
CREATE newNode with data

IF head to NULL
 SET newNode_next to newNode
 SET head to newNode
 STOP
END IF

SET temp to head
WHILE temp_next is equal to head
 SET temp to temp_next
END WHILE

SET temp_next to newNode
SET newNode_next to head

deleteFromBeginning
IF head to NULL
 STOP
END IF

IF head_next to head
 SET head to NULL
 STOP
END IF

SET temp to head
WHILE temp_next is equal to head
 SET temp to temp_next
END WHILE

SET temp_next to head_next
SET head to head_next

displayList
IF head to NULL
 STOP
END IF

SET temp to head
DO
 OUTPUT temp_data + "<->"
 SET temp to temp_next
WHILE temp is equal to head
OUTPUT "Back to head"
END CIRCULAR LINKED LIST
