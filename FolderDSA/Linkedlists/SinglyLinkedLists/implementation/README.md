Singly Linked List
This project implements a Singly Linked List in Java with basic operations for inserting, deleting, searching, and displaying nodes.

Features:
Insert at the beginning
Insert at the end
Delete from the beginning
Delete from the end
Search for a value in the list
Display all elements in the list

Purpose:
This program helps in understanding:
  Linked list data structures
  Node traversal in Java
  Basic list operations

PSEUDOCODE
insertAtBeginning
BEGIN 
INPUT data
CREATE newNode with data
SET newNode_next to head
SET head to newNode
END

insertAtEnd
BEGIN
INPUT data
CREATE newNode with data
IF head is null
  SET head to newNode
  STOP
SET temp to head
WHILE temp_next is NOT NULL
  SET temp to temp_next
SET temp_next to newNode
END

deleteFromBeginning
BEGIN
IF head is NULL:
 OUTPUT "List is empty"
 STOP
SET head to head.next
END

deleteFromEnd
BEGIN
IF head is NULL:
 OUTPUT "List is empty"
 STOP
IF head_next is NULL
 SET head to NULL
 STOP
SET temp to head
WHILE temp_next_next is NOT NULL
 SET temp to temp_next
SET temp_next to NULL
END

searchElement
BEGIN
INPUT key
SET temp to head
WHILE temp is NOT NULL
 IF temp_data equals key
  RETURN TRUE
 SET temp to temp_next
RETURN FALSE
END

displayList
BEGIN
SET temp to head
WHILE temp is NOT NULL
 OUTPUT temp_data
 SET temp to temp_next
OUTPUT "null"
END
